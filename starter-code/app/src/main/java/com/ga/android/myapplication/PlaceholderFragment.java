package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class PlaceholderFragment extends Fragment {
ImageView img;
   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.image_layout,container,false);
      img = (ImageView)view.findViewById(R.id.thumbnail);
      img.setImageResource(R.mipmap.smitts);
      return view;
   }
}
