package com.example.egypthiddengems;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.widget.ImageView;

public class AttractionsActivity extends AppCompatActivity {

    ViewPager mCityViewPager;
    CityPagerAdapter mCityPagerAdapter;
    TabLayout mAttractionsTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setEnterTransition(new Fade());
        setContentView(R.layout.activity_attractions);

        Bundle extra = getIntent().getExtras();
        ImageView bannerImage = findViewById(R.id.city_banner_img);
        bannerImage.setImageResource(extra.getInt("img_id"));

        mCityViewPager = findViewById(R.id.pager);
        mCityPagerAdapter = new CityPagerAdapter(getSupportFragmentManager(), this);
        mCityViewPager.setAdapter(mCityPagerAdapter);

        mAttractionsTabs = findViewById(R.id.tabs);
        mAttractionsTabs.setupWithViewPager(mCityViewPager);
    }
}


