package ru.samsung.itschool.mdev.myapplication.api;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.samsung.itschool.mdev.myapplication.model.Anekdot;

public interface AnekdotAPI {
    // BASE_URL = https://umorili.herokuapp.com
    // @GET /api/get
    // site=anekdot.ru
    // &
    // num=3
    // &
    // name=new%20anekdot

    @GET("/api/get")
    Call<ArrayList<Anekdot>> getAnekdot(@Query("site") String s,
                                        @Query("num") Integer n,
                                        @Query("name") String nm);

}
