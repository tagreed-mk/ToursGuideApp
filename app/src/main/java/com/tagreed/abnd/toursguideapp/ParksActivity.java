package com.tagreed.abnd.toursguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends Fragment {

    public static final String Name = "Parks";

    public ParksActivity() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_parks);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_parks, container, false);

        ArrayList<TourObject> parklist = new ArrayList<>();
        parklist.add(new TourObject(getResources().getString(R.string.parkOneName), getResources().getString(R.string.parkOneInfo), R.drawable.parks));
        parklist.add(new TourObject(getResources().getString(R.string.parkTwoName), getResources().getString(R.string.parkTwoInfo), R.drawable.parks));
        parklist.add(new TourObject(getResources().getString(R.string.parkThreeName), getResources().getString(R.string.parkThreeInfo), R.drawable.parks));
        parklist.add(new TourObject(getResources().getString(R.string.parkFourName), getResources().getString(R.string.parkFourInfo), R.drawable.parks));
        parklist.add(new TourObject(getResources().getString(R.string.parkFiveName), getResources().getString(R.string.parkFiveInfo), R.drawable.parks));
        ListView parklistView = (ListView) rootView.findViewById(R.id.park_list);
        TourAdapter parkAdapter = new TourAdapter(rootView.getContext(), parklist);
        parklistView.setAdapter(parkAdapter);
        return rootView;
    }

}
