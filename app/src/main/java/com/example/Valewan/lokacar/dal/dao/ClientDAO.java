package com.example.Valewan.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.Valewan.lokacar.dal.GeneriqueDAO;
import com.example.Valewan.lokacar.entities.Client;

import java.util.List;

@Dao
public interface ClientDAO extends GeneriqueDAO<Client> {

    @Query("SELECT * FROM clients")
    public List<Client> getAll();

    @Query("SELECT * FROM clients where id = :id")
    public Client selectById(int id);

    @Query("SELECT * FROM clients where nom LIKE :nom")
    public List<Client> selectByName(String nom);

    @Query("DELETE FROM clients")
    public void nukeTable();
}
