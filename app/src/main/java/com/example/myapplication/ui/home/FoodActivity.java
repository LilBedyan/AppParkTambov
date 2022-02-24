package com.example.myapplication.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class FoodActivity extends AppCompatActivity {

    private ListView listFood;
    private String[] FoodArray;
    private ArrayAdapter<String> adapterFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        listFood = findViewById(R.id.listFood);
        FoodArray = getResources().getStringArray(R.array.food_array);
        adapterFood = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, FoodArray);
        listFood.setAdapter(adapterFood);
    }
}