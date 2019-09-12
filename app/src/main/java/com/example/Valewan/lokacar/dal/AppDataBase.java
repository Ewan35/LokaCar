package com.example.jocelynjoubert2017.lokacar.dal;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.jocelynjoubert2017.lokacar.dal.dao.AgenceDAO;
import com.example.jocelynjoubert2017.lokacar.dal.dao.ChiffreAffairesDAO;
import com.example.jocelynjoubert2017.lokacar.dal.dao.ClientDAO;
import com.example.jocelynjoubert2017.lokacar.dal.dao.GerantDAO;
import com.example.jocelynjoubert2017.lokacar.dal.dao.LocationDAO;
import com.example.jocelynjoubert2017.lokacar.dal.dao.MarqueDAO;
import com.example.jocelynjoubert2017.lokacar.dal.dao.ModeleDAO;
import com.example.jocelynjoubert2017.lokacar.dal.dao.VehiculeDAO;
import com.example.jocelynjoubert2017.lokacar.entities.Agence;
import com.example.jocelynjoubert2017.lokacar.entities.ChiffreAffaires;
import com.example.jocelynjoubert2017.lokacar.entities.Client;
import com.example.jocelynjoubert2017.lokacar.entities.Gerant;
import com.example.jocelynjoubert2017.lokacar.entities.Location;
import com.example.jocelynjoubert2017.lokacar.entities.Marque;
import com.example.jocelynjoubert2017.lokacar.entities.Modele;
import com.example.jocelynjoubert2017.lokacar.entities.Vehicule;

@Database(entities = {
        Agence.class,
        ChiffreAffaires.class,
        Client.class,
        Location.class,
        Marque.class,
        Modele.class,
        Gerant.class,
        Vehicule.class
}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    public static final String DATA_BASE_NAME = "lokacar_bdd";

    public abstract AgenceDAO agenceDAO();

    public abstract ChiffreAffairesDAO chiffreAffairesDAO();

    public abstract ClientDAO clientDAO();

    public abstract LocationDAO locationDAO();

    public abstract MarqueDAO marqueDAO();

    public abstract ModeleDAO modeleDAO();

    public abstract GerantDAO gerantDAO();

    public abstract VehiculeDAO vehiculeDAO();

    /**
     * Retourne un instance de la base de données
     *
     * @param context
     * @return AppDataBase
     */
    public static AppDataBase getDataBase(Context context) {
        return Room.databaseBuilder(context, AppDataBase.class, DATA_BASE_NAME).build();
    }


}