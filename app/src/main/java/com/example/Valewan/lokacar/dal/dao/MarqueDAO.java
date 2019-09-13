package com.example.Valewan.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.Valewan.lokacar.dal.GeneriqueDAO;
import com.example.Valewan.lokacar.entities.Marque;
import com.example.Valewan.lokacar.entities.Modele;

import java.util.List;

@Dao
public interface MarqueDAO extends GeneriqueDAO<Marque> {

    @Query("SELECT * FROM marques")
    public List<Marque> getAll();

    @Query("SELECT * FROM marques WHERE nom=:nom")
    public Marque selectById(String nom);

    @Query("SELECT * FROM Marques WHERE nom LIKE :nom")
    public List<Marque> selectAll(String nom);

    @Query("DELETE FROM marques")
    public void nukeTable();
}
