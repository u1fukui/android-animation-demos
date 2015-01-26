package com.u1fukui.androiddemos.activity.ui.tab;

import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;

import com.u1fukui.androiddemos.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class PagerTabStripActivity extends ActionBarActivity {

    @InjectView(R.id.pts_pager)
    ViewPager mViewPager;

    @InjectView(R.id.pts_strip)
    PagerTabStrip mStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_tab_strip);
        ButterKnife.inject(this);

        mStrip.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        mStrip.setTextColor(0xff9acd32);
        mStrip.setTextSpacing(50);
        mStrip.setNonPrimaryAlpha(0.3f);
        mStrip.setDrawFullUnderline(true);
        mStrip.setTabIndicatorColor(0xff9acd32);

        mViewPager.setAdapter(new SamplePagerAdapter(this));
    }


}
