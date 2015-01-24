package com.u1fukui.androiddemos.activity.propertyanim;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.Spinner;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class InterpolatorActivity extends ActionBarActivity {

    @InjectView(R.id.interpolator_image)
    ImageView mImageView;

    @InjectView(R.id.interpolator_spinner)
    Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.interpolator_button)
    void execute() {

        Interpolator interpolator = new LinearInterpolator();
        int pos = mSpinner.getSelectedItemPosition();
        switch (pos) {
            case 0:
                interpolator = new LinearInterpolator();
                break;
            case 1:
                interpolator = new AccelerateDecelerateInterpolator();
                break;
            case 2:
                interpolator = new AccelerateInterpolator();
                break;
            case 3:
                interpolator = new DecelerateInterpolator();
                break;
            case 4:
                interpolator = new AnticipateInterpolator();
                break;
            case 5:
                interpolator = new AnticipateOvershootInterpolator();
                break;
            case 6:
                interpolator = new BounceInterpolator();
                break;
            case 7:
                interpolator = new CycleInterpolator(3);
                break;
            case 8:
                interpolator = new OvershootInterpolator();
                break;
        }

        ObjectAnimator anim = ObjectAnimator.ofFloat(mImageView, "translationY", 0, 600);
        anim.setDuration(500);
        anim.setInterpolator(interpolator);
        anim.start();
    }
}
