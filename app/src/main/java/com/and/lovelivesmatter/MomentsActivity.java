package com.and.lovelivesmatter;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.and.lovelivesmatter.adapter.MomentsTabFragmentAdapter;
import com.and.lovelivesmatter.fragments.MainTabFragment;
import com.and.lovelivesmatter.fragments.MomentsTabFragment;

public class MomentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momemts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.container, new MomentsTabFragment()).commit();
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
                openSettingsActivity();
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

    private void openSettingsActivity() {
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }

    private void openNotificationActivity() {
        Intent intent = new Intent(this,NotificationActivity.class);
        startActivity(intent);
    }
}
