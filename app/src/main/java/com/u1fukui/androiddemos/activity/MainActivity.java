package com.u1fukui.androiddemos.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.u1fukui.androiddemos.DemoItem;
import com.u1fukui.androiddemos.DemoItemListAdapter;
import com.u1fukui.androiddemos.R;
import com.u1fukui.androiddemos.activity.propertyanim.InterpolatorActivity;
import com.u1fukui.androiddemos.activity.propertyanim.LayoutTransitionActivity;
import com.u1fukui.androiddemos.activity.propertyanim.ObjectAnimatorActivity;
import com.u1fukui.androiddemos.activity.propertyanim.ValueAnimatorActivity;
import com.u1fukui.androiddemos.activity.propertyanim.ViewPropertyAnimatorActivity;
import com.u1fukui.androiddemos.activity.transition.ActivityTransitionActivity;
import com.u1fukui.androiddemos.activity.transition.FragmentTransitionActivity;
import com.u1fukui.androiddemos.activity.transition.SharedElementActivity;
import com.u1fukui.androiddemos.activity.viewanim.AllViewAnimationActivity;
import com.u1fukui.androiddemos.activity.viewanim.AnimationSetActivity;
import com.u1fukui.androiddemos.activity.viewanim.RotateAnimationActivity;
import com.u1fukui.androiddemos.activity.viewanim.TransitionAnimationFirstActivity;
import com.u1fukui.androiddemos.activity.viewanim.TranslateAnimationActivity;

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
        itemList.add(new DemoItem(TransitionAnimationFirstActivity.class, "Transition"));
        itemList.add(new DemoItem(TranslateAnimationActivity.class, "TranslateAnimation"));
        itemList.add(new DemoItem(ValueAnimatorActivity.class, "ValueAnimator"));
        itemList.add(new DemoItem(ObjectAnimatorActivity.class, "ObjectAnimator"));
        itemList.add(new DemoItem(InterpolatorActivity.class, "Interpolator"));
        itemList.add(new DemoItem(ViewPropertyAnimatorActivity.class, "ViewPropertyAnimator"));
        itemList.add(new DemoItem(LayoutTransitionActivity.class, "LayoutTransition"));
        itemList.add(new DemoItem(ActivityTransitionActivity.class, "ActivityTransition"));
        itemList.add(new DemoItem(SharedElementActivity.class, "ActivityTransition shared element"));
        itemList.add(new DemoItem(FragmentTransitionActivity.class, "FragmentTransition"));
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
