package com.and.lovelivesmatter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.model.ToDo;

import java.util.List;

public class ToDoRecyclerAdapter extends RecyclerView.Adapter<ToDoRecyclerAdapter.ToDoViewHolder>{

    private final List<ToDo> dataList;

    public ToDoRecyclerAdapter(List<ToDo> objects) {
        dataList = objects;
    }

    @Override
    public ToDoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_to_do, parent, false);
        return new ToDoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ToDoViewHolder holder, int position) {
        holder.expectationTxtView.setText(dataList.get(position).getToDo());
        int status = dataList.get(position).getStatusFlag();
        holder.avatarImgView.setImageResource(dataList.get(position).getAvatarId());
        if (status == 0) {
            holder.editImgView.setVisibility(View.VISIBLE);
        } else {
            holder.editImgView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ToDoViewHolder extends RecyclerView.ViewHolder {

        private final TextView expectationTxtView;
        private final ImageView editImgView;
        private final ImageView deleteImgView;
        private final ImageView avatarImgView;

        public ToDoViewHolder(View itemView) {
            super(itemView);
            avatarImgView = (ImageView) itemView.findViewById(R.id.avatarImgView);
            expectationTxtView = (TextView) itemView.findViewById(R.id.expectationTxtView);
            editImgView = (ImageView) itemView.findViewById(R.id.editImgView);
            deleteImgView = (ImageView) itemView.findViewById(R.id.deleteImgView);
        }
    }
}
