package com.pcsalt.example.swipetabfragment.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.pcsalt.example.swipetabfragment.fragment.FirstFragment;
import com.pcsalt.example.swipetabfragment.fragment.SecondFragment;

/**
 * Created by Krrishnaaaa on June 04, 2016
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
            default:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
            default:
                return "Page 1";
            case 1:
                return "Page 2";
        }
    }
}
