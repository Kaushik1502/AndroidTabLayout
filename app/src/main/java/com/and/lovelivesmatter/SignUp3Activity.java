package com.and.lovelivesmatter;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUp3Activity extends AppCompatActivity implements View.OnClickListener{

    private FrameLayout monogamyFrameLayout;
    private ImageView monogamyTickImgView;
    private FrameLayout polygamyFrameLayout;
    private ImageView polygamyTickImgView;
    private FrameLayout engagementFrameLayout;
    private ImageView engagementTickImgView;
    private FrameLayout marriageFrameLayout;
    private ImageView marriageTickImgView;
    final int sdkVersion = android.os.Build.VERSION.SDK_INT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up3);
        init();
    }

    private void init() {
        ImageView crossImgView = (ImageView) findViewById(R.id.crossImgView);
        monogamyFrameLayout = (FrameLayout) findViewById(R.id.monogamyFrameLayout);
        monogamyTickImgView = (ImageView) findViewById(R.id.monogamyTickImgView);
        polygamyFrameLayout = (FrameLayout) findViewById(R.id.polygamyFrameLayout);
        polygamyTickImgView = (ImageView) findViewById(R.id.polygamyTickImgView);
        engagementFrameLayout = (FrameLayout) findViewById(R.id.engagementFrameLayout);
        engagementTickImgView = (ImageView) findViewById(R.id.engagementTickImgView);
        marriageFrameLayout = (FrameLayout) findViewById(R.id.marriageFrameLayout);
        marriageTickImgView = (ImageView) findViewById(R.id.marriageTickImgView);
        Button signUpBtn = (Button) findViewById(R.id.signUpBtn);
        TextView signInTxtView = (TextView) findViewById(R.id.signInTxtView);

        crossImgView.setOnClickListener(this);
        monogamyFrameLayout.setOnClickListener(this);
        polygamyFrameLayout.setOnClickListener(this);
        engagementFrameLayout.setOnClickListener(this);
        marriageFrameLayout.setOnClickListener(this);
        signUpBtn.setOnClickListener(this);
        signInTxtView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.crossImgView:
                finish();
                break;
            case R.id.monogamyFrameLayout:
                selectMonogamy();
                break;
            case R.id.polygamyFrameLayout:
                selectPolygamy();
                break;
            case R.id.engagementFrameLayout:
                selectEngagement();
                break;
            case R.id.marriageFrameLayout:
                selectMarriage();
                break;
            case R.id.signUpBtn:
                openInviteActivity();
                break;
            case R.id.signInTxtView:
                openSignInActivity();
                break;
        }
    }

    private void openInviteActivity() {
        Intent intent = new Intent(this,InviteActivity.class);
        startActivity(intent);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void selectMonogamy() {
        if(sdkVersion < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            monogamyFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_active));
            polygamyFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            engagementFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            marriageFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
        } else {
            monogamyFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_active));
            polygamyFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            engagementFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            marriageFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
        }

        monogamyTickImgView.setVisibility(View.VISIBLE);
        polygamyTickImgView.setVisibility(View.INVISIBLE);
        engagementTickImgView.setVisibility(View.INVISIBLE);
        marriageTickImgView.setVisibility(View.INVISIBLE);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void selectPolygamy() {
        if(sdkVersion < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            monogamyFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            polygamyFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_active));
            engagementFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            marriageFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
        } else {
            monogamyFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            polygamyFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_active));
            engagementFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            marriageFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
        }

        monogamyTickImgView.setVisibility(View.INVISIBLE);
        polygamyTickImgView.setVisibility(View.VISIBLE);
        engagementTickImgView.setVisibility(View.INVISIBLE);
        marriageTickImgView.setVisibility(View.INVISIBLE);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void selectEngagement() {
        if(sdkVersion < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            monogamyFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            polygamyFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            engagementFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_active));
            marriageFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
        } else {
            monogamyFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            polygamyFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            engagementFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_active));
            marriageFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
        }

        monogamyTickImgView.setVisibility(View.INVISIBLE);
        polygamyTickImgView.setVisibility(View.INVISIBLE);
        engagementTickImgView.setVisibility(View.VISIBLE);
        marriageTickImgView.setVisibility(View.INVISIBLE);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void selectMarriage() {
        if(sdkVersion < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            monogamyFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            polygamyFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            engagementFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            marriageFrameLayout.setBackgroundDrawable(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_active));
        } else {
            monogamyFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            polygamyFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            engagementFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_bg));
            marriageFrameLayout.setBackground(ContextCompat.
                    getDrawable(this, R.drawable.relationship_type_active));
        }

        monogamyTickImgView.setVisibility(View.INVISIBLE);
        polygamyTickImgView.setVisibility(View.INVISIBLE);
        engagementTickImgView.setVisibility(View.INVISIBLE);
        marriageTickImgView.setVisibility(View.VISIBLE);
    }

    private void openSignInActivity() {
        Intent intent = new Intent(this,SignInActivity.class);
        startActivity(intent);
    }
}
