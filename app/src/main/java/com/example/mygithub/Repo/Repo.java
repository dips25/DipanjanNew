package com.example.mygithub.Repo;

import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.mygithub.Api.Api;
import com.example.mygithub.MainActivity;
import com.example.mygithub.Model.MyOwnRepo;
import com.example.mygithub.Model.Repository;
import com.example.mygithub.RetroFitClient;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repo {

    List<MyOwnRepo> myOwnRepos = new ArrayList<>();

    MutableLiveData<List<MyOwnRepo>> myOwnRepoMutableLiveData = new MutableLiveData<>();


    public static Repo repo;

    private Repo() {


    }


    public static Repo getInstance() {

        if (repo == null) {

            repo = new Repo();
            return repo;
        }

        return repo;


    }



    public MutableLiveData<List<MyOwnRepo>> getRepositories(String username) {



        RetroFitClient retroFitClient = RetroFitClient.getInstance();
        Api api = retroFitClient.getApi();

        api.getRepository(username).enqueue(new Callback<JsonArray>() {
            @Override
            public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {

                if (response.isSuccessful()) {

                    JsonArray jsonArray = response.body();

                    for (int i = 0; i < jsonArray.size(); i++) {

                        JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
                        MyOwnRepo myOwnRepo = new Gson().fromJson(jsonObject.toString(), MyOwnRepo.class);
                        myOwnRepos.add(myOwnRepo);
                    }

                    myOwnRepoMutableLiveData.postValue(myOwnRepos);


                }

            }

            @Override
            public void onFailure(Call<JsonArray> call, Throwable t) {

                //Toast.makeText(MainActivity.this, "Error:" + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

        return myOwnRepoMutableLiveData;





    }
}
