package com.example.egypthiddengems;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter {

    public static boolean s0, s1, s2, s3, s4, s5, s6, s7;
    private ArrayList<Card> mDataSet;
    private Context mContext;

    public CardAdapter(ArrayList<Card> data, Context context) {
        this.mDataSet = data;
        this.mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        //Inflating the layout/View that will be populated with information
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_card, parent, false);

        MyViewHolder holder = new MyViewHolder(v, mContext);

        return holder;
    }

    //Binding the information with the children of the layout/view
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        MyViewHolder customHolder = (MyViewHolder) holder;

        customHolder.getTextView().setText(mDataSet.get(position).getCardName());
        customHolder.getImageView().setImageResource(mDataSet.get(position).getCardImageResource());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;
        private ImageView mImageView;
        private Context mHolderContext;

        public MyViewHolder(View v, final Context context) {
            super(v);
            mTextView = v.findViewById(R.id.city_txt);
            mImageView = v.findViewById(R.id.city_img);
            mHolderContext = context;

            //In the next lines, we are using static booleans s0 to s7 to detect which city the user has clicked
            //In order to launch respective city information
            mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getAdapterPosition()) {
                        case 0:
                            s0 = true;
                            s1 = s2 = s3 = s4 = s5 = s6 = s7 = false;
                            break;
                        case 1:
                            s1 = true;
                            s0 = s2 = s3 = s4 = s5 = s6 = s7 = false;
                            break;
                        case 2:
                            s2 = true;
                            s0 = s1 = s3 = s4 = s5 = s6 = s7 = false;
                            break;
                        case 3:
                            s3 = true;
                            s0 = s1 = s2 = s4 = s5 = s6 = s7 = false;
                            break;
                        case 4:
                            s4 = true;
                            s0 = s1 = s2 = s3 = s5 = s6 = s7 = false;
                            break;
                        case 5:
                            s5 = true;
                            s0 = s1 = s2 = s3 = s4 = s6 = s7 = false;
                            break;
                        case 6:
                            s6 = true;
                            s0 = s1 = s2 = s3 = s4 = s5 = s7 = false;
                            break;
                        case 7:
                            s7 = true;
                            s0 = s1 = s2 = s3 = s4 = s5 = s6 = false;
                            break;
                    }

                    //Creating an Intent with some transition animations and starting the activity
                    Intent mIntent = new Intent(mHolderContext, AttractionsActivity.class);
                    mIntent.putExtra("img_id", mDataSet.get(getAdapterPosition()).getCardImageResource());
                    Pair sharedImage = new Pair<>(mImageView, "city_img_transition");
                    mHolderContext.startActivity(mIntent, ActivityOptions.makeSceneTransitionAnimation((Activity) mHolderContext, sharedImage).toBundle());
                }
            });
        }

        public TextView getTextView() {
            return mTextView;
        }

        public ImageView getImageView() {
            return mImageView;
        }

    }

}
