package com.and.lovelivesmatter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        init();
    }

    private void init() {
        Button signInBtn = (Button) findViewById(R.id.signInBtn);
        Button signUpBtn = (Button) findViewById(R.id.signUpBtn);
        signInBtn.setOnClickListener(this);
        signUpBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signInBtn:
                openSignInActivity();
                break;
            case R.id.signUpBtn:
                openSignUp1Activity();
                break;
        }
    }

    private void openSignUp1Activity() {
        Intent intent = new Intent(this,SignUp1Activity.class);
        startActivity(intent);
    }

    private void openSignInActivity() {
        Intent intent = new Intent(this,SignInActivity.class);
        startActivity(intent);
    }
}
