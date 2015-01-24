package com.u1fukui.androiddemos.activity.animation.propertyanim;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.LinearLayout;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class LayoutTransitionActivity extends ActionBarActivity {

    @InjectView(R.id.layout_transition_container)
    LinearLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_transition);
        ButterKnife.inject(this);

        mContainer.setLayoutTransition(new LayoutTransition());
    }

    @OnClick(R.id.layout_transition_button_add)
    public void add() {
        Button button = new Button(this);
        button.setText("Button " + mContainer.getChildCount());
        mContainer.addView(button);
    }

    @OnClick(R.id.layout_transition_button_remove)
    public void remove() {
        if (mContainer.getChildCount() > 0) {
            mContainer.removeViewAt(0);
        }
    }
}
