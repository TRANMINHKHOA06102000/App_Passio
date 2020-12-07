package com.example.passio;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapterChonMon extends FragmentPagerAdapter {
    private int numOfTabs;
    public PagerAdapterChonMon(FragmentManager fm, int numOfTabs ){

        super(fm);
        this.numOfTabs = numOfTabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            case 2:
                return new tab3();
            case 3:
                return new tab4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return numOfTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object){
        return POSITION_NONE;
    }
}
