package com.innovation.data;

import com.innovation.bean.AppInfo;
import com.innovation.bean.PageBean;
import com.innovation.data.http.ApiService;
import com.innovation.data.http.HttpManager;

import retrofit2.Callback;

/**
 * Created by c_xuwei-010 on 2017/3/21.
 */
public class RecommendModel {

    private ApiService mApiService;

    public RecommendModel(ApiService mApiService) {
        this.mApiService = mApiService;
    }

    public void getApps(Callback<PageBean<AppInfo>> callback){
//        HttpManager manager = new HttpManager();
//
//        ApiService apiService = manager.getRetrofit(manager.getOkHttpClient()).create(ApiService.class);

        mApiService.getApps("{'page':0}").enqueue(callback);
    }
}
