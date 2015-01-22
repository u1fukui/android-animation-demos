package com.u1fukui.androidanimationdemos.activity.viewanim;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import com.u1fukui.androidanimationdemos.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class TranslateAnimationActivity extends ActionBarActivity {


    @InjectView(R.id.translate_target_button)
    View mTargetButton;

    @InjectView(R.id.translate_time)
    TextView mTimeView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewanim_translate);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.translate_execute_button)
    void execute() {
        TranslateAnimation anim = new TranslateAnimation(0, 400, 0, 0);
        anim.setDuration(500);
        anim.setFillAfter(true);
        mTargetButton.startAnimation(anim);
    }

    @OnClick(R.id.translate_target_button)
    void showTime() {
        final DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        final Date date = new Date(System.currentTimeMillis());
        mTimeView.setText(df.format(date));
    }
}
