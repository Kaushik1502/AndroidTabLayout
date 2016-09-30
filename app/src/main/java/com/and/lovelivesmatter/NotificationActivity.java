package com.and.lovelivesmatter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.and.lovelivesmatter.adapter.NotificationRecyclerAdapter;
import com.and.lovelivesmatter.customviews.DividerItemDecoration;
import com.and.lovelivesmatter.model.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {

    private List<Notification> notifications = new ArrayList<>();
    private NotificationRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        init();
    }

    private void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView notificationRecyclerView = (RecyclerView) findViewById(R.id.notificationRecyclerView);
        adapter = new NotificationRecyclerAdapter(notifications);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        notificationRecyclerView.setHasFixedSize(true);
        notificationRecyclerView.setLayoutManager(layoutManager);
        notificationRecyclerView.setAdapter(adapter);
        notificationRecyclerView.addItemDecoration(new DividerItemDecoration(this,null));
        setUpArray();
    }

    private void setUpArray() {
        for (int i = 0; i < 10; i++) {
            Notification notification = new Notification();
            switch (i) {
                case 0:
                    notification.setUserName("Jessica Molly");
                    notification.setNotificationBody("have new expectation from you");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_1));
                    notification.setTime("50 minutes ago");
                    notifications.add(notification);
                    break;
                case 1:
                    notification.setUserName("Alyssa Milano");
                    notification.setNotificationBody("posted a photo");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_2));
                    notification.setTime("1 hour ago");
                    notifications.add(notification);
                    break;
                case 2:
                    notification.setUserName("Linda");
                    notification.setNotificationBody("have new expectation from you");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_3));
                    notification.setTime("2 hours ago");
                    notifications.add(notification);
                    break;
                case 3:
                    notification.setUserName("Barbara");
                    notification.setNotificationBody("posted a photo");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_4));
                    notification.setTime("2 hours ago");
                    notifications.add(notification);
                    break;
                case 4:
                    notification.setUserName("Jessica Molly");
                    notification.setNotificationBody("invite you to connect");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_1));
                    notification.setTime("3 hours ago");
                    notifications.add(notification);
                    break;
                case 5:
                    notification.setUserName("Alyssa Milano");
                    notification.setNotificationBody("have new expectation from you");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_2));
                    notification.setTime("3 hours ago");
                    notifications.add(notification);
                    break;
                case 6:
                    notification.setUserName("Linda");
                    notification.setNotificationBody("invite you to connect");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_3));
                    notification.setTime("5 hours ago");
                    notifications.add(notification);
                    break;
                case 7:
                    notification.setUserName("Barbara");
                    notification.setNotificationBody("posted a photo");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_4));
                    notification.setTime("5 hours ago");
                    notifications.add(notification);
                    break;
                case 8:
                    notification.setUserName("Alyssa Milano");
                    notification.setNotificationBody("invite you to connect");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_2));
                    notification.setTime("6 hours ago");
                    notifications.add(notification);
                    break;
                case 9:
                    notification.setUserName("Barbara");
                    notification.setNotificationBody("invite you to connect");
                    notification.setAvatarId(ContextCompat.getDrawable(this,R.drawable.profile_image_4));
                    notification.setTime("7 hours ago");
                    notifications.add(notification);
                    break;
            }
        }
        adapter.notifyDataSetChanged();
    }
}
