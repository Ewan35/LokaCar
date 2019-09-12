package com.example.Valewan.lokacar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.jocelynjoubert2017.lokacar.entities.Client;
import com.example.jocelynjoubert2017.lokacar.entities.Location;
import com.example.jocelynjoubert2017.lokacar.entities.Marque;
import com.example.jocelynjoubert2017.lokacar.entities.Modele;
import com.example.jocelynjoubert2017.lokacar.entities.Vehicule;

import java.util.Date;

import static com.example.jocelynjoubert2017.lokacar.dal.AppDataBase.getDataBase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                getDataBase(MainActivity.this).agenceDAO().nukeTable();
                getDataBase(MainActivity.this).agenceDAO().insert(new Agence("Nantes_Route_de_Paris", "17 Route de Paris", "44300", "Nantes", "02 40 52 08 08"));
                getDataBase(MainActivity.this).agenceDAO().insert(new Agence("Nantes_Aéroport", "Aéroport Nantes Atlantique", "44340", "Bouguenais", "02 40 84 01 39"));
                getDataBase(MainActivity.this).agenceDAO().insert(new Agence("Nantes_Gare_Sud", "325 Rue Marcel Paul", "44000", "Nantes", "02 40 47 19 38"));
                getDataBase(MainActivity.this).agenceDAO().insert(new Agence("Nantes_Champ_de_Mars", "29 Rue De Fleurus", "44000", "Nantes", "02 40 89 40 88"));

                getDataBase(MainActivity.this).gerantDAO().nukeTable();
                getDataBase(MainActivity.this).gerantDAO().insert(new Gerant("Nicolas", "Guittet", "nico@gmail.com", "rendlaballe", 1));
                getDataBase(MainActivity.this).gerantDAO().insert(new Gerant("Johnny", "Depp", "depp@gmail.com", "johnnypirate", 2));
                getDataBase(MainActivity.this).gerantDAO().insert(new Gerant("Grigor", "Grabovoi", "grigor@gmail.com", "sanchez", 3));
                getDataBase(MainActivity.this).gerantDAO().insert(new Gerant("Piseth", "Ly", "ly@gmail.com", "didierproud", 4));

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
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("Ranger", Modele.PICKUP, Modele.ESSENCE, 80, "http://urlz.fr/7izg", "Ford"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("Tiguan", Modele.SUV, Modele.DIESEL, 50, "http://urlz.fr/7izi", "Volkswagen"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("Touran", Modele.FAMILIALE, Modele.DIESEL, 65, "http://urlz.fr/7izl", "Volkswagen"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("Yaris", Modele.CITADINE, Modele.HYBRIDE, 30, "http://urlz.fr/7izs", "Toyota"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("Auris", Modele.COMPACTE, Modele.HYBRIDE, 40, "http://urlz.fr/7izv", "Toyota"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("GT86", Modele.SPORTIVE, Modele.ESSENCE, 95, "http://urlz.fr/7izC", "Toyota"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("CX-3", Modele.SUV, Modele.ESSENCE, 45, "http://urlz.fr/7izV", "Mazda"));
                getDataBase(MainActivity.this).modeleDAO().insert(new Modele("MX-5", Modele.SPORTIVE, Modele.ESSENCE, 85, "http://urlz.fr/7iA5", "Mazda"));

                getDataBase(MainActivity.this).vehiculeDAO().nukeTable();
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("CX-344-VG", 5000, Vehicule.DISPO, 1, 1));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AX-144-AG", 5000, Vehicule.DISPO, 1, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("BX-244-BG", 5000, Vehicule.DISPO, 1, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AB-589-RV", 5000, Vehicule.DISPO, 2, 1));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("BB-689-BV", 5000, Vehicule.DISPO, 2, 4));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("UI-367-PS", 5000, Vehicule.DISPO, 3, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AI-467-GS", 5000, Vehicule.DISPO, 3, 4));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("RV-562-TH", 5000, Vehicule.DISPO, 4, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AV-462-AH", 5000, Vehicule.DISPO, 4, 4));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("BV-862-TB", 5000, Vehicule.DISPO, 4, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("SJ-528-YQ", 5000, Vehicule.DISPO, 5, 1));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("MF-687-HM", 5000, Vehicule.DISPO, 6, 4));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("XX-852-OE", 5000, Vehicule.DISPO, 7, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("XF-852-OE", 5000, Vehicule.DISPO, 7, 4));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AX-452-AE", 5000, Vehicule.DISPO, 7, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("GC-654-MR", 5000, Vehicule.DISPO, 8, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AC-254-AR", 5000, Vehicule.DISPO, 8, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("BC-554-BR", 5000, Vehicule.DISPO, 8, 4));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("QY-861-EN", 5000, Vehicule.DISPO, 9, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AY-561-AN", 5000, Vehicule.DISPO, 9, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("GR-430-VO", 5000, Vehicule.DISPO, 10, 1));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AR-830-AO", 5000, Vehicule.DISPO, 10, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("BR-230-BO", 5000, Vehicule.DISPO, 10, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("QR-569-UE", 5000, Vehicule.DISPO, 11, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AN-882-AJ", 5000, Vehicule.DISPO, 12, 2));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("ZN-582-SJ", 5000, Vehicule.DISPO, 12, 3));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("AR-257-AO", 5000, Vehicule.DISPO, 13, 1));
                getDataBase(MainActivity.this).vehiculeDAO().insert(new Vehicule("ER-357-MO", 5000, Vehicule.DISPO, 13, 3));

                getDataBase(MainActivity.this).clientDAO().nukeTable();
                getDataBase(MainActivity.this).clientDAO().insert(new Client("Didier", "Super", "3 chemin du OnEstFiersDeToi", "44000", "Nantes", "02 40 89 40 88", "didier@gmail.com"));
                getDataBase(MainActivity.this).clientDAO().insert(new Client("Gary", "Noname", "10 boulevard Honoré", "44100", "Nantes", "02 40 56 20 78", "gary@gmail.com"));
                getDataBase(MainActivity.this).clientDAO().insert(new Client("Jane", "Doe", "22 impasse de la Mémoire", "44300", "Nantes", "02 40 23 68 95", "jane@gmail.com"));
                getDataBase(MainActivity.this).clientDAO().insert(new Client("Jay", "Robertsson", "12 rue de la plage", "44200", "Nantes", "02 40 27 64 91", "jay@gmail.com"));

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
