package com.and.lovelivesmatter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangePasswordActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText oldPasswordEditTxt;
    private EditText newPasswordEditTxt;
    private EditText reNewPasswordEditTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        init();
    }

    private void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        oldPasswordEditTxt = (EditText) findViewById(R.id.oldPasswordEditTxt);
        newPasswordEditTxt = (EditText) findViewById(R.id.newPasswordEditTxt);
        reNewPasswordEditTxt = (EditText) findViewById(R.id.reNewPasswordEditTxt);
        Button saveBtn = (Button) findViewById(R.id.saveBtn);saveBtn.setOnClickListener(this);
        saveBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.saveBtn:

                break;
        }
    }
}
