package com.and.lovelivesmatter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.model.Notification;

import java.util.List;

public class NotificationRecyclerAdapter extends RecyclerView.Adapter<NotificationRecyclerAdapter.NotificationViewHolder>{

    private final List<Notification> dataList;

    public NotificationRecyclerAdapter(List<Notification> objects) {
        dataList = objects;
    }

    @Override
    public NotificationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_notification_recyclerview, parent, false);
        return new NotificationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NotificationViewHolder holder, int position) {
        holder.avatarImgView.setImageDrawable(dataList.get(position).getAvatarId());
        holder.userNameTxtView.setText(dataList.get(position).getUserName());
        holder.bodyTxtView.setText(dataList.get(position).getNotificationBody());
        holder.timeTxtView.setText(dataList.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class NotificationViewHolder extends RecyclerView.ViewHolder {

        private final ImageView avatarImgView;
        private final TextView userNameTxtView;
        private final TextView bodyTxtView;
        private final TextView timeTxtView;

        public NotificationViewHolder(View itemView) {
            super(itemView);
            avatarImgView = (ImageView) itemView.findViewById(R.id.avatarImgView);
            userNameTxtView = (TextView) itemView.findViewById(R.id.userNameTxtView);
            bodyTxtView = (TextView) itemView.findViewById(R.id.bodyTxtView);
            timeTxtView = (TextView) itemView.findViewById(R.id.timeTxtView);
        }
    }
}
