package com.pcsalt.example.swipetabfragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pcsalt.example.swipetabfragment.R;

/**
 * Created by Krrishnaaaa on June 04, 2016
 */
public class FirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag_1, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText("First Fragment");
        return view;
    }
}
