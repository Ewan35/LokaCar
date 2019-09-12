package com.example.jocelynjoubert2017.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.jocelynjoubert2017.lokacar.dal.GeneriqueDAO;
import com.example.jocelynjoubert2017.lokacar.entities.Marque;
import com.example.jocelynjoubert2017.lokacar.entities.Modele;

import java.util.List;

@Dao
public interface MarqueDAO extends GeneriqueDAO<Marque> {

    // select all
    @Query("SELECT * FROM marques")
    public List<Marque> getAll();

    // Select par nom
    @Query("SELECT * FROM marques WHERE nom=:nom")
    public Marque selectById(String nom);

    // Select des marque selon le nom
    @Query("SELECT * FROM Marques WHERE nom LIKE :nom")
    public List<Marque> selectAll(String nom);

    @Query("DELETE FROM marques")
    public void nukeTable();
}
