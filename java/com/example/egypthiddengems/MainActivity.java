package com.example.egypthiddengems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CardAdapter mCityCardAdapter;
    private GridLayoutManager mGridManager;
    private RecyclerView mRecycler;
    private ArrayList<Card> mCityCardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setEnterTransition(new Fade());
        setContentView(R.layout.activity_main);

        //Initializing the ArrayList which will be used to populate the RecyclerView
        mCityCardList = new ArrayList<>();

        mCityCardList.add(new Card(R.drawable.alexandria, getString(R.string.alex_name)));
        mCityCardList.add(new Card(R.drawable.cairo, getString(R.string.cairo_name)));
        mCityCardList.add(new Card(R.drawable.aswan, getString(R.string.aswan_name)));
        mCityCardList.add(new Card(R.drawable.hurghada, getString(R.string.hurgh_name)));
        mCityCardList.add(new Card(R.drawable.luxor, getString(R.string.lux_name)));
        mCityCardList.add(new Card(R.drawable.marsa_alam, getString(R.string.marsa_name)));
        mCityCardList.add(new Card(R.drawable.portsaid, getString(R.string.port_name)));
        mCityCardList.add(new Card(R.drawable.siwa, getString(R.string.siwa_name)));

        //Setting up the RecyclerView with the LayoutManager and Adapter
        mRecycler = findViewById(R.id.recycler);
        mCityCardAdapter = new CardAdapter(mCityCardList, this);
        mGridManager = new GridLayoutManager(this, 2);

        mRecycler.setLayoutManager(mGridManager);
        mRecycler.setAdapter(mCityCardAdapter);
    }
}
