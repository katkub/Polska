package com.example.android.polska;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

class FragmentsAdapter extends ArrayAdapter<Fragments> {

    public FragmentsAdapter(FragmentActivity activity, ArrayList<Fragments> category) {
        super(activity, 0, category);
    }

    @NonNull
    @SuppressLint({"ViewHolder", "ResourceAsColor"})
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragments_item, parent, false);
        }
        // Get the  object located at this position in the list
        Fragments currentCategory = getItem(position);

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        TextView text = convertView.findViewById(R.id.text);
        assert currentCategory != null;
        text.setText(currentCategory.getTitle());

        // Find the ImageView in the fragments_item.xml layout with the ID image.
        ImageView imageView = convertView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentCategory.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentCategory.getImg());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Adding color to textView
            text.setTextColor(Color.parseColor("#c62828"));
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        return convertView;

    }

}