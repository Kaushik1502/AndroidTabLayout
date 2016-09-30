package com.and.lovelivesmatter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class InviteActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText firstNameEditTxt;
    private EditText lastNameEditTxt;
    private EditText locationEdtTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite);
        init();
    }

    private void init() {
        ImageView crossImgView = (ImageView) findViewById(R.id.crossImgView);
        firstNameEditTxt = (EditText) findViewById(R.id.firstNameEditTxt);
        lastNameEditTxt = (EditText) findViewById(R.id.lastNameEditTxt);
        locationEdtTxt = (EditText) findViewById(R.id.locationEdtTxt);
        Button inviteBtn = (Button) findViewById(R.id.inviteBtn);
        crossImgView.setOnClickListener(this);
        inviteBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.crossImgView:
                finish();
                break;
            case R.id.inviteBtn:
                openMainActivity();
                break;
        }
    }

    private void openMainActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
