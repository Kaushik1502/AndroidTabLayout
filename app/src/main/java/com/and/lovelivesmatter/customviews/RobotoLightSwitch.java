package com.and.lovelivesmatter.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Switch;

import com.and.lovelivesmatter.LoveLivesMatterApp;

public class RobotoLightSwitch extends Switch {

    public RobotoLightSwitch(Context context) {
        super(context);
        init();
    }

    public RobotoLightSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RobotoLightSwitch(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void init() {
        if (isInEditMode()){
            return;
        }
        setTypeface(LoveLivesMatterApp.getAppContext().getRobotoLight());
    }
}