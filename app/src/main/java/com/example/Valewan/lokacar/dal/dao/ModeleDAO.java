package com.example.Valewan.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.Valewan.lokacar.dal.GeneriqueDAO;
import com.example.Valewan.lokacar.entities.Modele;

import java.util.List;

@Dao
public interface ModeleDAO extends GeneriqueDAO<Modele> {

    @Query("SELECT * FROM modeles")
    public List<Modele> getAll();

    @Query("SELECT * FROM modeles WHERE id=:id")
    public Modele selectById(int id);

    @Query("SELECT * FROM modeles WHERE nom LIKE :nom")
    public List<Modele> selectByName(String nom);

    @Query("SELECT * FROM modeles WHERE marque_id LIKE :marque")
    public List<Modele> selectByIdMarque(String marque);

    @Query("SELECT * FROM modeles WHERE typeVehicule LIKE :typeVehicule")
    public List<Modele> selectByTypeVehicule(String typeVehicule);

    @Query("SELECT * FROM modeles WHERE typeCarburant LIKE :typeCarburant")
    public List<Modele> selectByCarburant(String typeCarburant);

    @Query("DELETE FROM modeles")
    public void nukeTable();
}
