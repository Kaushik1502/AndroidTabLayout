package com.and.lovelivesmatter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener{

    private Switch inviteSwitch;
    private Switch expectationSwitch;
    private Switch wannaTalkSwitch;
    private Switch dailyHoroscopeSwitch;
    private Switch postPartnerSwitch;
    private Switch chatSwitch;
    private Switch secretSwitch;
    private Switch loveDiarySwitch;
    private Switch todoSwitch;
    private FrameLayout changePasswordFrame;
    private FrameLayout deleteAccountFrame;
    private FrameLayout rateAppFrame;
    private FrameLayout logOutFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        init();
    }

    private void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        inviteSwitch = (Switch) findViewById(R.id.inviteSwitch);
        expectationSwitch = (Switch) findViewById(R.id.expectationSwitch);
        wannaTalkSwitch = (Switch) findViewById(R.id.wannaTalkSwitch);
        dailyHoroscopeSwitch = (Switch) findViewById(R.id.dailyHoroscopeSwitch);
        postPartnerSwitch = (Switch) findViewById(R.id.postPartnerSwitch);
        chatSwitch = (Switch) findViewById(R.id.chatSwitch);
        secretSwitch = (Switch) findViewById(R.id.secretSwitch);
        loveDiarySwitch = (Switch) findViewById(R.id.loveDiarySwitch);
        todoSwitch = (Switch) findViewById(R.id.todoSwitch);

        changePasswordFrame = (FrameLayout) findViewById(R.id.changePasswordFrame);
        deleteAccountFrame = (FrameLayout) findViewById(R.id.deleteAccountFrame);
        rateAppFrame = (FrameLayout) findViewById(R.id.rateAppFrame);
        logOutFrame = (FrameLayout) findViewById(R.id.logOutFrame);
        changePasswordFrame.setOnClickListener(this);
        deleteAccountFrame.setOnClickListener(this);
        rateAppFrame.setOnClickListener(this);
        logOutFrame.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case R.id.notification:
                openNotificationActivity();
                break;
            case R.id.myProfile:
                openMyProfileActivity();
                break;
            case R.id.settings:

                break;
            case R.id.help:
                openHelpActivity();
                break;
            case R.id.logOut:
                callLogOut();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /** Overflow Menu Click **/
    private void callLogOut() {
        Intent intent = new Intent(this,LandingActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void openHelpActivity() {
        Intent intent = new Intent(this,HelpActivity.class);
        startActivity(intent);
    }

    private void openMyProfileActivity() {
        Intent intent = new Intent(this,MyProfileActivity.class);
        startActivity(intent);
    }

    private void openNotificationActivity() {
        Intent intent = new Intent(this,NotificationActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.changePasswordFrame:
                openChangePasswordActivity();
                break;
            case R.id.deleteAccountFrame:

                break;
            case R.id.rateAppFrame:

                break;
            case R.id.logOutFrame:
                callLogOut();
                break;
        }
    }

    private void openChangePasswordActivity() {
        Intent intent = new Intent(this,ChangePasswordActivity.class);
        startActivity(intent);
    }
}
