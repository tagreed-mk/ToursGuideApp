package com.tagreed.abnd.toursguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tagreed on 8/26/2017.
 */

public class TourAdapter extends ArrayAdapter<TourObject> {

    public TourAdapter(Context context, List<TourObject> tourObjects) {
        super(context, 0, tourObjects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tour_list_item, parent, false);
        }
        TourObject currentTourObj = getItem(position);
        TextView tourNameView = (TextView) listItemView.findViewById(R.id.tour_name);
        tourNameView.setText(currentTourObj.getMobjName());

        TextView tourInfoView = (TextView) listItemView.findViewById(R.id.tour_info);
        tourInfoView.setText(currentTourObj.getmObjInfo());

        ImageView iconImg = (ImageView) listItemView.findViewById(R.id.tour_image);
        if (currentTourObj.hasImage()) {
            iconImg.setImageResource(currentTourObj.getmObjImage());
            iconImg.setVisibility(View.VISIBLE);
        } else {
            iconImg.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
