package com.innovation.presenter.contract;

import com.innovation.bean.AppInfo;
import com.innovation.presenter.BasePresenter;
import com.innovation.ui.BaseView;

import java.util.List;

/**
 * Created by c_xuwei-010 on 2017/3/21.
 */
public interface RecommendContract {

    interface View extends BaseView{


        void showNodata();
        void showError(String msg);

        void showResult(List<AppInfo> datas);

    }

    interface Presenter extends BasePresenter{
        public void requestDatas();
    }
}
