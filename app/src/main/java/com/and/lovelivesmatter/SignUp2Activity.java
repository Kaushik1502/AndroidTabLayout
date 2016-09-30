package com.and.lovelivesmatter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUp2Activity extends AppCompatActivity implements View.OnClickListener {

    private EditText firstNameEditTxt;
    private EditText lastNameEditTxt;
    private EditText locationEdtTxt;
    private TextView dobTxtView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        init();
    }

    private void init() {
        ImageView crossImgView = (ImageView) findViewById(R.id.crossImgView);
        firstNameEditTxt = (EditText) findViewById(R.id.firstNameEditTxt);
        lastNameEditTxt = (EditText) findViewById(R.id.lastNameEditTxt);
        locationEdtTxt = (EditText) findViewById(R.id.locationEdtTxt);
        Button selectGenderBtn = (Button) findViewById(R.id.selectGenderBtn);
        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        dobTxtView = (TextView) findViewById(R.id.dobTxtView);
        TextView signInTxtView = (TextView) findViewById(R.id.signInTxtView);

        crossImgView.setOnClickListener(this);
        selectGenderBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
        dobTxtView.setOnClickListener(this);
        signInTxtView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.crossImgView:
                finish();
                break;
            case R.id.selectGenderBtn:

                break;
            case R.id.nextBtn:
                openSignUp3Activity();
                break;
            case R.id.dobTxtView:

                break;
            case R.id.signInTxtView:
                openSignInActivity();
                break;
        }
    }

    private void openSignInActivity() {
        Intent intent = new Intent(this,SignInActivity.class);
        startActivity(intent);
    }

    private void openSignUp3Activity() {
        Intent intent = new Intent(this,SignUp3Activity.class);
        startActivity(intent);
    }
}
