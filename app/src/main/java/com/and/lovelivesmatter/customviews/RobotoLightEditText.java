package com.and.lovelivesmatter.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.and.lovelivesmatter.LoveLivesMatterApp;

public class RobotoLightEditText extends EditText {

    public RobotoLightEditText(Context context) {
        super(context);
        init();
    }

    public RobotoLightEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RobotoLightEditText(Context context, AttributeSet attrs, int defStyle) {
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