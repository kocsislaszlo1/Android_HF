package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.ContextMenu;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.Toast;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] szinek = {"Piros","Zold","Sarga"};

    List<String> list = new ArrayList<String>(Arrays.asList(szinek));
    ArrayAdapter adapter;
    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView = findViewById(R.id.listviewid);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.Sort:
                Collections.sort(list);

                return true;
            case R.id.Delete:
                list.removeAll(list);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.piros:
                adapter.notifyDataSetChanged();
                return true;
            case R.id.zold:

                adapter.notifyDataSetChanged();
                return true;
            case R.id.sarga:

                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

}