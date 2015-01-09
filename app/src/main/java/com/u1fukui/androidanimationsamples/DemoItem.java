package com.u1fukui.androidanimationsamples;

public class DemoItem {

    private Class activityClass;

    private String displayName;

    public DemoItem(Class activityClass, String displayName) {
        this.activityClass = activityClass;
        this.displayName = displayName;
    }

    public Class getActivityClass() {
        return activityClass;
    }

    public String getDisplayName() {
        return displayName;
    }
}
