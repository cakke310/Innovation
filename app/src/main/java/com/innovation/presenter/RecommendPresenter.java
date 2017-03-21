package com.innovation.presenter;

import com.innovation.bean.AppInfo;
import com.innovation.bean.PageBean;
import com.innovation.data.RecommendModel;
import com.innovation.presenter.contract.RecommendContract;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by c_xuwei-010 on 2017/3/21.
 */
public class RecommendPresenter implements RecommendContract.Presenter{
    private RecommendContract.View mView;
    private RecommendModel mModel;

    public RecommendPresenter(RecommendContract.View mView) {
        this.mView = mView;
        mModel = new RecommendModel();
    }

    @Override
    public void requestDatas() {
        mView.showLoading();

        mModel.getApps(new Callback<PageBean<AppInfo>>() {
            @Override
            public void onResponse(Call<PageBean<AppInfo>> call, Response<PageBean<AppInfo>> response) {
                if(response!=null){
                    mView.showResult(response.body().getDatas());
                }
                else {
                    mView.showNodata();
                }

                mView.dismissLoading();
            }

            @Override
            public void onFailure(Call<PageBean<AppInfo>> call, Throwable t) {
                mView.dismissLoading();
                mView.showError(t.getMessage());
            }
        });
    }
}
