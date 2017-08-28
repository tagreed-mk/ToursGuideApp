package com.tagreed.abnd.toursguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends Fragment {
    public static final String Name = "Family";

    public FamilyActivity() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_family);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_family, container, false);

        ArrayList<TourObject> familyList = new ArrayList<>();
        familyList.add(new TourObject(getResources().getString(R.string.familyOneName), getResources().getString(R.string.familyOneInfo), R.drawable.londoneye));
        familyList.add(new TourObject(getResources().getString(R.string.familyTwoName), getResources().getString(R.string.familyTwoInfo), R.drawable.shreks));
        familyList.add(new TourObject(getResources().getString(R.string.familyThreeName), getResources().getString(R.string.familyThreeInfo), R.drawable.zoo));

        ListView familyListView = (ListView) rootView.findViewById(R.id.family_list);
        TourAdapter familyAdapter = new TourAdapter(rootView.getContext(), familyList);
        familyListView.setAdapter(familyAdapter);
        return rootView;
    }
}
