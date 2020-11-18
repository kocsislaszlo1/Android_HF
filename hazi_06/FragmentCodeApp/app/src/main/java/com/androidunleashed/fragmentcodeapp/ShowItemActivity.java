package com.androidunleashed.fragmentcodeapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class ShowItemActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.fragment2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedItem = extras.getString("item");
            String selectedItem2= extras.getString("item");
            String selectedItem3 = extras.getString("item");
            TextView textView = (TextView) findViewById(R.id.selectedopt);
            TextView textView2 = (TextView) findViewById(R.id.selectedopt2);
            TextView textView3 = (TextView) findViewById(R.id.selectedopt3);
            textView.setText("You have selected "+selectedItem);
            textView2.setText("Eladas "+selectedItem2);
            textView3.setText("Vetel "+selectedItem3);
        }
    }
}
