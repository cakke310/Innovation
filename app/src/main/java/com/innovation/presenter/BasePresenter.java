package com.innovation.presenter;

import com.innovation.ui.BaseView;

/**
 * Created by c_xuwei-010 on 2017/3/21.
 */
public class BasePresenter<M,V extends BaseView> {
    protected M mModel;

    protected V mView;

    public BasePresenter(M m, V v) {
        this.mModel = m;
        this.mView = v;
    }
}
