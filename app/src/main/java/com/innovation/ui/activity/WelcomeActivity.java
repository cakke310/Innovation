package com.innovation.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.eftimoff.androipathview.PathView;
import com.innovation.R;
import com.innovation.common.Constant;
import com.innovation.common.util.ACache;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by c_xuwei-010 on 2017/3/29.
 */
public class WelcomeActivity extends AppCompatActivity {

    @BindView(R.id.pathView)
    PathView mPathView;
    @BindView(R.id.activity_welcome)
    LinearLayout mActivityWelcome;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        mPathView.getPathAnimator()
                .delay(10).duration(2000)
                .listenerEnd(new PathView.AnimatorBuilder.ListenerEnd() {
                    @Override
                    public void onAnimationEnd() {
                        jump();
                    }
                })
                .start();
    }

    private void jump() {

        String isShowGuide = ACache.get(this).getAsString(Constant.IS_SHOW_GUIDE);

        if(null == isShowGuide){
            startActivity(new Intent(this,GuideActivity.class));
        }
        else {
            startActivity(new Intent(this,MainActivity.class));
        }

        this.finish();
    }
}
