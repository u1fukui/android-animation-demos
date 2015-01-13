package com.u1fukui.androidanimationdemos.viewanim;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.u1fukui.androidanimationdemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class AnimationSetActivity extends ActionBarActivity {

@InjectView(R.id.viewanim_image)
    ImageView mViewanimImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewanim_set);
        ButterKnife.inject(this);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.viewanim_button)
    void execute() {
        RotateAnimation rotate = new RotateAnimation(0, 720, 50, 25);
        ScaleAnimation scale = new ScaleAnimation(1, 0, 1, 0);
        TranslateAnimation translate = new TranslateAnimation(0, 600, 0, 600);

        AnimationSet set = new AnimationSet(true);
        set.addAnimation(rotate);
        set.addAnimation(scale);
        set.addAnimation(translate);

        set.setDuration(2000);
        mViewanimImage.startAnimation(set);
    }
}
