package com.and.lovelivesmatter.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.fragments.ChatFragment;
import com.and.lovelivesmatter.fragments.ExpectationFromMeFragment;
import com.and.lovelivesmatter.fragments.HoroscopeFragment;
import com.and.lovelivesmatter.fragments.HotNightFragment;
import com.and.lovelivesmatter.fragments.InviteFragment;
import com.and.lovelivesmatter.fragments.LoveDiaryFragment;
import com.and.lovelivesmatter.fragments.MyExpectationFragment;
import com.and.lovelivesmatter.fragments.TimeLineFragment;

public class ExpectationTabFragmentAdapter extends FragmentPagerAdapter {

    private Context _context;

    public ExpectationTabFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        _context = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position){
            case 0: return new MyExpectationFragment();
            case 1: return new ExpectationFromMeFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    /**
     * This method returns the title of the tab according to the position.
     */

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0: return _context.getResources().getString(R.string.my_expectation);
            case 1: return _context.getResources().getString(R.string.expectation_from_me);
        }
        return null;
    }
}
