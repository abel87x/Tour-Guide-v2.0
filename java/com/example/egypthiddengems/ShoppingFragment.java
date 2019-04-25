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
public class ShoppingFragment extends Fragment {

    private ArrayList<Place> mShoppingArrayList;
    private ListView mShoppingListView;
    private PlacesAdapter mShoppingAdapter;

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);

        mShoppingArrayList = new ArrayList<>();
        if (CardAdapter.s0) {
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.alex_shop_1), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.alex_shop_2), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.alex_shop_3), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.alex_shop_4), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.alex_shop_5), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.alex_shop_6), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.alex_shop_7), getString(R.string.description)));
        } else if (CardAdapter.s1) {
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.cairo_shop_1), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.cairo_shop_2), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.cairo_shop_3), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.cairo_shop_4), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.cairo_shop_5), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.cairo_shop_6), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.cairo_shop_7), getString(R.string.description)));
        } else if (CardAdapter.s2) {
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.aswan_shop_1), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.aswan_shop_2), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.aswan_shop_3), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.aswan_shop_4), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.aswan_shop_5), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.aswan_shop_6), getString(R.string.description)));
        } else if (CardAdapter.s3) {
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.hurgh_shop_1), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.hurgh_shop_2), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.hurgh_shop_3), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.hurgh_shop_4), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.hurgh_shop_5), getString(R.string.description)));
        } else if (CardAdapter.s4) {
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.lux_shop_1), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.lux_shop_2), getString(R.string.description)));
        } else if (CardAdapter.s5) {
            mShoppingArrayList.add(new Place(R.drawable.shopping, "Luxor Market", getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, "Luxor Bazar", getString(R.string.description)));
        } else if (CardAdapter.s6) {
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.port_shop_1), getString(R.string.description)));
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.port_shop_2), getString(R.string.description)));
        } else if (CardAdapter.s7) {
            mShoppingArrayList.add(new Place(R.drawable.shopping, getString(R.string.siwa_shop_1), getString(R.string.description)));
        }

        mShoppingListView = rootView.findViewById(R.id.places_list);
        mShoppingAdapter = new PlacesAdapter(mShoppingArrayList, getContext());
        mShoppingListView.setAdapter(mShoppingAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
