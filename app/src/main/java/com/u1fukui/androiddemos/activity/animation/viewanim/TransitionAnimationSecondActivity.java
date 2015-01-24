package com.u1fukui.androiddemos.activity.animation.viewanim;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.u1fukui.androiddemos.R;

public class TransitionAnimationSecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_second);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_right_in, R.anim.slide_right_out);
    }
}
