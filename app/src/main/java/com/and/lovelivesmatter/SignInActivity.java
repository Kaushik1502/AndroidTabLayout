package com.and.lovelivesmatter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText emailEditTxt;
    private EditText passwordEditTxt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        init();
    }

    private void init() {
        ImageView crossImgView = (ImageView) findViewById(R.id.crossImgView);
        emailEditTxt = (EditText) findViewById(R.id.emailEditTxt);
        passwordEditTxt = (EditText) findViewById(R.id.passwordEditTxt);
        Button signInBtn = (Button) findViewById(R.id.signInBtn);
        TextView forgotPasswordTxtView = (TextView) findViewById(R.id.forgotPasswordTxtView);

        crossImgView.setOnClickListener(this);
        signInBtn.setOnClickListener(this);
        forgotPasswordTxtView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.crossImgView:
                finish();
                break;
            case R.id.signInBtn:
                openInvitationActivity();
                break;
            case R.id.forgotPasswordTxtView:

                break;
        }
    }

    private void openInvitationActivity() {
        Intent intent = new Intent(this,InviteActivity.class);
        startActivity(intent);
    }
}
