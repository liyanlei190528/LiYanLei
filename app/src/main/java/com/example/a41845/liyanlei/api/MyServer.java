package com.example.a41845.liyanlei.api;

import com.example.a41845.liyanlei.bean.RootBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyServer {

    public String url = "http://api.apiopen.top/";

    @GET("getJoke")
    Observable<RootBean> getdate();
}
