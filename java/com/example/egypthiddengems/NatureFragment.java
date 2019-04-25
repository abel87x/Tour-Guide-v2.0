package com.example.egypthiddengems;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureFragment extends Fragment {

    private ArrayList<Place> mNatureArrayList;
    private ListView mNatureList;
    private PlacesAdapter mNatureAdapter;

    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        mNatureArrayList = new ArrayList<>();
        if (CardAdapter.s0) {
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.alex_nat_1), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.alex_nat_2), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.alex_nat_3), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.alex_nat_4), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.alex_nat_5), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.alex_nat_6), getString(R.string.description)));
        } else if (CardAdapter.s1) {
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.cairo_nat_1), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.cairo_nat_2), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.cairo_nat_3), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.cairo_nat_4), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.cairo_nat_5), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.cairo_nat_6), getString(R.string.description)));
        } else if (CardAdapter.s2) {
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.aswan_nat_1), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.aswan_nat_2), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.aswan_nat_3), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.aswan_nat_4), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.aswan_nat_5), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.aswan_nat_6), getString(R.string.description)));
        } else if (CardAdapter.s3) {
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.hurgh_nat_1), getString(R.string.description)));
        } else if (CardAdapter.s4) {
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.lux_nat_1), getString(R.string.description)));
        } else if (CardAdapter.s5) {
            TextView textView = new TextView(getActivity());
            textView.setText(getString(R.string.no_attraction));
            return textView;
        } else if (CardAdapter.s6) {
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.port_nat_1), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.port_nat_2), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.port_nat_3), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.port_nat_4), getString(R.string.description)));
            mNatureArrayList.add(new Place(R.drawable.nature, getString(R.string.port_nat_5), getString(R.string.description)));
        } else if (CardAdapter.s7) {
            TextView textView = new TextView(getActivity());
            textView.setText(getString(R.string.no_attraction));
            return textView;
        }

        mNatureList = rootView.findViewById(R.id.places_list);
        mNatureAdapter = new PlacesAdapter(mNatureArrayList, getContext());
        mNatureList.setAdapter(mNatureAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
