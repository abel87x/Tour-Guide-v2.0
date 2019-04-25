package com.example.egypthiddengems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Place> {

    private Context mContext;
    private ArrayList<Place> mPlacesList;

    public PlacesAdapter(ArrayList<Place> list, Context c) {
        super(c, 0, list);

        this.mContext = c;
        this.mPlacesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        Place currentItem = getItem(position);

        View currentView = convertView;
        if (currentView == null) {
            currentView = LayoutInflater.from(mContext).inflate(R.layout.place_item_in_list, parent, false);
        }

        ImageView placeImage = currentView.findViewById(R.id.place_img);
        placeImage.setImageResource(currentItem.getPlaceImageResource());

        TextView placeName = currentView.findViewById(R.id.place_name);
        placeName.setText(currentItem.getPlaceName());

        TextView placeDescription = currentView.findViewById(R.id.place_desc);
        placeDescription.setText(currentItem.getPlaceDescription());


        return currentView;
    }
}
