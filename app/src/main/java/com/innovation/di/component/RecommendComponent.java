package com.innovation.di.component;

import com.innovation.di.module.RecommendModule;
import com.innovation.ui.fragment.RecommendFragment;

import dagger.Component;

/**
 * Created by c_xuwei-010 on 2017/3/22.
 */
@Component(modules = RecommendModule.class)
public interface RecommendComponent {
    void inject(RecommendFragment fragment);
}
