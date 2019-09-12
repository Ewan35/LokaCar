package com.example.Valewan.lokacar;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String bienvenue = getIntent().getStringExtra("bienvenue");

        TextView labelBievenue = findViewById(R.id.bienvenue_label);
        labelBievenue.setText(bienvenue);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_test, menu);
        return true;
    }

    //gère le click sur une action de l'ActionBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_menu) {
            Intent intent = new Intent (this, MenuActivity.class);
            startActivity(intent);
        }

        return true;
    }

    public void clicVoitures (View view) {

        Intent intent = new Intent (this, ListeVoituresActivity.class);
        startActivity(intent);
    }

    public void clicClients (View view) {

        Intent intent = new Intent (this, ListeClientsActivity.class);
        startActivity(intent);
    }

    public void clicChiffreAffaire (View view) {

        Intent intent = new Intent (this, ChiffreAffaireActivity.class);
        startActivity(intent);
    }

    public void clicLocations (View view) {

        Intent intent = new Intent (this, ListeLocationsActivity.class);
        startActivity(intent);
    }
}
