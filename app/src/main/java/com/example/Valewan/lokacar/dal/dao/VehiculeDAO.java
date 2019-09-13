package com.example.Valewan.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.Valewan.lokacar.dal.GeneriqueDAO;
import com.example.Valewan.lokacar.entities.Vehicule;

import java.util.List;

@Dao
public interface VehiculeDAO extends GeneriqueDAO<Vehicule> {

    @Query("SELECT * FROM vehicules")
    public List<Vehicule> getAll();

    @Query("SELECT * FROM vehicules where immat = :immat")
    public Vehicule selectByImmat(String immat);

    @Query("SELECT * FROM vehicules WHERE modele_id = :modeleId")
    public List<Vehicule> selectByModele(int modeleId);

    @Query("SELECT * FROM vehicules WHERE dispo = :dispo")
    public List<Vehicule> selectByDispo(String dispo);

    @Query("SELECT * FROM vehicules v " +
            "INNER JOIN modeles md ON md.id = v.modele_id " +
            "INNER JOIN marques mq ON mq.nom = md.marque_id " +
            "WHERE v.dispo = :dispo AND (md.nom LIKE :motCle OR md.marque_id LIKE :motCle) AND md.typeVehicule LIKE :type")
    public List<Vehicule> selectByCriteres(String dispo, String motCle, String type);

    @Query("DELETE FROM vehicules")
    public void nukeTable();

}
