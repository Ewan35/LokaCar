package com.example.jocelynjoubert2017.lokacar.dal;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import java.util.List;

public interface GeneriqueDAO<T> {
    @Insert
    public void insert(T object);

    @Insert
    public void insertList(List<T> objects);

    @Update
    public void update(T object);

    @Delete
    public void delete(T object);



}
