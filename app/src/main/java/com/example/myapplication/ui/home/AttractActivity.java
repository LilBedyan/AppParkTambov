package com.example.myapplication.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class AttractActivity extends AppCompatActivity {

    private ListView listAttract;
    private String[] AttactArray;
    private ArrayAdapter<String> adapterAttract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attract);

        listAttract = findViewById(R.id.listAttract);
        AttactArray = getResources().getStringArray(R.array.attract_array);
        adapterAttract = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, AttactArray);
        listAttract.setAdapter(adapterAttract);
    }
}