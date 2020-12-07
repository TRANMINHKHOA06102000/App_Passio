package com.example.passio;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapterCoupon extends FragmentPagerAdapter {
    private int numOfTabs;
    public PagerAdapterCoupon(FragmentManager fm, int numOfTabs ){

        super(fm);
        this.numOfTabs = numOfTabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new coupon1();
            case 1:
                return new coupon2();
            case 2:
                return new coupon3();
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
