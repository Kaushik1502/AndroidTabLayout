package com.and.lovelivesmatter.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.adapter.ExpectationTabFragmentAdapter;
import com.and.lovelivesmatter.adapter.MomentsTabFragmentAdapter;

public class ExpectationsTabFragment extends Fragment {

    public ExpectationsTabFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fixed_tab_layout,container,false);
        final TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new ExpectationTabFragmentAdapter(getChildFragmentManager(),getActivity()));

        /**
         * Now , this is a workaround ,
         * The setupWithViewPager dose't works without the runnable .
         * Maybe a Support Library Bug .
         */

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        return view;
    }
}
