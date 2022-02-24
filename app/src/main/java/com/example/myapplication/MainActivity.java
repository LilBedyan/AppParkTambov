package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.ui.home.AttractActivity;
import com.example.myapplication.ui.home.EventsActivity;
import com.example.myapplication.ui.home.FoodActivity;
import com.example.myapplication.ui.home.ZoneActivity;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    Button ButtAttract, ButtEvents, ButtFood, ButtZone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.myapplication.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.toolbar.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_personal_info, R.id.nav_history, R.id.nav_skidki)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        ButtAttract = findViewById(R.id.butt_attract);
        ButtAttract.setOnClickListener(this::onClick);
        ButtEvents = findViewById(R.id.butt_events);
        ButtEvents.setOnClickListener(this::onClick);
        ButtFood = findViewById(R.id.butt_food);
        ButtFood.setOnClickListener(this::onClick);
        ButtZone = findViewById(R.id.butt_zone);
        ButtZone.setOnClickListener(this::onClick);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.butt_attract) {
            Intent intentAttract = new Intent(this, AttractActivity.class);
            startActivity(intentAttract);
        }
        if (view.getId() == R.id.butt_events) {
            Intent intentEvents = new Intent(this, EventsActivity.class);
            startActivity(intentEvents);
        }
        if (view.getId() == R.id.butt_food) {
            Intent intentFood = new Intent(this, FoodActivity.class);
            startActivity(intentFood);
        }
        if (view.getId() == R.id.butt_zone) {
            Intent intentZone = new Intent(this, ZoneActivity.class);
            startActivity(intentZone);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}