package ro.sapi.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pali on 10/5/2017.
 */

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final String[] vArray;
    private final String[] eArray;
    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;

    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, String[] vArray,String[] eArray){

        super(context, R.layout.listview_row, nameArrayParam);
        this.context=context;
        this.eArray = eArray;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
        this.vArray=vArray;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextViewID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoTextViewID);
       TextView elad  = (TextView) rowView.findViewById(R.id.eladas);
        TextView  vetel = (TextView) rowView.findViewById(R.id.vetel);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);

        elad.setText(eArray[position]);
        vetel.setText(vArray[position]);


        return rowView;

    }
}
