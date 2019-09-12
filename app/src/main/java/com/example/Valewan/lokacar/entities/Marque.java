package com.example.Valewan.lokacar.entities;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "marques")
public class Marque {

    @PrimaryKey
    @NonNull
    private String nom;


    @Ignore
    public Marque() {
    }

    public Marque(@NonNull String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Marque{" +
                ", nom='" + nom + '\'' +
                '}';
    }
}
