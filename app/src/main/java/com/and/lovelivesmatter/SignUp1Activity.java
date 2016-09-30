package com.and.lovelivesmatter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUp1Activity extends AppCompatActivity implements View.OnClickListener{

    private EditText emailEditTxt;
    private EditText passwordEditTxt;
    private EditText confirmPasswordEdtTxt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up1);
        init();
    }

    private void init() {
        ImageView crossImgView = (ImageView) findViewById(R.id.crossImgView);
        emailEditTxt = (EditText) findViewById(R.id.emailEditTxt);
        passwordEditTxt = (EditText) findViewById(R.id.passwordEditTxt);
        confirmPasswordEdtTxt = (EditText) findViewById(R.id.confirmPasswordEdtTxt);
        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        TextView signInTxtView = (TextView) findViewById(R.id.signInTxtView);

        crossImgView.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
        signInTxtView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.crossImgView:
                finish();
                break;
            case R.id.nextBtn:
                openSignUp2Activity();
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

    private void openSignUp2Activity() {
        Intent intent = new Intent(this,SignUp2Activity.class);
        startActivity(intent);
    }
}
