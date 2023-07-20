package com.example.mygithub.Api;

import com.example.mygithub.Model.MyOwnRepo;
import com.example.mygithub.Model.Repository;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Api {

    @GET("/users/{USERNAME}/repos")
    @Headers("accept:*/*")
    Call<MyOwnRepo> getRepo(@Path("USERNAME") String username);

    @GET("/users/{USERNAME}/repos")
    @Headers("accept:*/*")
    Call<JsonArray> getRepository(@Path("USERNAME") String username);

    @POST("/user/repos")
    @Headers("accept:*/*")

    Call<MyOwnRepo> createRepo(@Header("Authorization") String token , @Body Repository repository);


}
