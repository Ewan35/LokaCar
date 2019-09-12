package com.example.Valewan.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.Valewan.lokacar.dal.GeneriqueDAO;
import com.example.Valewan.lokacar.entities.Modele;

import java.util.List;

@Dao
public interface ModeleDAO extends GeneriqueDAO<Modele> {

    // select all
    @Query("SELECT * FROM modeles")
    public List<Modele> getAll();

    // Select par id
    @Query("SELECT * FROM modeles WHERE id=:id")
    public Modele selectById(int id);

    // Select des modèles selon le nom
    @Query("SELECT * FROM modeles WHERE nom LIKE :nom")
    public List<Modele> selectByName(String nom);

    // select des modèles par la marque
    @Query("SELECT * FROM modeles WHERE marque_id LIKE :marque")
    public List<Modele> selectByIdMarque(String marque);


    // Select selon le type de véhicule
    @Query("SELECT * FROM modeles WHERE typeVehicule LIKE :typeVehicule")
    public List<Modele> selectByTypeVehicule(String typeVehicule);

    // Select un modèle selon un type de carburant
    @Query("SELECT * FROM modeles WHERE typeCarburant LIKE :typeCarburant")
    public List<Modele> selectByCarburant(String typeCarburant);

    @Query("DELETE FROM modeles")
    public void nukeTable();
}
