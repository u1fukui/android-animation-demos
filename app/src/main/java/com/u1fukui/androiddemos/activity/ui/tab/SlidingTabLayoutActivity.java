package com.u1fukui.androiddemos.activity.ui.tab;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.u1fukui.androiddemos.R;
import com.u1fukui.androiddemos.view.SlidingTabLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SlidingTabLayoutActivity extends ActionBarActivity {

    @InjectView(R.id.sliding_tabs)
    SlidingTabLayout mSlidingTabLayout;

    @InjectView(R.id.sliding_viewpager)
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_tab_layout);
        ButterKnife.inject(this);

        mViewPager.setAdapter(new SamplePagerAdapter(this));
        mSlidingTabLayout.setCustomTabView(R.layout.view_sliding_tab_item, R.id.sliding_tab_item_title);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
}
