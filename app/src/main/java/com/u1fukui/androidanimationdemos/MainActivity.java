package com.u1fukui.androidanimationdemos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.u1fukui.androidanimationdemos.propertyanim.LayoutTransitionActivity;
import com.u1fukui.androidanimationdemos.propertyanim.ValueAnimatorActivity;
import com.u1fukui.androidanimationdemos.viewanim.AllViewAnimationActivity;
import com.u1fukui.androidanimationdemos.viewanim.AnimationSetActivity;
import com.u1fukui.androidanimationdemos.viewanim.RotateAnimationActivity;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity
        implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(createListAdapter());
        listView.setOnItemClickListener(this);
    }

    private DemoItemListAdapter createListAdapter() {
        ArrayList<DemoItem> itemList = new ArrayList<DemoItem>();
        itemList.add(new DemoItem(AllViewAnimationActivity.class, "AlphaAnimation"));
        itemList.add(new DemoItem(RotateAnimationActivity.class, "RotateAnimation"));
        itemList.add(new DemoItem(AnimationSetActivity.class, "AnimationSet"));
        itemList.add(new DemoItem(ValueAnimatorActivity.class, "ValueAnimator"));
        itemList.add(new DemoItem(LayoutTransitionActivity.class, "LayoutTransition"));

        return new DemoItemListAdapter(this, itemList);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        DemoItem item = (DemoItem) parent.getItemAtPosition(position);
        if (item != null) {
            Intent intent = new Intent(this, item.getActivityClass());
            startActivity(intent);
        }
    }
}
