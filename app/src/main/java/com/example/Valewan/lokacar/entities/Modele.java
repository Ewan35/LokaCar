package com.example.Valewan.lokacar.entities;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "modeles",
        foreignKeys = {
                @ForeignKey(entity = Marque.class, parentColumns = "nom", childColumns = "marque_id")
        })
public class Modele {

    public final static String CITADINE = "Citadine";
    public final static String COMPACTE = "Compacte";
    public final static String SUV = "SUV";
    public final static String BERLINE = "Berling";
    public final static String FAMILIALE = "Familiale";
    public final static String SPORTIVE = "Sportive";
    public final static String PICKUP = "Pick-up";

    public final static String ESSENCE = "Essence";
    public final static String DIESEL = "Diesel";
    public final static String HYBRIDE = "Hybride";


    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nom;
    private String typeVehicule;
    private String typeCarburant;
    private float prixParJour;
    private String photo;


    @ColumnInfo(name = "marque_id")
    private String marqueId; //FK


    @Ignore
    public Modele() {
    }

    public Modele(String nom, String typeVehicule, String typeCarburant, float prixParJour, String photo, String marqueId) {
        this.nom = nom;
        this.typeVehicule = typeVehicule;
        this.typeCarburant = typeCarburant;
        this.prixParJour = prixParJour;
        this.photo = photo;
        this.marqueId = marqueId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public float getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(float prixParJour) {
        this.prixParJour = prixParJour;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMarqueId() {
        return marqueId;
    }

    public void setMarqueId(String marqueId) {
        this.marqueId = marqueId;
    }

    @Override
    public String toString() {
        return "Modele{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", typeVehicule='" + typeVehicule + '\'' +
                ", typeCarburant='" + typeCarburant + '\'' +
                ", prixParJour=" + prixParJour +
                ", photo=" + photo +
                ", marqueId='" + marqueId + '\'' +
                '}';
    }

    /**
     * Permet de récupérer les liste des types de véhicules
     * @return List<String>
     */
    public static List<String> getTypeVehicules(){
        List<String> typesVehicules = new ArrayList<>();

        typesVehicules.add(SUV);
        typesVehicules.add(CITADINE);
        typesVehicules.add(COMPACTE);
        typesVehicules.add(FAMILIALE);
        typesVehicules.add(BERLINE);
        typesVehicules.add(SPORTIVE);
        typesVehicules.add(PICKUP);

        return typesVehicules;
    }

    /**
     * Permet de récupérer les liste des types de carburant
     * @return List<String>
     */
    public static List<String> getTypeCarburants(){
        List<String> typesCarburants = new ArrayList<>();

        typesCarburants.add(ESSENCE);
        typesCarburants.add(DIESEL);
        typesCarburants.add(HYBRIDE);
        typesCarburants.add(BERLINE);

        return typesCarburants;
    }
}
