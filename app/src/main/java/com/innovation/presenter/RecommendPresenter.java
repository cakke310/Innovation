package com.innovation.presenter;

import com.innovation.R;
import com.innovation.bean.AppInfo;
import com.innovation.bean.BaseBean;
import com.innovation.bean.PageBean;
import com.innovation.common.rx.RxHttpResponseCompat;
import com.innovation.data.RecommendModel;
import com.innovation.presenter.contract.RecommendContract;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by c_xuwei-010 on 2017/3/21.
 */
public class RecommendPresenter extends BasePresenter<RecommendModel, RecommendContract.View> {

    @Inject
    public RecommendPresenter(RecommendModel recommendModel, RecommendContract.View view) {
        super(recommendModel, view);
    }

    public void requestDatas() {
        mView.showLoading();

//        mModel.getApps(new Callback<PageBean<AppInfo>>() {
//            @Override
//            public void onResponse(Call<PageBean<AppInfo>> call, Response<PageBean<AppInfo>> response) {
//                if(response!=null){
//                    mView.showResult(response.body().getDatas());
//                }
//                else {
//                    mView.showNodata();
//                }
//
//                mView.dismissLoading();
//            }
//
//            @Override
//            public void onFailure(Call<PageBean<AppInfo>> call, Throwable t) {
//                mView.dismissLoading();
//                mView.showError(t.getMessage());
//            }
//        });

//        mModel.getApps()
////                .subscribeOn(Schedulers.io())
////                .observeOn(AndroidSchedulers.mainThread())
//                .compose(RxHttpResponseCompat.<PageBean<AppInfo>>compatResult())
//                .subscribe(new Subscriber<PageBean<AppInfo>>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(PageBean<AppInfo> appInfoPageBean) {
//
//                    }
//                });
    }


}


