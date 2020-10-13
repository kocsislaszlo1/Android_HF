package com.example.hazi_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText szam1 = findViewById(R.id.szam1);
        final EditText szam2 = findViewById(R.id.szam2);
        final TextView eredmeny1 = findViewById(R.id.eredmeny1);
        final TextView eredmeny2 = findViewById(R.id.eredmeny1);
        final TextView eredmeny3 = findViewById(R.id.eredmeny1);
        final TextView eredmeny4 = findViewById(R.id.eredmeny1);
        Button gomb = findViewById(R.id.button);
        Button gomb2 = findViewById(R.id.button2);
        Button gomb3 = findViewById(R.id.button3);
        Button gomb4 = findViewById(R.id.button4);


        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg = Double.parseDouble(szam1.getText().toString()) + Double.parseDouble(szam2.getText().toString());
                eredmeny1.setText(Double.toString(osszeg));
            }
        });
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg2 = Double.parseDouble(szam1.getText().toString()) - Double.parseDouble(szam2.getText().toString());
                eredmeny2.setText(Double.toString(osszeg2));
            }
        });
        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg3 = Double.parseDouble(szam1.getText().toString()) * Double.parseDouble(szam2.getText().toString());
                eredmeny3.setText(Double.toString(osszeg3));
            }
        });
        gomb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg4 = Double.parseDouble(szam1.getText().toString()) / Double.parseDouble(szam2.getText().toString());
                eredmeny4.setText(Double.toString(osszeg4));
            }
        });


    }
}