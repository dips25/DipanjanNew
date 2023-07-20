package com.example.mygithub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.mygithub.Activities.AddRepoActivity;
import com.example.mygithub.Adapters.MyRepoAdapter;
import com.example.mygithub.Api.Api;
import com.example.mygithub.Model.MyJson;
import com.example.mygithub.Model.MyOwnRepo;
import com.example.mygithub.ViewModel.MyGithubViewModel;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String rsaPublicKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOkHUl6cNJDwftFqOKP3N4q7Q6Qb0U71m9whuykF01Ti dbiswas14@gmail.com";
    private static final String rsaPrivateKey = "b3BlbnNzaC1rZXktdjEAAAAACmFlczI1Ni1jdHIAAAAGYmNyeXB0AAAAGAAAABCXS4k8xQ" +
            "XUbvivfgtn0zuaAAAAEAAAAAEAAAAzAAAAC3NzaC1lZDI1NTE5AAAAIOkHUl6cNJDwftFq" +
            "OKP3N4q7Q6Qb0U71m9whuykF01TiAAAAoL6huMiq5DSF43LFXE1H/Uh7lQ+nQxkinOVlzW" +
            "qXIEDwmI7ONX7+oL6V5nkHWp6UIJOGQV+UgjIi4dt6Nth8lylHiPTX8A7sDK8T71LMnoQF" +
            "t1CzNMZnhBf4E0JWCx8U6BEfuVUF7H0gisHBrN1ImetZbBOhuAN0IrqvqOoTttIUule3hS" +
            "Hnx8CLTP7UVqodwUlmQpcAVcnvK3ZcOscKN8Q=";

    MyGithubViewModel myGithubViewModel;

    List<MyOwnRepo> myOwnRepos = new ArrayList<>();
    MyRepoAdapter myRepoAdapter;

    RecyclerView mainRecycler;

    AppBarLayout actionbar;


    boolean isset = false;

    Observer<List<MyOwnRepo>> observer;

    EditText editusername;

    Toolbar toolbar;

    ImageView menu_icon;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("data" , MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("ownername" , "dips25");
        editor.apply();





        myGithubViewModel = new ViewModelProvider(MainActivity.this).get(MyGithubViewModel.class);

        mainRecycler = (RecyclerView) findViewById(R.id.main_recycler);
        mainRecycler.setLayoutManager(new GridLayoutManager(this , 2));
        myRepoAdapter = new MyRepoAdapter(this , myOwnRepos);
        myRepoAdapter.setHasStableIds(true);
        mainRecycler.setAdapter(myRepoAdapter);
        mainRecycler.setHasFixedSize(true);

        toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        menu_icon = (ImageView) findViewById(R.id.menuAdd);

        menu_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent1 = new Intent(MainActivity.this , AddRepoActivity.class);
                intent1.putExtra("ownername" , sharedPreferences.getString("ownername" , ""));
                startActivity(intent1);

            }
        });




        editusername = (EditText) findViewById(R.id.edit_username);

        editusername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                getRepos(s.toString());

               // setupObserver(s.toString());


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });





//        toolbar = findViewById(R.id.main_toolbar);
//        toolbar.setTitle("My Github");
//        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        setSupportActionBar(toolbar);

        //setupObserver();

    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    private void setupObserver(String s) {

        myGithubViewModel.getMyRepos(s).observe(MainActivity.this, new Observer<List<MyOwnRepo>>() {
            @Override
            public void onChanged(List<MyOwnRepo> myOwnRepoList) {

                for (MyOwnRepo myOwnRepo : myOwnRepoList) {

                    Log.d(MainActivity.class.getName(), "onChanged: " + myOwnRepo);

                    SharedPreferences sharedPreferences = getSharedPreferences("data" , MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("ownername" , myOwnRepo.toString().split("/")[0]);
                    editor.apply();
                    break;
                }

               myRepoAdapter.setData(myOwnRepoList);



            }




        });




    }


    private void getRepos(String s) {

        myOwnRepos.clear();

        RetroFitClient retroFitClient = RetroFitClient.getInstance();
        Api api = retroFitClient.getApi();

        api.getRepository(s).enqueue(new Callback<JsonArray>() {
            @Override
            public void onResponse(Call<JsonArray> call, Response<JsonArray> response) {

                if (response.isSuccessful()) {

                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

                    JsonArray jsonArray = response.body();

                    for (int i = 0; i < jsonArray.size(); i++) {

                        JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
                        Log.d(MainActivity.class.getName(), "onResponse: " + jsonObject.toString());
                        MyOwnRepo myOwnRepo = new Gson().fromJson(jsonObject.toString(), MyOwnRepo.class);
                        myOwnRepos.add(myOwnRepo);



                    }

                    myRepoAdapter.notifyDataSetChanged();
                } else {

                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<JsonArray> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Error:" + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });


    }




    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);


//        myGithubViewModel.getMyRepos().removeObserver(observer);
//
//        observer = new Observer<List<MyOwnRepo>>() {
//            @Override
//            public void onChanged(List<MyOwnRepo> myOwnRepoList) {
//
//                myRepoAdapter.setData(myOwnRepoList);
//
//            }
//        };
    }


}



