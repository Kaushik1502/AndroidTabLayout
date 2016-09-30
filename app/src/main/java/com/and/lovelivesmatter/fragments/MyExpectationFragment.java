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
import com.and.lovelivesmatter.adapter.MyExpectationRecyclerAdapter;
import com.and.lovelivesmatter.model.MyExpectation;

import java.util.ArrayList;
import java.util.List;

public class MyExpectationFragment extends Fragment {

    private MyExpectationRecyclerAdapter adapter;
    private List<MyExpectation> expectations = new ArrayList<>();

    public MyExpectationFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_expectation,container,false);
        init(view);
        return view;
    }

    private void init(View view) {
        RecyclerView expectationRecyclerView = (RecyclerView) view.findViewById(R.id.expectationRecyclerView);
        adapter = new MyExpectationRecyclerAdapter(getActivity(),expectations);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        expectationRecyclerView.setHasFixedSize(true);
        expectationRecyclerView.setLayoutManager(linearLayoutManager);
        expectationRecyclerView.setAdapter(adapter);
        setUpArray();
    }

    private void setUpArray() {
        for (int i = 0; i < 10; i++) {
            MyExpectation myException = new MyExpectation();
            switch (i) {
                case 0:
                    myException.setExpectation("Go on long walks");
                    myException.setStatusFlag(2);
                    expectations.add(myException);
                    break;
                case 1:
                    myException.setExpectation("Travel to somewhere new");
                    myException.setStatusFlag(2);
                    expectations.add(myException);
                    break;
                case 2:
                    myException.setExpectation("Listen to nice music");
                    myException.setStatusFlag(2);
                    expectations.add(myException);
                    break;
                case 3:
                    myException.setExpectation("Watch the sunset");
                    myException.setStatusFlag(1);
                    expectations.add(myException);
                    break;
                case 4:
                    myException.setExpectation("Watch a scary movie with you");
                    myException.setStatusFlag(1);
                    expectations.add(myException);
                    break;
                case 5:
                    myException.setExpectation("Pictures taken together");
                    myException.setStatusFlag(1);
                    expectations.add(myException);
                    break;
                case 6:
                    myException.setExpectation("Go for lunch");
                    myException.setStatusFlag(0);
                    expectations.add(myException);
                    break;
                case 7:
                    myException.setExpectation("Go for movie");
                    myException.setStatusFlag(0);
                    expectations.add(myException);
                    break;
                case 8:
                    myException.setExpectation("Go to beach");
                    myException.setStatusFlag(0);
                    expectations.add(myException);
                    break;
                case 9:
                    myException.setExpectation("Play games together");
                    myException.setStatusFlag(0);
                    expectations.add(myException);
                    break;
            }
        }
        adapter.notifyDataSetChanged();
    }
}
