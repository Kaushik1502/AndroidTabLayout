package com.and.lovelivesmatter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.model.MyExpectation;

import java.util.List;

public class MyExpectationRecyclerAdapter extends RecyclerView.Adapter<MyExpectationRecyclerAdapter.MyExpectationViewHolder>{

    private final List<MyExpectation> dataList;
    private final Context _context;

    public MyExpectationRecyclerAdapter(Context context,List<MyExpectation> objects) {
        _context = context;
        dataList = objects;
    }

    @Override
    public MyExpectationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_my_expectation, parent, false);
        return new MyExpectationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyExpectationViewHolder holder, int position) {
        holder.expectationTxtView.setText(dataList.get(position).getExpectation());
        int status = dataList.get(position).getStatusFlag();
        if (status == 0) {
            holder.statusImgView.setImageResource(R.drawable.disagreed_notmet_icon);
            holder.statusTxtView.setVisibility(View.VISIBLE);
            holder.statusTxtView.setText(_context.getResources().getString(R.string.not_met));
        } else if(status == 1) {
            holder.statusImgView.setImageResource(R.drawable.agreed_met_icon);
            holder.statusTxtView.setVisibility(View.VISIBLE);
            holder.statusTxtView.setText(_context.getResources().getString(R.string.met));
        } else {
            holder.statusImgView.setImageResource(R.drawable.pending_icon);
            holder.statusTxtView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class MyExpectationViewHolder extends RecyclerView.ViewHolder {

        private final TextView expectationTxtView;
        private final TextView statusTxtView;
        private final ImageView statusImgView;

        public MyExpectationViewHolder(View itemView) {
            super(itemView);
            expectationTxtView = (TextView) itemView.findViewById(R.id.expectationTxtView);
            statusTxtView = (TextView) itemView.findViewById(R.id.statusTxtView);
            statusImgView = (ImageView) itemView.findViewById(R.id.statusImgView);
        }
    }
}
