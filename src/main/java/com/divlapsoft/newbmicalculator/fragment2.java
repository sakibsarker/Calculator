package com.divlapsoft.newbmicalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment2 extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Button btn;
        TextView usdshow;
        EditText enterbdt;
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_fragment2, container, false);
        enterbdt=view.findViewById(R.id.bdt);
        usdshow=view.findViewById(R.id.outView);
        btn=view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num=Integer.parseInt(enterbdt.getText().toString());
                Integer num_result=num/85;
                usdshow.setText(String.valueOf(num_result));
            }
        });
        return view;
    }
}