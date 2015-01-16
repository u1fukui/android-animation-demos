package com.u1fukui.androidanimationdemos.activity.transition;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.Slide;
import android.view.Window;

import com.u1fukui.androidanimationdemos.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragmentTransitionActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_transition);
        ButterKnife.inject(this);

        Fragment f = new Fragment();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            f.setEnterTransition(new Slide());
        }

        getFragmentManager().beginTransaction()
                .replace(R.id.frag_transition_container, f)
                .addToBackStack(null)
                .commit();
    }

    @OnClick(R.id.frag_transition_button)
    void execute() {
        Fragment f = new Fragment();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            f.setEnterTransition(new Slide());
        }

        getFragmentManager().beginTransaction()
                .replace(R.id.frag_transition_container, f)
                .addToBackStack(null)
                .commit();
    }
}
