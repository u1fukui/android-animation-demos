package com.u1fukui.androidanimationdemos.viewanim;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.u1fukui.androidanimationdemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class AllViewAnimationActivity extends ActionBarActivity {

    @InjectView(R.id.viewanim_image)
    ImageView mImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewanim_all);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.viewanim_button)
    public void execute() {
        startAlphaAnimation(mImageView);
    }

    private void startAlphaAnimation(View view) {
        float fromAlpha = 1f;
        float toAlpha = 0f;

        AlphaAnimation animation = new AlphaAnimation(fromAlpha, toAlpha);
        animation.setDuration(3000);
        view.startAnimation(animation);
    }

    private void startAlphaAnimationXml(View view) {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        view.startAnimation(anim);
    }
}
