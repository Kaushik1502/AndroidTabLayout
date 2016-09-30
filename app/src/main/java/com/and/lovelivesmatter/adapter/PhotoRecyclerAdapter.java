package com.and.lovelivesmatter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.and.lovelivesmatter.R;

import java.util.ArrayList;

public class PhotoRecyclerAdapter extends RecyclerView.Adapter<PhotoRecyclerAdapter.PhotoRecyclerViewHolder>{

    private final Context _context;
    private final ArrayList<Integer> dataList;

    public PhotoRecyclerAdapter(Context context,ArrayList<Integer> resId) {
        _context = context;
        dataList = resId;
    }

    @Override
    public PhotoRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_photo, parent, false);
        return new PhotoRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PhotoRecyclerViewHolder holder, int position) {
        holder.photoThumbImgView.setImageResource(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class PhotoRecyclerViewHolder extends RecyclerView.ViewHolder {

        private final ImageView photoThumbImgView;

        public PhotoRecyclerViewHolder(View itemView) {
            super(itemView);
            photoThumbImgView = (ImageView) itemView.findViewById(R.id.photoThumbImgView);
        }
    }
}
