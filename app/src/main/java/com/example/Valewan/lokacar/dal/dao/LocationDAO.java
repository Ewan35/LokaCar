package com.example.jocelynjoubert2017.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.jocelynjoubert2017.lokacar.dal.GeneriqueDAO;
import com.example.jocelynjoubert2017.lokacar.entities.Location;

import java.util.List;

@Dao
public interface LocationDAO extends GeneriqueDAO<Location> {

    // select all
    @Query("SELECT * FROM locations")
    public List<Location> getAll();

    // select par id
    @Query("SELECT * FROM locations where id = :id")
    public Location selectById(String id);

    // select par immat
    @Query("SELECT * FROM locations where vehicule_id= :immat")
    public List<Location> selectByImmat(String immat);

    // select par id client
    @Query("SELECT * FROM locations where client_id= :clientId")
    public List<Location> selectByIdClient(int clientId);

    //Selection par nom client
    @Query("SELECT * FROM Locations AS l, Clients c WHERE l.client_id = c.id AND c.nom LIKE :nom")
    public List<Location> selectByNameClient(String nom);

    // select par id agence
    @Query("SELECT * FROM locations where agence_id= :agenceId")
    public List<Location> selectByIdAgence(String agenceId);

    //Select par date de réservation
    @Query("SELECT * FROM Locations WHERE dateReservation = :dateReservation")
    public List<Location> selectParDateReservation(long dateReservation);

    //Select par date de départ
    @Query("SELECT * FROM Locations WHERE dateDepart = :dateDepart")
    public List<Location> selectParDateDepart(long dateDepart);

    //Select par date de retour prevu
    @Query("SELECT * FROM Locations WHERE dateRetourPrevu = :dateRetour")
    public List<Location> selectParDateRetourPrevu(long dateRetour);

    @Query("DELETE FROM locations")
    public void nukeTable();
}
