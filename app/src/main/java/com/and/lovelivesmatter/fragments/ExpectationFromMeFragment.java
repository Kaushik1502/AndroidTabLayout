package com.and.lovelivesmatter.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.adapter.ExpectationFromMeRecyclerAdapter;
import com.and.lovelivesmatter.model.ExpectationFromMe;

import java.util.ArrayList;
import java.util.List;

public class ExpectationFromMeFragment extends Fragment {

    private ExpectationFromMeRecyclerAdapter adapter;
    private List<ExpectationFromMe> expectations = new ArrayList<>();

    public ExpectationFromMeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recyclerview_holder,container,false);
        init(view);
        return view;
    }

    private void init(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        adapter = new ExpectationFromMeRecyclerAdapter(getActivity(),expectations);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        setUpArray();
    }

    private void setUpArray() {
        for (int i = 0; i < 10; i++) {
            ExpectationFromMe expectationFromMe = new ExpectationFromMe();
            switch (i) {
                case 0:
                    expectationFromMe.setExpectation("Go on long walks");
                    expectationFromMe.setStatusFlag(2);
                    expectations.add(expectationFromMe);
                    break;
                case 1:
                    expectationFromMe.setExpectation("Travel to somewhere new");
                    expectationFromMe.setStatusFlag(2);
                    expectations.add(expectationFromMe);
                    break;
                case 2:
                    expectationFromMe.setExpectation("Listen to nice music");
                    expectationFromMe.setStatusFlag(2);
                    expectations.add(expectationFromMe);
                    break;
                case 3:
                    expectationFromMe.setExpectation("Watch the sunset");
                    expectationFromMe.setStatusFlag(1);
                    expectations.add(expectationFromMe);
                    break;
                case 4:
                    expectationFromMe.setExpectation("Watch a scary movie with you");
                    expectationFromMe.setStatusFlag(1);
                    expectations.add(expectationFromMe);
                    break;
                case 5:
                    expectationFromMe.setExpectation("Pictures taken together");
                    expectationFromMe.setStatusFlag(1);
                    expectations.add(expectationFromMe);
                    break;
                case 6:
                    expectationFromMe.setExpectation("Go for lunch");
                    expectationFromMe.setStatusFlag(0);
                    expectations.add(expectationFromMe);
                    break;
                case 7:
                    expectationFromMe.setExpectation("Go for movie");
                    expectationFromMe.setStatusFlag(0);
                    expectations.add(expectationFromMe);
                    break;
                case 8:
                    expectationFromMe.setExpectation("Go to beach");
                    expectationFromMe.setStatusFlag(0);
                    expectations.add(expectationFromMe);
                    break;
                case 9:
                    expectationFromMe.setExpectation("Play games together");
                    expectationFromMe.setStatusFlag(0);
                    expectations.add(expectationFromMe);
                    break;
            }
        }
        adapter.notifyDataSetChanged();
    }
}
