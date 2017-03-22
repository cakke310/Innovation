package com.innovation;

import android.app.Application;
import android.content.Context;

import com.innovation.di.component.DaggerAppComponent;
import com.innovation.di.module.AppModule;

/**
 * Created by c_xuwei-010 on 2017/3/22.
 */
public class AppApplication extends Application {

    private DaggerAppComponent mAppComponent;

    public static Application get(Context context){
        return (Application) context.getApplicationContext();
    }

    public DaggerAppComponent getAppComponent(){
        return mAppComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();
    }
}
