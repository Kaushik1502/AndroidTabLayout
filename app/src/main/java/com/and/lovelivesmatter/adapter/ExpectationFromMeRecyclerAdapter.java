package com.and.lovelivesmatter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.model.ExpectationFromMe;

import java.util.List;

public class ExpectationFromMeRecyclerAdapter extends RecyclerView.Adapter<ExpectationFromMeRecyclerAdapter.ExpectationFromMeViewHolder>{

    private final Context _context;
    private final List<ExpectationFromMe> dataList;

    public ExpectationFromMeRecyclerAdapter(Context context,List<ExpectationFromMe> objects) {
        _context = context;
        dataList = objects;
    }

    @Override
    public ExpectationFromMeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_expectation_complete, parent, false);
        return new ExpectationFromMeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ExpectationFromMeViewHolder holder, int position) {
        holder.expectationTxtView.setText(dataList.get(position).getExpectation());
        int status = dataList.get(position).getStatusFlag();
        if (status == 0) {
            holder.agreedImgView.setVisibility(View.GONE);
            holder.disAgreedImgView.setVisibility(View.GONE);
            holder.statusTxtView.setVisibility(View.VISIBLE);
            holder.statusTxtView.setText(_context.getResources().getString(R.string.disagreed));
        } else if(status == 1) {
            holder.agreedImgView.setVisibility(View.GONE);
            holder.disAgreedImgView.setVisibility(View.GONE);
            holder.statusTxtView.setVisibility(View.VISIBLE);
            holder.statusTxtView.setText(_context.getResources().getString(R.string.agreed));
        } else {
            holder.agreedImgView.setVisibility(View.VISIBLE);
            holder.disAgreedImgView.setVisibility(View.VISIBLE);
            holder.statusTxtView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ExpectationFromMeViewHolder extends RecyclerView.ViewHolder {

        private final TextView expectationTxtView;
        private final TextView statusTxtView;
        private final ImageView agreedImgView;
        private final ImageView disAgreedImgView;

        public ExpectationFromMeViewHolder(View itemView) {
            super(itemView);
            expectationTxtView = (TextView) itemView.findViewById(R.id.expectationTxtView);
            statusTxtView = (TextView) itemView.findViewById(R.id.statusTxtView);
            agreedImgView = (ImageView) itemView.findViewById(R.id.agreedImgView);
            disAgreedImgView = (ImageView) itemView.findViewById(R.id.disAgreedImgView);
        }
    }
}
