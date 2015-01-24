package com.u1fukui.androiddemos.activity.propertyanim;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ViewPropertyAnimatorActivity extends ActionBarActivity {

    @InjectView(R.id.view_prop_anim_image)
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_property_animator);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.view_prop_anim_button)
    void execute() {
        mImageView.animate()
                .translationX(400)
                .translationY(700)
                .rotationY(720)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .setDuration(1000);
    }
}
