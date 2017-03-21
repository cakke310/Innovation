package com.innovation.data;

import com.innovation.bean.AppInfo;
import com.innovation.bean.PageBean;
import com.innovation.http.ApiService;
import com.innovation.http.HttpManager;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
