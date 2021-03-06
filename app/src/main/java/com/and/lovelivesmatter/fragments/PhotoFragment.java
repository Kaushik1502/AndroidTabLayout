package com.and.lovelivesmatter.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.adapter.PhotoRecyclerAdapter;

import java.util.ArrayList;

public class PhotoFragment extends Fragment {

    private ArrayList<Integer> thumbArray = new ArrayList<Integer>();
    private PhotoRecyclerAdapter adapter;

    public PhotoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recyclerview_holder,container,false);
        init(view);
        return view;
    }

    private void init(View view) {
        setUpArray();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new PhotoRecyclerAdapter(getActivity(),thumbArray);
        recyclerView.setAdapter(adapter);
    }

    private void setUpArray() {
        thumbArray.add(R.drawable.image_1);
        thumbArray.add(R.drawable.image_2);
        thumbArray.add(R.drawable.image_3);
        thumbArray.add(R.drawable.image_4);
        thumbArray.add(R.drawable.image_5);
        thumbArray.add(R.drawable.image_6);
        thumbArray.add(R.drawable.image_4);
        thumbArray.add(R.drawable.image_1);
        thumbArray.add(R.drawable.image_5);
        thumbArray.add(R.drawable.image_2);
        thumbArray.add(R.drawable.image_6);
        thumbArray.add(R.drawable.image_3);
        thumbArray.add(R.drawable.image_5);
        thumbArray.add(R.drawable.image_2);
    }
}
