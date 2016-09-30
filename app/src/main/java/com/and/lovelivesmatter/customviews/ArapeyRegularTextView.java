package com.and.lovelivesmatter.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.and.lovelivesmatter.LoveLivesMatterApp;

public class ArapeyRegularTextView extends TextView {

    public ArapeyRegularTextView(Context context) {
        super(context);
        init();
    }

    public ArapeyRegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ArapeyRegularTextView(Context context, AttributeSet attrs, int defStyle) {
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
