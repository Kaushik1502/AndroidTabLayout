package com.and.lovelivesmatter;

import android.app.Application;
import android.graphics.Typeface;

import java.util.ArrayList;

public class LoveLivesMatterApp extends Application {

    public static LoveLivesMatterApp instance;
    private Typeface arapeyItalicFont;
    private Typeface arapeyRegularFont;
    private Typeface robotoLightFont;
    private Typeface robotoregularFont;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        extractArapeyItalic();
        extractArapeyRegular();
        extractRobotoLight();
        extractRobotoRegular();
    }

    public static LoveLivesMatterApp getAppContext(){
        return instance;
    }

    private void extractArapeyItalic() {
        arapeyItalicFont = Typeface.createFromAsset(getAssets(), "fonts/Arapey-Italic.ttf");
    }

    public Typeface getArapeyItalic() {
        if (arapeyItalicFont == null) {
            extractArapeyItalic();
        }
        return arapeyItalicFont;
    }

    private void extractArapeyRegular() {
        arapeyRegularFont = Typeface.createFromAsset(getAssets(), "fonts/Arapey-Regular.ttf");
    }

    public Typeface getArapeyRegular() {
        if (arapeyRegularFont == null) {
            extractArapeyRegular();
        }
        return arapeyRegularFont;
    }

    private void extractRobotoLight() {
        robotoLightFont = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
    }

    public Typeface getRobotoLight() {
        if (robotoLightFont == null) {
            extractRobotoLight();
        }
        return robotoLightFont;
    }

    private void extractRobotoRegular() {
        robotoregularFont = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
    }

    public Typeface getRobotoRegular() {
        if (robotoregularFont == null) {
            extractRobotoRegular();
        }
        return robotoregularFont;
    }
}
