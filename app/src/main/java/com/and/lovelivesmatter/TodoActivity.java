package com.and.lovelivesmatter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.and.lovelivesmatter.adapter.MyExpectationRecyclerAdapter;
import com.and.lovelivesmatter.adapter.ToDoRecyclerAdapter;
import com.and.lovelivesmatter.model.MyExpectation;
import com.and.lovelivesmatter.model.ToDo;

import java.util.ArrayList;
import java.util.List;

public class TodoActivity extends AppCompatActivity {

    private ToDoRecyclerAdapter adapter;
    private List<ToDo> todos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        init();
    }

    private void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView todoRecyclerView = (RecyclerView) findViewById(R.id.todoRecyclerView);
        adapter = new ToDoRecyclerAdapter(todos);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        todoRecyclerView.setHasFixedSize(true);
        todoRecyclerView.setLayoutManager(linearLayoutManager);
        todoRecyclerView.setAdapter(adapter);
        setUpArray();
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

    private void setUpArray() {
        for (int i = 0; i < 10; i++) {
            ToDo toDo = new ToDo();
            switch (i) {
                case 0:
                    toDo.setToDo("Go on long walks");
                    toDo.setStatusFlag(0);
                    toDo.setAvatarId(R.drawable.profile_image_bg_todo);
                    todos.add(toDo);
                    break;
                case 1:
                    toDo.setToDo("Travel to somewhere new");
                    toDo.setStatusFlag(0);
                    toDo.setAvatarId(R.drawable.profile_image_bg_todo);
                    todos.add(toDo);
                    break;
                case 2:
                    toDo.setToDo("Listen to nice music");
                    toDo.setStatusFlag(0);
                    toDo.setAvatarId(R.drawable.profile_image_bg_todo);
                    todos.add(toDo);
                    break;
                case 3:
                    toDo.setToDo("Watch the sunset");
                    toDo.setStatusFlag(1);
                    toDo.setAvatarId(R.drawable.profile_image_1);
                    todos.add(toDo);
                    break;
                case 4:
                    toDo.setToDo("Watch a scary movie with you");
                    toDo.setStatusFlag(1);
                    toDo.setAvatarId(R.drawable.profile_image_1);
                    todos.add(toDo);
                    break;
                case 5:
                    toDo.setToDo("Pictures taken together");
                    toDo.setStatusFlag(1);
                    toDo.setAvatarId(R.drawable.profile_image_1);
                    todos.add(toDo);
                    break;
                case 6:
                    toDo.setToDo("Go for lunch");
                    toDo.setStatusFlag(1);
                    toDo.setAvatarId(R.drawable.profile_image_1);
                    todos.add(toDo);
                    break;
                case 7:
                    toDo.setToDo("Go for movie");
                    toDo.setStatusFlag(1);
                    toDo.setAvatarId(R.drawable.profile_image_1);
                    todos.add(toDo);
                    break;
                case 8:
                    toDo.setToDo("Go to beach");
                    toDo.setStatusFlag(1);
                    toDo.setAvatarId(R.drawable.profile_image_1);
                    todos.add(toDo);
                    break;
                case 9:
                    toDo.setToDo("Play games together");
                    toDo.setStatusFlag(1);
                    toDo.setAvatarId(R.drawable.profile_image_1);
                    todos.add(toDo);
                    break;
            }
        }
        adapter.notifyDataSetChanged();
    }
}
