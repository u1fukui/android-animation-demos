package com.u1fukui.androiddemos.activity.ui.tab;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.u1fukui.androiddemos.R;

public class SamplePagerAdapter extends PagerAdapter {

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
        View view = mActivity.getLayoutInflater().inflate(R.layout.view_sliding_tab_content_item,
                container, false);
        container.addView(view);

        TextView title = (TextView) view.findViewById(R.id.sliding_tab_content_title);
        title.setText(String.valueOf(position + 1));

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}
