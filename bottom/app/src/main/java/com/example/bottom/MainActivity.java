package com.example.bottom;

import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
                switch (menuItem.getItemId()) {
                    case R.id.home:
                     break;
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(), com.example.bottom.Dasboard.class));

                        overridePendingTransition(2,0 );

                        break;

                    case R.id.about:
                        startActivity(new Intent(getApplicationContext(), com.example.bottom.About.class));

                        overridePendingTransition(2, 0);
                        break;
                }
                return false;
            }
        });
    }
}
