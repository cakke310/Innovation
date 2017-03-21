package com.innovation.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.innovation.bean.FragmentInfo;
import com.innovation.ui.fragment.CategoryFragment;
import com.innovation.ui.fragment.GamesFragment;
import com.innovation.ui.fragment.RankingFragment;
import com.innovation.ui.fragment.RecommendFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c_xuwei-010 on 2017/3/16.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
   private List<FragmentInfo> mFragments = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        initFragments();
    }

    private void initFragments(){
        mFragments.add(new FragmentInfo("推荐",RecommendFragment.class));
        mFragments.add(new FragmentInfo("排行",RankingFragment.class));
        mFragments.add(new FragmentInfo("游戏",GamesFragment.class));
        mFragments.add(new FragmentInfo("分类",CategoryFragment.class));
    }

    @Override
    public Fragment getItem(int position) {
        try {
            return (Fragment)mFragments.get(position).getFragment().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragments.get(position).getTitle();
    }
}
