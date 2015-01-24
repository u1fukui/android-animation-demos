package com.u1fukui.androiddemos.activity.animation;

import com.u1fukui.androiddemos.DemoItem;
import com.u1fukui.androiddemos.DemoItemListAdapter;
import com.u1fukui.androiddemos.activity.BaseListActivity;
import com.u1fukui.androiddemos.activity.animation.propertyanim.InterpolatorActivity;
import com.u1fukui.androiddemos.activity.animation.propertyanim.LayoutTransitionActivity;
import com.u1fukui.androiddemos.activity.animation.propertyanim.ObjectAnimatorActivity;
import com.u1fukui.androiddemos.activity.animation.propertyanim.ValueAnimatorActivity;
import com.u1fukui.androiddemos.activity.animation.propertyanim.ViewPropertyAnimatorActivity;
import com.u1fukui.androiddemos.activity.animation.transition.ActivityTransitionActivity;
import com.u1fukui.androiddemos.activity.animation.transition.FragmentTransitionActivity;
import com.u1fukui.androiddemos.activity.animation.transition.SharedElementActivity;
import com.u1fukui.androiddemos.activity.animation.viewanim.AllViewAnimationActivity;
import com.u1fukui.androiddemos.activity.animation.viewanim.AnimationSetActivity;
import com.u1fukui.androiddemos.activity.animation.viewanim.RotateAnimationActivity;
import com.u1fukui.androiddemos.activity.animation.viewanim.TransitionAnimationFirstActivity;
import com.u1fukui.androiddemos.activity.animation.viewanim.TranslateAnimationActivity;

import java.util.ArrayList;

public class AnimationListActivity extends BaseListActivity {

    @Override
    protected DemoItemListAdapter createListAdapter() {
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
}
