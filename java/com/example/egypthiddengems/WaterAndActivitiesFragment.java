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
public class WaterAndActivitiesFragment extends Fragment {

    private ArrayList<Place> mActivitiesArrayList;
    private ListView mActivitiesListView;
    private PlacesAdapter mActivitiesAdapter;

    public WaterAndActivitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        mActivitiesArrayList = new ArrayList<>();
        if (CardAdapter.s0) {
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.alex_act_1), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.alex_act_2), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.alex_act_3), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.alex_act_4), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.alex_act_5), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.alex_act_6), getString(R.string.description)));
        } else if (CardAdapter.s1) {
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.cairo_act_1), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.cairo_act_2), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.cairo_act_3), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.cairo_act_4), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.cairo_act_5), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.cairo_act_6), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.cairo_act_7), getString(R.string.description)));
        } else if (CardAdapter.s2) {
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.aswan_act_1), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.aswan_act_2), getString(R.string.description)));
        } else if (CardAdapter.s3) {
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.hurgh_act_1), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.hurgh_act_2), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.hurgh_act_3), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.hurgh_act_4), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.hurgh_act_5), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.hurgh_act_6), getString(R.string.description)));
        } else if (CardAdapter.s4) {
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.lux_act_1), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.lux_act_2), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.lux_act_3), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.lux_act_4), getString(R.string.description)));
        } else if (CardAdapter.s5) {
            mActivitiesArrayList.add(new Place(R.drawable.activities, "Valley of the Kings", getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, "Karnak", getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, "Luxor Temple", getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, "Mortuary Temple of Hatshepsut", getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, "Medinet Habu", getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, "Luxor Museum", getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, "Mortuary Temple of Seti I", getString(R.string.description)));
        } else if (CardAdapter.s6) {
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.port_act_1), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.port_act_2), getString(R.string.description)));
        } else if (CardAdapter.s7) {
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.siwa_act_1), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.siwa_act_2), getString(R.string.description)));
            mActivitiesArrayList.add(new Place(R.drawable.activities, getString(R.string.siwa_act_3), getString(R.string.description)));
        }

        mActivitiesListView = rootView.findViewById(R.id.places_list);
        mActivitiesAdapter = new PlacesAdapter(mActivitiesArrayList, getContext());
        mActivitiesListView.setAdapter(mActivitiesAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
