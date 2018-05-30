package com.example.android.polska;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class citFragment extends Fragment {


    public citFragment() {
        // Required empty public constructor
    }


    @SuppressLint({"NewApi", "ResourceAsColor"})
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragments, container, false);

        // Create a list of cities
        final ArrayList<Fragments> city = new ArrayList<>();
        city.add(new Fragments(getString(R.string.bialystok)));
        city.add(new Fragments(getString(R.string.gdansk)));
        city.add(new Fragments(getString(R.string.opole)));
        city.add(new Fragments(getString(R.string.krk)));
        city.add(new Fragments(getString(R.string.lublin)));
        city.add(new Fragments(getString(R.string.poznan)));
        city.add(new Fragments(getString(R.string.torun)));
        city.add(new Fragments(getString(R.string.wawa)));
        city.add(new Fragments(getString(R.string.wro)));

        // Create an {@link FragmentsAdapter}, whose data source is a list of {@link city}. The
        // adapter knows how to create list items for each item in the list.
        FragmentsAdapter adapter = new FragmentsAdapter(getActivity(), city);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragments.xml layout file.
        final ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FragmentsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Fragments} in the list.
        listView.setAdapter(adapter);
        listView.setPadding(0,10,0,0);

        // Set a click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Adding data to send them to new intent
                TextView textView = view.findViewById(R.id.text);
                String text = textView.getText().toString();

                // Adding new intent and sending data
                Intent intent = new Intent(getActivity(), attractionsActivity.class);
                intent.putExtra("pos", text);
                startActivity(intent);
            }
        });

        return rootView;
    }
}