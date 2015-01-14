package com.u1fukui.androidanimationdemos.activity.viewanim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.u1fukui.androidanimationdemos.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class TransitionAnimationFirstActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_first);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.transition_activity_button)
    void execute() {
        Intent intent = new Intent(this, TransitionAnimationSecondActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_left_out);
    }
}
