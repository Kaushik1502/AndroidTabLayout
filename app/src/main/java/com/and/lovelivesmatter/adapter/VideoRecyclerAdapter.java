package com.and.lovelivesmatter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.and.lovelivesmatter.R;

import java.util.ArrayList;

public class VideoRecyclerAdapter extends RecyclerView.Adapter<VideoRecyclerAdapter.VideoRecyclerViewHolder> {

    private final Context _context;
    private final ArrayList<Integer> dataList;

    public VideoRecyclerAdapter(Context context,ArrayList<Integer> resId) {
        _context = context;
        dataList = resId;
    }

    @Override
    public VideoRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_video, parent, false);
        return new VideoRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(VideoRecyclerViewHolder holder, int position) {
        holder.videoThumbImgView.setImageResource(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class VideoRecyclerViewHolder extends RecyclerView.ViewHolder {

        private final ImageView videoThumbImgView;
        private final ImageView playImgView;

        public VideoRecyclerViewHolder(View itemView) {
            super(itemView);
            videoThumbImgView = (ImageView) itemView.findViewById(R.id.videoThumbImgView);
            playImgView = (ImageView) itemView.findViewById(R.id.playImgView);
        }
    }
}
