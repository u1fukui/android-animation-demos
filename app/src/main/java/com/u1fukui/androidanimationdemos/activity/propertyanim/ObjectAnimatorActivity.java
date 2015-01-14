package com.u1fukui.androidanimationdemos.activity.propertyanim;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.u1fukui.androidanimationdemos.R;
import com.u1fukui.androidanimationdemos.view.BgColorView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class ObjectAnimatorActivity extends ActionBarActivity {

    @InjectView(R.id.objectanim_bgcolor_view)
    BgColorView mBgColorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objectanm);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.objectanim_button)
    void execute() {
        ObjectAnimator anim = ObjectAnimator.ofInt(mBgColorView,
                "backgroundColorRed", mBgColorView.getBackgroundColorRed(), 255);
        anim.setDuration(3000);
        anim.start();
    }
}
