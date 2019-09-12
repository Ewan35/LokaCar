package com.example.jocelynjoubert2017.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.jocelynjoubert2017.lokacar.dal.GeneriqueDAO;
import com.example.jocelynjoubert2017.lokacar.entities.Gerant;

import java.util.List;

@Dao
public interface GerantDAO extends GeneriqueDAO<Gerant> {

    // select all
    @Query("SELECT * FROM gerants")
    public List<Gerant> getAll();

    // select un gérant par l'id de l'agence à laquelle il est rattaché
    @Query("SELECT * from gerants WHERE agence_id= :agenceId")
    public List<Gerant> selectByIdAgence(int agenceId);

    @Query("DELETE FROM gerants")
    public void nukeTable();
}
