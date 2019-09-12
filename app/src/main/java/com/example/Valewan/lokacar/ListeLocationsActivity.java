package com.example.jocelynjoubert2017.lokacar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.example.jocelynjoubert2017.lokacar.dal.AppDataBase;
import com.example.jocelynjoubert2017.lokacar.entities.Client;
import com.example.jocelynjoubert2017.lokacar.entities.Location;
import com.example.jocelynjoubert2017.lokacar.entities.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class ListeLocationsActivity extends AppCompatActivity implements RecyclerView.OnItemTouchListener {

    private RecyclerView recyclerView = null;
    private AppDataBase appDataBase;
    private List<Location> listeLocations = new ArrayList<>();

    // Adapter :
    private ListeLocationsAdapter listeLocationsAdapter = null;

    // Gesture detector :
    private GestureDetector gestureDetector = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_locations);

        // vues :
        recyclerView = findViewById(R.id.liste_locations);

        // à ajouter pour de meilleures performances :
        recyclerView.setHasFixedSize(true);

        // layout manager, décrivant comment les items sont disposés :
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        appDataBase = AppDataBase.getDataBase(this);

        // listener :
        recyclerView.addOnItemTouchListener(this);
        gestureDetector = new GestureDetector(this,
                new GestureDetector.SimpleOnGestureListener()
                {
                    @Override
                    public boolean onSingleTapUp(MotionEvent event)
                    {
                        return true;
                    }
                });

        launchThread();
    }

    /**
     * Permet de lancer la requete dans un thread
     */
    private void launchThread(){
        listeLocations.clear();
        Log.i("tz", "liste : " + listeLocations);
// mettre un loader
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                listeLocations = appDataBase.locationDAO().getAll();
                for (Location l:listeLocations) {
                    l.setClient(appDataBase.clientDAO().selectById(l.getClientId()));
                }

                //Modele modele = appDataBase.modeleDAO().selectById(1);

                listeLocationsAdapter = new ListeLocationsAdapter(listeLocations);
                recyclerView.setLayoutManager(new LinearLayoutManager(ListeLocationsActivity.this));
                recyclerView.setAdapter(listeLocationsAdapter);

                Log.i("tz", "liste : " + listeLocations);
            }

        });

        if (!thread.isAlive()) {
            thread.start();
        }
    }




    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent motionEvent)
    {
        if (gestureDetector.onTouchEvent(motionEvent))
        {
            // récupération de l'item cliqué :
            View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());

            // position dans la liste d'objets métier (position à partir de zéro !) :
            if (child != null)
            {
                int position = recyclerView.getChildAdapterPosition(child);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {}

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

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
}
