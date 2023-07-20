package com.example.mygithub.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mygithub.Model.MyOwnRepo;
import com.example.mygithub.Repo.Repo;

import java.util.ArrayList;
import java.util.List;

public class MyGithubViewModel extends ViewModel {

    Repo repo;

    public MyGithubViewModel() {

        repo = Repo.getInstance();

    }


    public LiveData<List<MyOwnRepo>> getMyRepos(String username) {

        return repo.getRepositories(username);
    }



}
