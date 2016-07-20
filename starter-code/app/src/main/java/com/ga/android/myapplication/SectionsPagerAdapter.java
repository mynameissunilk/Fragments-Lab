package com.ga.android.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    int mPageCount;

    public SectionsPagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        mPageCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag;
        switch (position){
            case 0:
                frag = new PlaceholderFragment();
                break;
            case 1:
                frag = new ContactFragment();
                break;
            case 2:
                frag = new AboutFragment();
                break;
            default: return new PlaceholderFragment();
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    //    @Override
//    public int getCount() {
        // Show 3 total pages.
//        return mPageCount;
//    }
    
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            default:
            case 0:
                return "Mug";
            case 1:
                return "ABOUT ME";
            case 2:
                return "CONTACT";
        }

    }
}
