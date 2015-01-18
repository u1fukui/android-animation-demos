package com.u1fukui.androidanimationdemos.activity.transition;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Transition;
import android.view.Window;

import com.u1fukui.androidanimationdemos.R;

import butterknife.ButterKnife;

public class ActivityTransitionSecondActivity extends ActionBarActivity {

    public static final String EXTRA_TRANSITION_INDEX = "transition_index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int index = getIntent().getIntExtra(EXTRA_TRANSITION_INDEX, -1);
            Transition transition = ActivityTransitionActivity.getTransition(index);
            if (transition != null) {
                getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
                getWindow().setEnterTransition(transition);
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_transition_second);
        ButterKnife.inject(this);
    }
}
