package com.example.jocelynjoubert2017.lokacar.dal.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.jocelynjoubert2017.lokacar.dal.GeneriqueDAO;
import com.example.jocelynjoubert2017.lokacar.entities.ChiffreAffaires;

import java.util.List;

@Dao
public interface ChiffreAffairesDAO extends GeneriqueDAO<ChiffreAffaires>{

    //Select du CA par date
    @Query("SELECT * FROM ChiffresAffaires WHERE dateCA = :date")
    public List<ChiffreAffaires> selectByDate(long date);

    @Query("DELETE FROM chiffresaffaires")
    public void nukeTable();
}
