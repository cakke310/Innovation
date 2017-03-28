package com.innovation.di.component;

import com.innovation.data.http.ApiService;
import com.innovation.di.module.AppModule;
import com.innovation.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by c_xuwei-010 on 2017/3/22.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    public ApiService getApiService();
}
