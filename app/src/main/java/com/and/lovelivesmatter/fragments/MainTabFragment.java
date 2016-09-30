package com.and.lovelivesmatter.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.adapter.MainTabFragmentAdapter;

public class MainTabFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public MainTabFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.scrollable_tab_layout,container,false);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        MainTabFragmentAdapter adapter = new MainTabFragmentAdapter(getChildFragmentManager(),getActivity());
        viewPager.setAdapter(adapter);

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
