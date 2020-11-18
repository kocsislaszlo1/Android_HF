package com.androidunleashed.fragmentcodeapp;

import android.view.View;
import android.view.LayoutInflater;
import android.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.content.Intent;
import android.app.FragmentManager;

public class Fragment1Activity extends Fragment{

    protected static final String FRAG2 = "2";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Context c = getActivity().getApplicationContext();
        View vw = inflater.inflate(R.layout.fragment1, container, false);


        final String[] penz={"EUR",
                "USD",
                "GBP",
                "AUD"};
        final String[] vArray = {
                "4.4100 RON",
                "3.9750 RON",
                "6.1250 RON",
                "2.9600 RON"
        };

        final String[] eArray = {
                "4.5500 RON",
                "4.1450 RON",
                "6.3550 RON",
                "3.0600 RON"
        };
        ListView fruitsList = (ListView) vw.findViewById(R.id.penz_list);
        ArrayAdapter<String> arrayAdpt= new ArrayAdapter<String>(c, android.R.layout.simple_list_item_1, penz);
        fruitsList.setAdapter(arrayAdpt);

        final FragmentManager fragmentManager = getFragmentManager();
        fruitsList.setOnItemClickListener(new OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                if(fragmentManager.findFragmentByTag(FRAG2)!=null){
                    TextView selectedOpt = (TextView) getActivity().findViewById(R.id.selectedopt);
                    TextView selectedOpt2 = (TextView) getActivity().findViewById(R.id.selectedopt2);
                    TextView selectedOpt3 = (TextView) getActivity().findViewById(R.id.selectedopt3);
                    selectedOpt.setText("You have selected "+((TextView) v).getText().toString());
                    selectedOpt2.setText("Eladas "+eArray[position]);
                    selectedOpt3.setText("Vetel "+vArray[position]);
                } else {
                    Intent intent = new Intent(getActivity().getApplicationContext(),  ShowItemActivity.class);
                    intent.putExtra("item", ((TextView) v).getText().toString());
                    intent.putExtra("item", eArray[position]);
                    intent.putExtra("item", vArray[position]);
                    startActivity(intent);
                }
            }
        });
        return vw;
    }
}
