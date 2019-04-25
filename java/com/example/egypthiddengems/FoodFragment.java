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
public class FoodFragment extends Fragment {

    private ArrayList<Place> mFoodArrayList;
    private ListView mFoodList;
    private PlacesAdapter mFoodAdapter;

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        mFoodArrayList = new ArrayList<>();
        if (CardAdapter.s0) {
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.alex_rest_1), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.alex_rest_2), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.alex_rest_3), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.alex_rest_4), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.alex_rest_5), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.alex_rest_6), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.alex_rest_7), getString(R.string.description)));
        } else if (CardAdapter.s1) {
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.cairo_rest_1), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.cairo_rest_2), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.cairo_rest_3), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.cairo_rest_4), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.cairo_rest_5), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.cairo_rest_6), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.cairo_rest_7), getString(R.string.description)));
        } else if (CardAdapter.s2) {
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.aswan_rest_1), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.aswan_rest_2), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.aswan_rest_3), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.aswan_rest_4), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.aswan_rest_5), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.aswan_rest_6), getString(R.string.description)));
        } else if (CardAdapter.s3) {
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.hurgh_rest_1), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.hurgh_rest_2), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.hurgh_rest_3), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.hurgh_rest_4), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.hurgh_rest_5), getString(R.string.description)));
        } else if (CardAdapter.s4) {
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.lux_rest_1), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.lux_rest_2), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.lux_rest_3), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.lux_rest_4), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.lux_rest_5), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.lux_rest_6), getString(R.string.description)));
        } else if (CardAdapter.s5) {
            mFoodArrayList.add(new Place(R.drawable.food, "Valley of the Kings", getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, "Karnak", getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, "Luxor Temple", getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, "Mortuary Temple of Hatshepsut", getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, "Medinet Habu", getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, "Luxor Museum", getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, "Ibn Hamido Seafood", getString(R.string.description)));
        } else if (CardAdapter.s6) {
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.port_rest_1), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.port_rest_2), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.port_rest_3), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.port_rest_4), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.port_rest_5), getString(R.string.description)));
        } else if (CardAdapter.s7) {
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.siwa_rest_1), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.siwa_rest_2), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.siwa_rest_3), getString(R.string.description)));
            mFoodArrayList.add(new Place(R.drawable.food, getString(R.string.siwa_rest_4), getString(R.string.description)));
        }

        mFoodList = rootView.findViewById(R.id.places_list);
        mFoodAdapter = new PlacesAdapter(mFoodArrayList, getContext());
        mFoodList.setAdapter(mFoodAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
