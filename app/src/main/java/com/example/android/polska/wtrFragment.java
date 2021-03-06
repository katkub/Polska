package com.example.android.polska;


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
public class wtrFragment extends Fragment {


    public wtrFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragments, container, false);

        // Adding ArraList of categories
        ArrayList<Fragments> cat3 = new ArrayList<>();
        // Adding elements to arralist
        cat3.add(new Fragments(getString(R.string.is), R.drawable.is));
        cat3.add(new Fragments(getString(R.string.naw), R.drawable.naw));
        cat3.add(new Fragments(getString(R.string.nawo), R.drawable.nawo));
        cat3.add(new Fragments(getString(R.string.wg), R.drawable.wg));

        // Finding listView in fragments.xml
        ListView listView = rootView.findViewById(R.id.list);

        //Adding adapter
        FragmentsAdapter adapter = new FragmentsAdapter(getActivity(), cat3);
        listView.setAdapter(adapter);
        // Set a click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
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
