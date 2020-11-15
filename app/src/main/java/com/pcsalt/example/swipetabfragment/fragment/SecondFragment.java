package com.pcsalt.example.swipetabfragment.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.pcsalt.example.swipetabfragment.R;

/**
 * Created by Krrishnaaaa on June 04, 2016
 */
public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag_2, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText("Second Fragment");
        return view;
    }
}
