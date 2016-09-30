package com.and.lovelivesmatter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.and.lovelivesmatter.adapter.NavigationMenuAdapter;
import com.and.lovelivesmatter.fragments.MainTabFragment;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,drawer, toolbar,R.string.app_name,
                R.string.app_name);

        drawer.addDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        //navigationView.setNavigationItemSelectedListener(this);
        ListView navMenuItem = (ListView) findViewById(R.id.navMenuItem);
        navMenuItem.setOnItemClickListener(this);
        navMenuItem.setAdapter(new NavigationMenuAdapter(this,R.layout.item_navigation_view,
                getResources().getStringArray(R.array.sliding_menu_array)));

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.container,new MainTabFragment()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                callMomentsActivity();
                break;
            case 1:
                callSecretsActivity();
                break;
            case 2:
                callToDoActivity();
                break;
            case 3:
                callExpectationActivity();
                break;
            case 4:
                callCalendarActivity();
                break;
            case 5:
                callDateToNightActivity();
                break;
            case 6:

                break;
        }
    }

    /** Sliding Menu Click **/
    private void callDateToNightActivity() {
        Intent intent = new Intent(this,DateToNightActivity.class);
        startActivity(intent);
    }

    private void callCalendarActivity() {

    }

    private void callExpectationActivity() {
        Intent intent = new Intent(this,ExpectationsActivity.class);
        startActivity(intent);
    }

    private void callToDoActivity() {
        Intent intent = new Intent(this,TodoActivity.class);
        startActivity(intent);
    }

    private void callSecretsActivity() {

    }

    private void callMomentsActivity() {
        Intent intent = new Intent(this,MomentsActivity.class);
        startActivity(intent);
    }
}
