package com.innovation.ui.activity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;

import com.innovation.AppApplication;
import com.innovation.di.component.AppComponent;
import com.innovation.presenter.BasePresenter;
import com.mikepenz.iconics.context.IconicsLayoutInflater;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by c_xuwei-010 on 2017/3/29.
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    private Unbinder unbinder;

    private AppApplication mApplication;

    @Inject
    T mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(),new IconicsLayoutInflater(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(setLayout());

        unbinder = ButterKnife.bind(this);
        this.mApplication = (AppApplication) getApplication();
        setupActivityComponent(mApplication.getAppComponent());

        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder!=Unbinder.EMPTY){
            unbinder.unbind();
        }
    }

//    protected void startActivity(Class c){
//        this.startActivity(new Intent(this,c));
//    }

    public abstract int setLayout();

    public abstract void setupActivityComponent(AppComponent appComponent);

    public abstract void init();
}
