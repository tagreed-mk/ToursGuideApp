package com.tagreed.abnd.toursguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends Fragment {
    public static final String Name = "Museums";

    public MuseumsActivity() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_museums);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_museums, container, false);

        ArrayList<TourObject> museumList = new ArrayList<>();
        museumList.add(new TourObject(getResources().getString(R.string.museumOneName), getResources().getString(R.string.museumOneInfo)));
        museumList.add(new TourObject(getResources().getString(R.string.museumTwoName), getResources().getString(R.string.museumTowInfo)));
        museumList.add(new TourObject(getResources().getString(R.string.museumThreeName), getResources().getString(R.string.museumThreeInfo)));
        museumList.add(new TourObject(getResources().getString(R.string.musemFourName), getResources().getString(R.string.musemFourInfo)));
        ListView museumListView = (ListView) rootView.findViewById(R.id.museum_list);
        TourAdapter museumAdapter = new TourAdapter(rootView.getContext(), museumList);
        museumListView.setAdapter(museumAdapter);
        return rootView;
    }
}
