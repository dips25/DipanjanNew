package com.example.mygithub;

import com.example.mygithub.Api.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {

    public static RetroFitClient retroFitClient;
    public static Retrofit retrofit;

    public static RetroFitClient getInstance() {

        if (retroFitClient == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(Urls.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            return new RetroFitClient();

        }

        return retroFitClient;

    }

    public Api getApi(){

        return retrofit.create(Api.class);

    }


}
