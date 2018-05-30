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
public class wtsFragment extends Fragment {


    public wtsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragments, container, false);

        // Adding ArraList of categories
        final ArrayList<Fragments> category = new ArrayList<>();
        // Adding elements to arrayList
        category.add(new Fragments(getString(R.string.unesco), R.drawable.unesco));
        category.add(new Fragments(getString(R.string.zip), R.drawable.zip));
        category.add(new Fragments(getString(R.string.mis), R.drawable.mis));
        category.add(new Fragments(getString(R.string.pn), R.drawable.pn));

        // Adding listView
        ListView listView = rootView.findViewById(R.id.list);
        //Adding adapter
        final FragmentsAdapter adapter = new FragmentsAdapter(getActivity(), category);
        listView.setAdapter(adapter);

        // Set a click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Adding data to string
                TextView textView = view.findViewById(R.id.text);
                String text = textView.getText().toString();

                // Creating new intent and sending there ours data
                Intent intent = new Intent(getActivity(), attractionsActivity.class);
                intent.putExtra("pos", text);
                startActivity(intent);

            }
        });

        return rootView;
    }

}
