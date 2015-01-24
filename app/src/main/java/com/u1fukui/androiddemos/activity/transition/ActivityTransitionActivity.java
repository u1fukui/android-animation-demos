package com.u1fukui.androiddemos.activity.transition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.view.Gravity;
import android.widget.Spinner;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ActivityTransitionActivity extends ActionBarActivity {

    @InjectView(R.id.transition_spinner_exit)
    Spinner mExitSpinner;

    @InjectView(R.id.transition_spinner_enter)
    Spinner mEnterSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_transition);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.transition_button)
    void execute() {
        Intent intent = new Intent(this, ActivityTransitionSecondActivity.class);
        intent.putExtra(ActivityTransitionSecondActivity.EXTRA_TRANSITION_INDEX, mEnterSpinner.getSelectedItemPosition());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setExitTransition(getTransition(mExitSpinner.getSelectedItemPosition()));
            startActivity(intent,
                    ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        } else {
            startActivity(intent);
        }
    }

    public static Transition getTransition(int transitionTypeIndex) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            switch (transitionTypeIndex) {
                case 0:
                    return new Explode();
                case 1:
                    return new Fade();
                case 2: {
                    Slide slide = new Slide();
                    slide.setSlideEdge(Gravity.BOTTOM);
                    return slide;
                }
                case 3: {
                    Slide slide = new Slide();
                    slide.setSlideEdge(Gravity.TOP);
                    return slide;
                }
                case 4: {
                    Slide slide = new Slide();
                    slide.setSlideEdge(Gravity.RIGHT);
                    return slide;
                }
                case 5: {
                    Slide slide = new Slide();
                    slide.setSlideEdge(Gravity.LEFT);
                    return slide;
                }
            }
        }
        return null;
    }
}
