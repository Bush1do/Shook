package com.here.name.website.shook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charles on 7/2/2017.
 */

//Store fragments for tabs
public class SectionsPageAdapter extends FragmentPagerAdapter {

    private static final String TAG = "SectionsPageAdapter";

    private final List<Fragment> mFragmentList= new ArrayList<>();

    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
