package com.u1fukui.androiddemos.activity.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.u1fukui.androiddemos.R;
import com.u1fukui.androiddemos.view.SlidingTabLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SlidingTabActivity extends ActionBarActivity {

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
        mSlidingTabLayout.setViewPager(mViewPager);
    }


    private static class SamplePagerAdapter extends PagerAdapter {

        private Activity mActivity;

        public SamplePagerAdapter(Activity activity) {
            mActivity = activity;
        }

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return o == view;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "Item " + (position + 1);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = mActivity.getLayoutInflater().inflate(R.layout.view_sliding_tab_item,
                    container, false);
            container.addView(view);

            TextView title = (TextView) view.findViewById(R.id.sliding_tab_item_title);
            title.setText(String.valueOf(position + 1));

            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

    }
}
