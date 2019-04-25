package com.example.egypthiddengems;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CityPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CityPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        mContext = context;
    }

    //This method returns a fragment depending on the position of user
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new LandmarkFragment();
            case 1:
                return new NatureFragment();
            case 2:
                return new ShoppingFragment();
            case 3:
                return new FoodFragment();
            case 4:
                return new WaterAndActivitiesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    /**
     *
     * @param position gives the position where the user is at
     * @return tab title as a CharSequence
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return mContext.getString(R.string.landmark_category);
            case 1:
                return mContext.getString(R.string.nature_category_name);
            case 2:
                return mContext.getString(R.string.shopping_category_name);
            case 3:
                return mContext.getString(R.string.food_category_name);
            case 4:
                return mContext.getString(R.string.water_category_name);
            default:
                return "false";
        }

    }
}
