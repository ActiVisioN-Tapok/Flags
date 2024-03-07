package com.example.flags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViews);

        ArrayList<DataFlags> lst = new ArrayList<>();
        lst.clear();

        lst.add(new DataFlags(R.drawable.ru, R.string.rus, R.string.rub, R.string.msk));
        lst.add(new DataFlags(R.drawable.za, R.string.afr, R.string.zar, R.string.cpt));
        lst.add(new DataFlags(R.drawable.sg, R.string.sgp, R.string.sgd, R.string.sgr));
        lst.add(new DataFlags(R.drawable.tr, R.string.trk, R.string.trl, R.string.ank));
        lst.add(new DataFlags(R.drawable.de, R.string.ger, R.string.eur, R.string.brl));
        lst.add(new DataFlags(R.drawable.jp, R.string.jpn, R.string.jpy, R.string.tky));
        lst.add(new DataFlags(R.drawable.il, R.string.isr, R.string.ill, R.string.irs));

        MyListAdapter lstAd = new MyListAdapter(this, lst);
        listView.setAdapter(lstAd);

    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    */

/*
    public boolean OnOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

 */
}