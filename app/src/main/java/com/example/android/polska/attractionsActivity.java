package com.example.android.polska;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class attractionsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragments);

        // Getting data from fragments
        Intent intent = getIntent();
        String pos = intent.getStringExtra("pos");

        // Adding ArrayLists of attractions for all categories from listView
        final ArrayList<Fragments> cats = new ArrayList<>();
        if (pos.equals(getString(R.string.unesco))) {
            //For unesco
            cats.add(new Fragments(R.drawable.kopalnia, getString(R.string.kopalnia)));
            cats.add(new Fragments(R.drawable.cerkwie, getString(R.string.cerkwie)));
            cats.add(new Fragments(R.drawable.park, getString(R.string.park)));
            cats.add(new Fragments(R.drawable.starawawa, getString(R.string.starawawa)));
            cats.add(new Fragments(R.drawable.kompleks, getString(R.string.kompleks)));
            cats.add(new Fragments(R.drawable.malbork, getString(R.string.malbork)));
        } else if (pos.equals(getString(R.string.zip))) {
            //For Castles and Palaces
            cats.add(new Fragments(R.drawable.pal1, getString(R.string.pal1)));
            cats.add(new Fragments(R.drawable.pal2, getString(R.string.pal2)));
            cats.add(new Fragments(R.drawable.pal3, getString(R.string.pal3)));
            cats.add(new Fragments(R.drawable.pal4, getString(R.string.pal4)));
        } else if (pos.equals(getString(R.string.mis))) {
            //For Museums and Open-Air Museums
            cats.add(new Fragments(R.drawable.m1, getString(R.string.m1)));
            cats.add(new Fragments(R.drawable.m2, getString(R.string.m2)));
            cats.add(new Fragments(R.drawable.m3, getString(R.string.m3)));
            cats.add(new Fragments(R.drawable.m4, getString(R.string.m4)));
            //For National Parks
            cats.add(new Fragments(R.drawable.n1, getString(R.string.n1)));
            cats.add(new Fragments(R.drawable.n2, getString(R.string.n2)));
            cats.add(new Fragments(R.drawable.n3, getString(R.string.n3)));
            cats.add(new Fragments(R.drawable.n4, getString(R.string.n4)));
        } else if (pos.equals(getString(R.string.is))) {
            //For In SPA
            cats.add(new Fragments(R.drawable.u1, getString(R.string.u1)));
            cats.add(new Fragments(R.drawable.u2, getString(R.string.u2)));
            cats.add(new Fragments(R.drawable.u3, getString(R.string.u3)));
            cats.add(new Fragments(R.drawable.u4, getString(R.string.u4)));
        } else if (pos.equals(getString(R.string.naw))) {
            //For In the Countryside
            cats.add(new Fragments(R.drawable.naw1, getString(R.string.naw1)));
            cats.add(new Fragments(R.drawable.naw2, getString(R.string.naw2)));
            cats.add(new Fragments(R.drawable.naw3, getString(R.string.naw3)));
        } else if (pos.equals(getString(R.string.nawo))) {
            //For Over the Water
            cats.add(new Fragments(R.drawable.nawo1, getString(R.string.nawo1)));
            cats.add(new Fragments(R.drawable.nawo2, getString(R.string.nawo2)));
            cats.add(new Fragments(R.drawable.nawo3, getString(R.string.nawo3)));
            cats.add(new Fragments(R.drawable.nawo4, getString(R.string.nawo4)));
        } else if (pos.equals(getString(R.string.wg))) {
            //For In the Mountains
            cats.add(new Fragments(R.drawable.wg1, getString(R.string.wg1)));
            cats.add(new Fragments(R.drawable.wg2, getString(R.string.wg2)));
            cats.add(new Fragments(R.drawable.wg3, getString(R.string.wg3)));
            cats.add(new Fragments(R.drawable.wg4, getString(R.string.wg4)));
        } else if (pos.equals(getString(R.string.pise))) {
            //For Adventure and Extreme Sports
            cats.add(new Fragments(R.drawable.a1, getString(R.string.a1)));
            cats.add(new Fragments(R.drawable.a2, getString(R.string.a2)));
            cats.add(new Fragments(R.drawable.a3, getString(R.string.a3)));
            cats.add(new Fragments(R.drawable.a4, getString(R.string.a4)));
        } else if (pos.equals(getString(R.string.nw))) {
            //For  On the Water
            cats.add(new Fragments(R.drawable.w1, getString(R.string.w1)));
            cats.add(new Fragments(R.drawable.w2, getString(R.string.w2)));
            cats.add(new Fragments(R.drawable.w3, getString(R.string.w3)));
            cats.add(new Fragments(R.drawable.w4, getString(R.string.w4)));
        } else if (pos.equals(getString(R.string.z))) {
            //For in the Winter
            cats.add(new Fragments(R.drawable.win1, getString(R.string.win1)));
            cats.add(new Fragments(R.drawable.win2, getString(R.string.win2)));
            cats.add(new Fragments(R.drawable.win3, getString(R.string.win3)));
            cats.add(new Fragments(R.drawable.win4, getString(R.string.win4)));
        } else if (pos.equals(getString(R.string.siw))) {
            //For SPA and Wellnes
            cats.add(new Fragments(R.drawable.s1, getString(R.string.s1)));
            cats.add(new Fragments(R.drawable.s2, getString(R.string.s2)));
            cats.add(new Fragments(R.drawable.s3, getString(R.string.s3)));
            cats.add(new Fragments(R.drawable.s4, getString(R.string.s4)));

        } else if (pos.equals(getString(R.string.bialystok))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.bial1, getString(R.string.bial1)));
            cats.add(new Fragments(R.drawable.bial2, getString(R.string.bial2)));
            cats.add(new Fragments(R.drawable.bial3, getString(R.string.bial3)));
            cats.add(new Fragments(R.drawable.bial4, getString(R.string.bial4)));
            // For Gdańsk
        } else if (pos.equals(getString(R.string.gdansk))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.gd1, getString(R.string.gd1)));
            cats.add(new Fragments(R.drawable.gd2, getString(R.string.gd2)));
            cats.add(new Fragments(R.drawable.gd3, getString(R.string.gd3)));
            cats.add(new Fragments(R.drawable.gd4, getString(R.string.gd4)));
            // For Opole
        } else if (pos.equals(getString(R.string.opole))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.op2, getString(R.string.op2)));
            cats.add(new Fragments(R.drawable.op3, getString(R.string.op3)));
            cats.add(new Fragments(R.drawable.op4, getString(R.string.op4)));
            cats.add(new Fragments(R.drawable.op5, getString(R.string.op5)));
            // For Kraków
        } else if (pos.equals(getString(R.string.krk))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.krk1, getString(R.string.krk1)));
            cats.add(new Fragments(R.drawable.krk2, getString(R.string.krk2)));
            cats.add(new Fragments(R.drawable.krk3, getString(R.string.krk3)));
            cats.add(new Fragments(R.drawable.krk4, getString(R.string.krk4)));
            // For Lublin
        } else if (pos.equals(getString(R.string.lublin))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.lb1, getString(R.string.lb1)));
            cats.add(new Fragments(R.drawable.lb2, getString(R.string.lb2)));
            cats.add(new Fragments(R.drawable.lb3, getString(R.string.lb3)));
            cats.add(new Fragments(R.drawable.lb4, getString(R.string.lb4)));
            // For Poznań
        } else if (pos.equals(getString(R.string.poznan))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.pz1, getString(R.string.pz1)));
            cats.add(new Fragments(R.drawable.pz2, getString(R.string.pz2)));
            cats.add(new Fragments(R.drawable.pz3, getString(R.string.pz3)));
            cats.add(new Fragments(R.drawable.pz4, getString(R.string.pz4)));
            // For Toruń
        } else if (pos.equals(getString(R.string.torun))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.t1, getString(R.string.t1)));
            cats.add(new Fragments(R.drawable.t2, getString(R.string.t2)));
            cats.add(new Fragments(R.drawable.t3, getString(R.string.t3)));
            cats.add(new Fragments(R.drawable.t4, getString(R.string.t4)));
            // For Warszawa
        } else if (pos.equals(getString(R.string.wawa))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.ww1, getString(R.string.ww1)));
            cats.add(new Fragments(R.drawable.ww2, getString(R.string.ww2)));
            cats.add(new Fragments(R.drawable.ww3, getString(R.string.ww3)));
            cats.add(new Fragments(R.drawable.ww4, getString(R.string.ww4)));
            // For Wrocław
        } else if (pos.equals(getString(R.string.wro))) {
            // add city attractions
            cats.add(new Fragments(R.drawable.wr1, getString(R.string.wr1)));
            cats.add(new Fragments(R.drawable.wr3, getString(R.string.wr3)));
            cats.add(new Fragments(R.drawable.wr4, getString(R.string.wr4)));
        }

        // Create an {@link attractionsAdapter}, whose data source is a list of {@link attractions}. The
        // adapter knows how to create list items for each item in the list.
        attractionsAdapter adapter = new attractionsAdapter(this, cats);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragments.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link attractionsAdapter} we created above, so that the
        // {@link ListView} will display list items in the list.
        listView.setAdapter(adapter);
    }}