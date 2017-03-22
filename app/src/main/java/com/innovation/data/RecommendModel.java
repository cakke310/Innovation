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

    public void getApps(Callback<PageBean<AppInfo>> callback){
        HttpManager manager = new HttpManager();

        ApiService apiService = manager.getRetrofit(manager.getOkHttpClient()).create(ApiService.class);

        apiService.getApps("{'page':0}").enqueue(callback);
    }
}
