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
import com.and.lovelivesmatter.fragments.TimeLineFragment;

public class MainTabFragmentAdapter extends FragmentPagerAdapter {

    private Context _context;

    public MainTabFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        _context = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position){
            case 0: return new TimeLineFragment();
            case 1: return new InviteFragment();
            case 2: return new HoroscopeFragment();
            case 3: return new HotNightFragment();
            case 4: return new ChatFragment();
            case 5: return new LoveDiaryFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }

    /**
     * This method returns the title of the tab according to the position.
     */

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0: return _context.getResources().getString(R.string.timeline);
            case 1: return _context.getResources().getString(R.string.invite);
            case 2: return _context.getResources().getString(R.string.horoscope);
            case 3: return _context.getResources().getString(R.string.hot_night);
            case 4: return _context.getResources().getString(R.string.chat);
            case 5: return _context.getResources().getString(R.string.love_diary);
        }
        return null;
    }
}
