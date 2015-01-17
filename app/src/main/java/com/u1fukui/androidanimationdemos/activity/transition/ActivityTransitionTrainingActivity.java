package com.u1fukui.androidanimationdemos.activity.transition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Explode;
import android.view.Window;

import com.u1fukui.androidanimationdemos.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityTransitionTrainingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
            getWindow().setExitTransition(new Explode());
            getWindow().setEnterTransition(new Explode());
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_transition_training);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.activity_transition_button)
    void execute() {
        Intent intent = new Intent(this, ActivityTransitionTrainingActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            startActivity(intent,
                    ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        } else {
            startActivity(intent);
        }
    }
}
