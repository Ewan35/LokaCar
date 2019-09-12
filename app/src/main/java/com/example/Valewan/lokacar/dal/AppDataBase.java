package com.example.Valewan.lokacar.dal;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.Valewan.lokacar.dal.dao.ClientDAO;
import com.example.Valewan.lokacar.dal.dao.LocationDAO;
import com.example.Valewan.lokacar.dal.dao.MarqueDAO;
import com.example.Valewan.lokacar.dal.dao.ModeleDAO;
import com.example.Valewan.lokacar.dal.dao.VehiculeDAO;
import com.example.Valewan.lokacar.entities.Client;
import com.example.Valewan.lokacar.entities.Location;
import com.example.Valewan.lokacar.entities.Marque;
import com.example.Valewan.lokacar.entities.Modele;
import com.example.Valewan.lokacar.entities.Vehicule;

@Database(entities = {
        Client.class,
        Location.class,
        Marque.class,
        Modele.class,
        Vehicule.class
}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    public static final String DATA_BASE_NAME = "lokacar_bdd";

    public abstract ClientDAO clientDAO();

    public abstract LocationDAO locationDAO();

    public abstract MarqueDAO marqueDAO();

    public abstract ModeleDAO modeleDAO();

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