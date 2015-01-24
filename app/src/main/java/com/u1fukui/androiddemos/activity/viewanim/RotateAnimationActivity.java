package com.u1fukui.androiddemos.activity.viewanim;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.WindowManager;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class RotateAnimationActivity extends ActionBarActivity {

    @InjectView(R.id.viewanim_image)
    ImageView mImageView;

    @InjectView(R.id.viewanim_rotate_from_degrees)
    EditText mFromDegreesView;

    @InjectView(R.id.viewanim_rotate_to_degrees)
    EditText mToDegreesView;

    @InjectView(R.id.viewanim_rotate_pivot_x_type)
    Spinner mPivotXTypeSpinner;

    @InjectView(R.id.viewanim_rotate_pivot_x_value)
    EditText mPivotXValueView;

    @InjectView(R.id.viewanim_rotate_pivot_y_type)
    Spinner mPivotYTypeSpinner;

    @InjectView(R.id.viewanim_rotate_pivot_y_value)
    EditText mPivotYValueView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewanim_rotate);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.viewanim_button)
    public void execute() {
        float fromDegrees = Float.valueOf(mFromDegreesView.getText().toString());
        float toDegrees = Float.valueOf(mToDegreesView.getText().toString());
        float pivotXValue = Float.valueOf(mPivotXValueView.getText().toString());
        float pivotYValue = Float.valueOf(mPivotYValueView.getText().toString());

        int pivotXType = mPivotXTypeSpinner.getSelectedItemPosition();
        int pivotYType = mPivotYTypeSpinner.getSelectedItemPosition();

        RotateAnimation animation = new RotateAnimation(
                fromDegrees,
                toDegrees,
                pivotXType,
                pivotXValue,
                pivotYType,
                pivotYValue);

        animation.setDuration(2000);
        mImageView.startAnimation(animation);
    }
}
