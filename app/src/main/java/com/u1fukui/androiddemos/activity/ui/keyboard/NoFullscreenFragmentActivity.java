package com.u1fukui.androiddemos.activity.ui.keyboard;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;

public class NoFullscreenFragmentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_edit_text_fragment);
        ButterKnife.inject(this);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NoFullScreenFragment())
                .commit();
    }
}
