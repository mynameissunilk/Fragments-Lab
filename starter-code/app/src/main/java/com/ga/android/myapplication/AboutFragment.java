package com.ga.android.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

/**
 * Created by sunil on 7/19/16.
 */
public class AboutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(android.R.layout.simple_list_item_1,container,false);
        TextView tv = (TextView)view.findViewById(android.R.id.text1);
        tv.setText("I've done a lot with my life. I've done a lot of Law & Order, and my role in a Star Wars prequel didn't propel my career in the way it should have. I'm not resentful. I'm just Jimmy Smitts.");
        return view;
    }
}
