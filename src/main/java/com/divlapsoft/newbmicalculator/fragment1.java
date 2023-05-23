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
 * Use the {@link fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment1 extends Fragment {
    View view;
    EditText entHeight,entWeight;
    TextView bmiCalculate;
    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_fragment1, container, false);
        entHeight=view.findViewById(R.id.enterHeight);
        entWeight=view.findViewById(R.id.enterWeight);
        bmiCalculate=view.findViewById(R.id.outView);
        btn=view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float height=Float.parseFloat(entHeight.getText().toString());
                float weight=Float.parseFloat(entWeight.getText().toString());
                float bmi=weight/(height*height);
                bmiCalculate.setText(String.valueOf(bmi));
            }
        });

        return  view;
    }
}