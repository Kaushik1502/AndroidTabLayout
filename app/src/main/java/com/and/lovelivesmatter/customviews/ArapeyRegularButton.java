package com.and.lovelivesmatter.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.and.lovelivesmatter.LoveLivesMatterApp;

public class ArapeyRegularButton extends Button {

    public ArapeyRegularButton(Context context) {
        super(context);
        init();
    }

    public ArapeyRegularButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ArapeyRegularButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void init() {
        if (isInEditMode()){
            return;
        }
        setTypeface(LoveLivesMatterApp.getAppContext().getArapeyRegular());
    }
}
