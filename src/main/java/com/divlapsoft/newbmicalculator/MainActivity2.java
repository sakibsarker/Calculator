package com.divlapsoft.newbmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btn1,btn2;
    TextView dataPassedView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String data=intent.getStringExtra("name");
        dataPassedView=findViewById(R.id.dataPassed);
        dataPassedView.setText(data);



        btn1=findViewById(R.id.btnUSD);
        btn2=findViewById(R.id.btnBMI);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replace(new fragment1());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replace(new fragment2());
            }
        });
    }

    private void replace(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framLayout1,fragment);
        fragmentTransaction.commit();
    }
}