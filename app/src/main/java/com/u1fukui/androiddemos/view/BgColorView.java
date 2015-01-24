package com.u1fukui.androiddemos.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class BgColorView extends View {

    private int mRed = 0;
    private int mGreen = 127;
    private int mBlue = 127;

    public BgColorView(Context context) {
        this(context, null);
    }

    public BgColorView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BgColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setBackgroundColor(Color.rgb(mRed, mGreen, mBlue));
    }

    public void setBackgroundColorRed(int value) {
        if (value > 255) {
            value = 255;
        } else if (value < 0) {
            value = 0;
        }

        mRed = value;

        int color = Color.rgb(mRed, mGreen, mBlue);
        setBackgroundColor(color);
    }

    public int getBackgroundColorRed() {
        return mRed;
    }
}
