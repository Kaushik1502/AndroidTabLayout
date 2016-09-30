package com.and.lovelivesmatter.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.and.lovelivesmatter.R;

public class TimeLineFragment extends Fragment {

    public TimeLineFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_timeline,container,false);
        init(view);
        return view;
    }

    private void init(View view) {
        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle(getActivity().getResources().getString(R.string.timeline));
        /*RecyclerView timelineRecyclerView = (RecyclerView) view.findViewById(R.id.timelineRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        timelineRecyclerView.setHasFixedSize(true);
        timelineRecyclerView.setLayoutManager(linearLayoutManager);
        timelineRecyclerView.setAdapter(adapter);*/
    }
}
