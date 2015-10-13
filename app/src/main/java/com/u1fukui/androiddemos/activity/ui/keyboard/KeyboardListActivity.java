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
        itemList.add(new DemoItem(NoFullscreenActivity.class, "android:imeOptions=\"flagNoFullscreen\""));
        itemList.add(new DemoItem(NoFullscreenRelativeLayoutActivity.class, "RelativeLayout"));
        itemList.add(new DemoItem(NoFullscreenFragmentActivity.class, "Fragment"));
        return new DemoItemListAdapter(this, itemList);
    }
}