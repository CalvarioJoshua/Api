package com.example.api.service;

import com.example.api.entity.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface RetrofitApiService {
    @GET("ticker/{id}")
    Call<Message> getMessageId(@Path("id") int id);

    @GET("ticker")
    Call<List<Message>> getMessagesUserId(@Query("id")int id);
}
