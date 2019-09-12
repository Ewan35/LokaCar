package com.example.jocelynjoubert2017.lokacar.entities;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "chiffresaffaires",
        foreignKeys = {
        @ForeignKey(entity = Agence.class, parentColumns = "id", childColumns = "agence_id")
})
public class ChiffreAffaires {

    @PrimaryKey(autoGenerate = true)
    private int id;


    private long dateCA;
    private float totalCA;


    @ColumnInfo(name = "agence_id") // foreignKey
    private int agenceId;


    public ChiffreAffaires() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDateCA() {
        return dateCA;
    }

    public void setDateCA(long dateCA) {
        this.dateCA = dateCA;
    }

    public float getTotalCA() {
        return totalCA;
    }

    public void setTotalCA(float totalCA) {
        this.totalCA = totalCA;
    }

    public int getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(int agenceId) {
        this.agenceId = agenceId;
    }
}

