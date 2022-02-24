package com.example.myapplication.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class ZoneActivity extends AppCompatActivity {

    private ListView listZone;
    private String[] ZoneArray;
    private ArrayAdapter<String> adapterZone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone);

        listZone = findViewById(R.id.listZone);
        ZoneArray = getResources().getStringArray(R.array.zone_array);
        adapterZone = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ZoneArray);
        listZone.setAdapter(adapterZone);
    }
}