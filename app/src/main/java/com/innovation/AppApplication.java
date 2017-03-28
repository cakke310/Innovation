package com.innovation;

import android.app.Application;
import android.content.Context;

import com.innovation.di.component.AppComponent;
import com.innovation.di.component.DaggerAppComponent;
import com.innovation.di.module.AppModule;
import com.innovation.di.module.HttpModule;

/**
 * Created by c_xuwei-010 on 2017/3/22.
 */
public class AppApplication extends Application {

    private AppComponent mAppComponent;

    public static Application get(Context context){
        return (Application) context.getApplicationContext();
    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this))
                .httpModule(new HttpModule()).build();

    }
}
