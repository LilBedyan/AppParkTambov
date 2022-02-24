package com.example.myapplication.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class EventsActivity extends AppCompatActivity {

    private ListView listEvents;
    private String[] EventsArray;
    private ArrayAdapter<String> adapterEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        listEvents = findViewById(R.id.listEvents);
        EventsArray = getResources().getStringArray(R.array.events_array);
        adapterEvents = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, EventsArray);
        listEvents.setAdapter(adapterEvents);
    }
}