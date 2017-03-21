package com.innovation.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.innovation.R;
import com.innovation.bean.AppInfo;
import com.innovation.presenter.RecommendPresenter;
import com.innovation.presenter.contract.RecommendContract;
import com.innovation.ui.adapter.RecommendAppAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Ivan on 16/9/26.
 */

public class RecommendFragment extends Fragment implements RecommendContract.View{


    @BindView(R.id.recycle_view)
    RecyclerView mRecycleView;

    private RecommendAppAdapter mAdapter;
    private RecommendContract.Presenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_recomend, container, false);
        ButterKnife.bind(this, view);

        mPresenter = new RecommendPresenter(this);
        initData();

        return view;
    }

    private void initData() {
        mPresenter.requestDatas();
    }

    private void initRecyclerView(List<AppInfo> datas){
        mRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mAdapter = new RecommendAppAdapter(getActivity(),datas);
        mRecycleView.setAdapter(mAdapter);

    }


    @Override
    public void showNodata() {

    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void showResult(List<AppInfo> datas) {
        initRecyclerView(datas);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}
