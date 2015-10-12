package com.u1fukui.androiddemos.activity.ui.tab;

import com.u1fukui.androiddemos.DemoItem;
import com.u1fukui.androiddemos.DemoItemListAdapter;
import com.u1fukui.androiddemos.activity.BaseListActivity;

import java.util.ArrayList;

public class TabListActivity extends BaseListActivity {

    @Override
    protected DemoItemListAdapter createListAdapter() {
        ArrayList<DemoItem> itemList = new ArrayList<DemoItem>();
        itemList.add(new DemoItem(PagerTabStripActivity.class, "PagerTabStrip"));
        itemList.add(new DemoItem(SlidingTabLayoutActivity.class, "SlidingTabLayout"));
        return new DemoItemListAdapter(this, itemList);
    }
}
