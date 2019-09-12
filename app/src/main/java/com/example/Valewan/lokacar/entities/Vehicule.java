package com.example.Valewan.lokacar.entities;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Update;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "vehicules",
        foreignKeys = {
                @ForeignKey(entity = Modele.class, parentColumns = "id", childColumns = "modele_id")

        })
public class Vehicule {

    public static final String DISPO = "Disponible";
    public static final String LOUE = "Loué";
    public static final String NON_DISPO = "Indisponible";
    public static final String RESERVE = "Réservé";

    @PrimaryKey
    @NonNull
    private String immat;

    private float kilometrage;
    private String dispo; //état possible : libre|loué|reservé*

    @ColumnInfo(name = "modele_id") // foreignKey
    private int modeleId;

    @ColumnInfo(name = "agence_id") // foreignKey
    private int agenceId;

    @Ignore
    private Marque marque;

    @Ignore
    private Modele modele;

    @Ignore
    public Vehicule() {
    }

    @Ignore
    public Vehicule(String immat) {
        this.immat = immat;
    }

    public Vehicule(@NonNull String immat, float kilometrage, String dispo, int modeleId, int agenceId) {
        this.immat = immat;
        this.kilometrage = kilometrage;
        this.dispo = dispo;
        this.modeleId = modeleId;
        this.agenceId = agenceId;
    }

    ////////////////////////////
    //Pour récupérer l'état du véhicule///////
    ////////////////////////////
    public static List<String> getListEtat(){
        List<String> listEtat = new ArrayList<>();

        listEtat.add(DISPO);
        listEtat.add(LOUE);
        listEtat.add(NON_DISPO);
        listEtat.add(RESERVE);

        return listEtat;
    }


    @NonNull
    public String getImmat() {
        return immat;
    }

    public void setImmat(@NonNull String immat) {
        this.immat = immat;
    }


    public float getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(float kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getDispo() {
        return dispo;
    }

    public void setDispo(String dispo) {
        this.dispo = dispo;
    }

    public int getModeleId() {
        return modeleId;
    }

    public void setModeleId(int modeleId) {
        this.modeleId = modeleId;
    }

    public int getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(int agenceId) {
        this.agenceId = agenceId;
    }

    public Modele getModele() {
        return modele;
    }


    public void setModele(Modele modele) {
        this.modele = modele;
    }


    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "immat='" + immat + '\'' +
                ", kilometrage=" + kilometrage +
                ", dispo='" + dispo + '\'' +
                ", modeleId=" + modeleId +
                ", agenceId=" + agenceId +
                '}';
    }
}