package com.example.android.polska;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class attractionsAdapter extends ArrayAdapter<Fragments> {
    public attractionsAdapter(@NonNull Context context, ArrayList cats) {
        super(context, 0, cats);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attractions, parent, false);
        }

        // Get the {@link Fragments} object located at this position in the list
        Fragments currentAt = getItem(position);
        // Find the TextView in the attractions.xml layout with the ID text.
        TextView text = convertView.findViewById(R.id.text);
        // Adding currentAt to textView
        assert currentAt != null;
        text.setText(currentAt.getTitle());
        // Find the ImageView in the attractions.xml layout with the ID image.
        ImageView imageView = convertView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentAt.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentAt.getImg());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        // Return the whole list item layout so that it can be shown in the ListView.
        return convertView;
    }
}
