package com.and.lovelivesmatter.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.and.lovelivesmatter.LoveLivesMatterApp;

public class RobotoLightButton extends Button {

    public RobotoLightButton(Context context) {
        super(context);
        init();
    }

    public RobotoLightButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RobotoLightButton(Context context, AttributeSet attrs, int defStyle) {
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