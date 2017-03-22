package com.innovation.di.component;

import com.innovation.di.module.AppModule;
import com.innovation.di.module.HttpModule;

import dagger.Component;

/**
 * Created by c_xuwei-010 on 2017/3/22.
 */
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

}
