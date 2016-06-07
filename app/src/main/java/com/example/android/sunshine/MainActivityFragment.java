package com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> mForecastAdapter;

        String[] forecastArray = {
        "Today - Sunny - 88/63",
        "Tomorrow - Cloudy - 77/69",
        "Wed - Sunny - 78/55",
        "Thur - Partly - 88/99",
        "Fri - Storms - 55/44",
        "Sat - Sunny - 87/65" };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        mForecastAdapter = new ArrayAdapter<String>(
            getActivity(),
                R.layout.list_item_forecast,
            R.id.list_item_forecast_textview,
            weekForecast
            );

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listview = (ListView) rootView.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);

        return rootView;
    }
}
