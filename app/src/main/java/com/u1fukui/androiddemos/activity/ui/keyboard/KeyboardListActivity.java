package com.u1fukui.androiddemos.activity.ui.keyboard;

import com.u1fukui.androiddemos.DemoItem;
import com.u1fukui.androiddemos.DemoItemListAdapter;
import com.u1fukui.androiddemos.activity.BaseListActivity;

import java.util.ArrayList;

public class KeyboardListActivity extends BaseListActivity {

    @Override
    protected DemoItemListAdapter createListAdapter() {
        ArrayList<DemoItem> itemList = new ArrayList<DemoItem>();
        itemList.add(new DemoItem(DefaultKeyboardActivity.class, "Default"));
        itemList.add(new DemoItem(NoFullscreenKeyboardActivity.class, "android:imeOptions=\"flagNoFullscreen\""));
        return new DemoItemListAdapter(this, itemList);
    }
}