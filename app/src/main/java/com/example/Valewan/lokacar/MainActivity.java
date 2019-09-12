package com.example.Valewan.lokacar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.Valewan.lokacar.entities.Client;
import com.example.Valewan.lokacar.entities.Location;
import com.example.Valewan.lokacar.entities.Marque;
import com.example.Valewan.lokacar.entities.Modele;
import com.example.Valewan.lokacar.entities.Vehicule;

import java.util.Date;

import static com.example.Valewan.lokacar.dal.AppDataBase.getDataBase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {

                getDataBase(MainActivity.this).marqueDAO().nukeTable();
                getDataBase(MainActivity.this).marqueDAO().insert(new Marque("Renault"));
                getDataBase(MainActivity.this).marqueDAO().insert(new Marque("Peugeot"));
                getDataBase(MainActivity.this).marqueDAO().insert(new Marque("Ford"));
                getDataBase(MainActivity.this).marqueDAO().insert(new Marque("Volkswagen"));
                getDataBase(MainActivity.this).marqueDAO().insert(new Marque("Toyota"));
                getDataBase(MainActivity.this).marqueDAO().insert(new Marque("Mazda"));

                getDataBase(MainActivity.this).modeleDAO().nukeTable();
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("Clio", Modele.CITADINE, Modele.ESSENCE, 25, "http://urlz.fr/7iyW", "Renault"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("Mégane", Modele.BERLINE, Modele.DIESEL, 35, "http://urlz.fr/7iz2", "Renault"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("3008", Modele.SUV, Modele.DIESEL, 55, "http://urlz.fr/7iz4", "Peugeot"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("308", Modele.COMPACTE, Modele.ESSENCE, 35, "http://urlz.fr/7izc", "Peugeot"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("Mustang", Modele.SPORTIVE, Modele.ESSENCE, 90, "http://urlz.fr/7ize", "Ford"));

                getDataBase(MainActivity.this).vehiculeDAO().nukeTable();
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("CX-344-VG", 5000, Vehicule.DISPO, 1, 1));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AX-144-AG", 5000, Vehicule.DISPO, 2, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("BX-244-BG", 5000, Vehicule.DISPO, 3, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AB-589-RV", 5000, Vehicule.DISPO, 4, 1));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("BB-689-BV", 5000, Vehicule.DISPO, 5, 4));

                getDataBase(MainActivity.this).clientDAO().nukeTable();
                getDataBase(MainActivity.this).clientDAO().insert(new Client("Guillaume", "Le thug", "adresse 1", "35000", "Rennes", "00 11 22 33 44", "guillaumelethug@gmail.com"));
                getDataBase(MainActivity.this).clientDAO().insert(new Client("Quentin", "Filsdeup", "adresse 2", "35000", "Rennes", "00 11 22 33 44", "quentinfilsdeup@gmail.com"));
                getDataBase(MainActivity.this).clientDAO().insert(new Client("Joris", "Le con", "adresse 3", "35000", "Rennes", "00 11 22 33 44", "jorislecon@gmail.com"));
                getDataBase(MainActivity.this).clientDAO().insert(new Client("Rémy", "Susceptible", "adresse 4", "35000", "Rennes", "00 11 22 33 44", "remysusceptible@gmail.com"));

                getDataBase(MainActivity.this).locationDAO().insert(new Location(new Date(118,05,24), new Date(118,05,25), new Date(118,05,28), new Date(118,05,28), "AR-830-AO", 1, 1));
                getDataBase(MainActivity.this).locationDAO().insert(new Location(new Date(118,05,25), new Date(118,05,26), new Date(118,05,29), new Date(118,05,29), "AR-257-AO", 1, 1));
                getDataBase(MainActivity.this).locationDAO().insert(new Location(new Date(118,05,25), new Date(118,06,02), new Date(118,06,05), new Date(118,06,05), "GR-430-VO", 1, 4));
                getDataBase(MainActivity.this).locationDAO().insert(new Location(new Date(118,05,26), new Date(118,06,03), new Date(118,06,07), new Date(118,06,07), "GC-654-MR", 2, 3));
                getDataBase(MainActivity.this).locationDAO().insert(new Location(new Date(118,05,26), new Date(118,06,03), new Date(118,06,06), new Date(118,06,06), "ER-357-MO", 3, 2));
                getDataBase(MainActivity.this).locationDAO().insert(new Location(new Date(118,05,27), new Date(118,06,05), new Date(118,06,07), new Date(118,06,07), "MF-687-HM", 4, 2));
                getDataBase(MainActivity.this).locationDAO().insert(new Location(new Date(118,05,27), new Date(118,06,05), new Date(118,06,06), new Date(118,06,06), "AB-589-RV", 3, 1));
            }
        }).start();
    }

    public void boutonConnexion (View view) {

        EditText email = findViewById(R.id.email_editText);
        EditText password = findViewById(R.id.motDePasse_editText);

        String bienvenue = "Bonjour " + email.getText().toString() + " !";

        Intent intent = new Intent (this, MenuActivity.class);
        intent.putExtra("bienvenue", bienvenue );
        startActivity(intent);
    }
}
