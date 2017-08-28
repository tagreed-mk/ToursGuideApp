package com.tagreed.abnd.toursguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends Fragment {

    public static final String Name = "Shopping";

    public ShoppingActivity() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_shopping);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_shopping, container, false);

        ArrayList<TourObject> shoppinglist = new ArrayList<>();
        shoppinglist.add(new TourObject(getResources().getString(R.string.shoppingOneName), getResources().getString(R.string.shoppingOneInfo)));
        shoppinglist.add(new TourObject(getResources().getString(R.string.shoppingTwoName), getResources().getString(R.string.shoppingTwoInfo)));
        shoppinglist.add(new TourObject(getResources().getString(R.string.shoppingThreeName), getResources().getString(R.string.shoppingThreeInfo)));

        ListView shoppingListView = (ListView) rootView.findViewById(R.id.shopping_list);
        TourAdapter shoppingAdapter = new TourAdapter(rootView.getContext(), shoppinglist);
        shoppingListView.setAdapter(shoppingAdapter);
        return rootView;
    }
}
