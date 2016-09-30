package com.and.lovelivesmatter.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.and.lovelivesmatter.R;
import com.and.lovelivesmatter.fragments.ChatFragment;
import com.and.lovelivesmatter.fragments.HoroscopeFragment;
import com.and.lovelivesmatter.fragments.HotNightFragment;
import com.and.lovelivesmatter.fragments.InviteFragment;
import com.and.lovelivesmatter.fragments.LoveDiaryFragment;
import com.and.lovelivesmatter.fragments.PhotoFragment;
import com.and.lovelivesmatter.fragments.TimeLineFragment;
import com.and.lovelivesmatter.fragments.VideoFragment;

public class MomentsTabFragmentAdapter extends FragmentPagerAdapter {

    private Context _context;

    public MomentsTabFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        _context = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position){
            case 0: return new PhotoFragment();
            case 1: return new VideoFragment();
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
            case 0: return _context.getResources().getString(R.string.photo);
            case 1: return _context.getResources().getString(R.string.video);
        }
        return null;
    }
}
