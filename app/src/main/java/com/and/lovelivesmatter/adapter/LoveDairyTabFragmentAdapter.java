package com.and.lovelivesmatter.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.fragments.AnnuallyLoveDairyFragment;
import com.and.lovelivesmatter.fragments.HoroscopeFragment;
import com.and.lovelivesmatter.fragments.InviteFragment;
import com.and.lovelivesmatter.fragments.MonthlyLoveDairyFragment;
import com.and.lovelivesmatter.fragments.QuarterlyLoveDairyFragment;

public class LoveDairyTabFragmentAdapter extends FragmentPagerAdapter {

    private Context _context;

    public LoveDairyTabFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        _context = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position){
            case 0: return new MonthlyLoveDairyFragment();
            case 1: return new QuarterlyLoveDairyFragment();
            case 2: return new AnnuallyLoveDairyFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    /**
     * This method returns the title of the tab according to the position.
     */

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0: return _context.getResources().getString(R.string.monthly);
            case 1: return _context.getResources().getString(R.string.quarterly);
            case 2: return _context.getResources().getString(R.string.annually);
        }
        return null;
    }
}
