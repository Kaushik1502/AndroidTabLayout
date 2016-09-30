package com.and.lovelivesmatter.model;

import android.graphics.drawable.Drawable;

public class Notification {

    private Drawable avatarId;
    private String userName;
    private String notificationBody;
    private String time;

    public Drawable getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(Drawable avatarId) {
        this.avatarId = avatarId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNotificationBody() {
        return notificationBody;
    }

    public void setNotificationBody(String notificationBody) {
        this.notificationBody = notificationBody;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
