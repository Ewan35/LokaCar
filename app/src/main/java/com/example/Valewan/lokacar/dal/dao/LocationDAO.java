package com.example.Valewan.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.Valewan.lokacar.dal.GeneriqueDAO;
import com.example.Valewan.lokacar.entities.Location;

import java.util.List;

@Dao
public interface LocationDAO extends GeneriqueDAO<Location> {

    @Query("SELECT * FROM locations")
    public List<Location> getAll();

    @Query("SELECT * FROM locations where id = :id")
    public Location selectById(String id);

    @Query("SELECT * FROM locations where vehicule_id= :immat")
    public List<Location> selectByImmat(String immat);

    @Query("SELECT * FROM locations where client_id= :clientId")
    public List<Location> selectByIdClient(int clientId);

    @Query("SELECT * FROM Locations AS l, Clients c WHERE l.client_id = c.id AND c.nom LIKE :nom")
    public List<Location> selectByNameClient(String nom);

    @Query("SELECT * FROM locations where agence_id= :agenceId")
    public List<Location> selectByIdAgence(String agenceId);

    @Query("SELECT * FROM Locations WHERE dateReservation = :dateReservation")
    public List<Location> selectParDateReservation(long dateReservation);

    @Query("SELECT * FROM Locations WHERE dateDepart = :dateDepart")
    public List<Location> selectParDateDepart(long dateDepart);

    @Query("SELECT * FROM Locations WHERE dateRetourPrevu = :dateRetour")
    public List<Location> selectParDateRetourPrevu(long dateRetour);

    @Query("DELETE FROM locations")
    public void nukeTable();
}
