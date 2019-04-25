package com.example.egypthiddengems;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarkFragment extends Fragment {

    private ArrayList<Place> mLandmarkArrayList;
    private ListView mLandmarkListView;
    private PlacesAdapter mLandmarkAdapter;

    public LandmarkFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflating the layout that will be used with the fragment, it is common for all fragments.
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        //Initializing the ArrayList based on the city/category the user has clicked on.
        //City is detected using static boolean variables from s0 to s7.
        mLandmarkArrayList = new ArrayList<>();
        if (CardAdapter.s0) {
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.alex_land_1), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.alex_land_2), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.alex_land_3), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.alex_land_4), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.alex_land_5), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.alex_land_6), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.alex_land_7), getString(R.string.description)));
        } else if (CardAdapter.s1) {
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.cairo_land_1), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.cairo_land_2), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.cairo_land_3), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.cairo_land_4), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.cairo_land_5), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.cairo_land_6), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.cairo_land_7), getString(R.string.description)));
        } else if (CardAdapter.s2) {
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.aswan_land_1), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.aswan_land_2), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.aswan_land_3), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.aswan_land_4), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.aswan_land_5), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.aswan_land_6), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.aswan_land_7), getString(R.string.description)));
        } else if (CardAdapter.s3) {
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.hurgh_land_1), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.hurgh_land_2), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.hurgh_land_3), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.hurgh_land_4), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.hurgh_land_5), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.hurgh_land_6), getString(R.string.description)));
        } else if (CardAdapter.s4) {
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.lux_land_1), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.lux_land_2), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.lux_land_3), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.lux_land_4), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.lux_land_5), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.lux_land_6), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.lux_land_7), getString(R.string.description)));
        } else if (CardAdapter.s5) {
            mLandmarkArrayList.add(new Place(R.drawable.landmark, "Valley of the Kings", getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, "Karnak", getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, "Luxor Temple", getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, "Mortuary Temple of Hatshepsut", getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, "Medinet Habu", getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, "Luxor Museum", getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, "Mortuary Temple of Seti I", getString(R.string.description)));
        } else if (CardAdapter.s6) {
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.port_land_1), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.port_land_2), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.port_land_3), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.port_land_4), getString(R.string.description)));
        } else if (CardAdapter.s7) {
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.siwa_land_1), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.siwa_land_2), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.siwa_land_3), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.siwa_land_4), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.siwa_land_5), getString(R.string.description)));
            mLandmarkArrayList.add(new Place(R.drawable.landmark, getString(R.string.siwa_land_6), getString(R.string.description)));
        }

        //Setting up the ListView with the custom ArrayAdapter
        mLandmarkListView = rootView.findViewById(R.id.places_list);
        mLandmarkAdapter = new PlacesAdapter(mLandmarkArrayList, getContext());
        mLandmarkListView.setAdapter(mLandmarkAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
