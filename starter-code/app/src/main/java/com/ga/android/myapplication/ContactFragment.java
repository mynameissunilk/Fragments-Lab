package com.ga.android.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sunil on 7/19/16.
 */
public class ContactFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(android.R.layout.simple_list_item_1,container,false);
        TextView textview = (TextView)view.findViewById(android.R.id.text1);
        textview.setText("Name: Jimmy Smitts\n Contact: 111-234-5677\nAddress: 123 Smitts Lane, 456 Smitts Place, Smitts,NY");
        return view;
    }
}
