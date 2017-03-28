package com.innovation.di.module;


import android.app.ProgressDialog;
import android.content.Context;

import com.innovation.data.RecommendModel;
import com.innovation.data.http.ApiService;
import com.innovation.presenter.RecommendPresenter;
import com.innovation.presenter.contract.RecommendContract;
import com.innovation.ui.fragment.RecommendFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by c_xuwei-010 on 2017/3/22.
 */
@Module
public class RecommendModule {

    private RecommendContract.View mView;

    public RecommendModule(RecommendContract.View mView) {
        this.mView = mView;
    }

    @Provides
    public RecommendContract.Presenter providePresenter(RecommendContract.View view, RecommendModel recommendModel){
        return new RecommendPresenter(view,recommendModel);
    }

    @Provides
    public RecommendContract.View provideView(){
        return mView;
    }

    @Provides
    public RecommendModel provideModel(ApiService apiService){
        return new RecommendModel(apiService);
    }

    @Provides
    public ProgressDialog provideProgressDialog(RecommendContract.View view){
        return new ProgressDialog(((RecommendFragment)view).getActivity());
    }
}
