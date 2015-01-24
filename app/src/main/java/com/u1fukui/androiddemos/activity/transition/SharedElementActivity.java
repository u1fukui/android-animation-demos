package com.u1fukui.androiddemos.activity.transition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class SharedElementActivity extends ActionBarActivity {

    @InjectView(R.id.shared_photo1)
    ImageView mPhoto1View;

    @InjectView(R.id.shared_photo2)
    ImageView mPhoto2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.shared_button_one)
    void sharedOneElement() {
        Intent intent = new Intent(this, SharedElementSecondActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            startActivity(intent,
                    ActivityOptions.makeSceneTransitionAnimation(this,
                            mPhoto1View,
                            getString(R.string.shared_photo1)).toBundle());
        } else {
            startActivity(intent);
        }
    }

    @OnClick(R.id.shared_button_two)
    void sharedTwoElements() {
        Pair pair1 = new Pair<View, String>(mPhoto1View, getString(R.string.shared_photo1));
        Pair pair2 = new Pair<View, String>(mPhoto2View, getString(R.string.shared_photo2));

        Intent intent = new Intent(this, SharedElementSecondActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            startActivity(intent,
                    ActivityOptions.makeSceneTransitionAnimation(this, pair1, pair2).toBundle());
        } else {
            startActivity(intent);
        }
    }
}
