package com.u1fukui.androiddemos.activity;

import com.u1fukui.androiddemos.DemoItem;
import com.u1fukui.androiddemos.DemoItemListAdapter;
import com.u1fukui.androiddemos.activity.animation.AnimationListActivity;

import java.util.ArrayList;

public class MainActivity extends BaseListActivity {

    @Override
    protected DemoItemListAdapter createListAdapter() {
        ArrayList<DemoItem> itemList = new ArrayList<DemoItem>();
        itemList.add(new DemoItem(AnimationListActivity.class, "Animation"));
        return new DemoItemListAdapter(this, itemList);
    }
}
