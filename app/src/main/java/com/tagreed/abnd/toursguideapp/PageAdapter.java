package com.tagreed.abnd.toursguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tagreed on 8/25/2017.
 */

public class PageAdapter extends FragmentPagerAdapter {
    private final int Pages_No = 5;
    private String tabTitles[] = new String[]{
            OverviewActivity.Name,
            ParksActivity.Name,
            MuseumsActivity.Name,
            FamilyActivity.Name,
            ShoppingActivity.Name
    };
    private Context mContext;

    public PageAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return Pages_No;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, OverviewActivity.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, ParksActivity.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, MuseumsActivity.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, FamilyActivity.class.getName());
                break;
            case 4:
                fragment = Fragment.instantiate(mContext, ShoppingActivity.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
