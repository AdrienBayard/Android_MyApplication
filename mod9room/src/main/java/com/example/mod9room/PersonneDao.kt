package com.example.mod9room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PersonneDao {
    @Insert
    fun insert(personne : Personne)

    @Query("SELECT*FROM Personne WHERE id = :id")
    fun getById(id:Long) : Personne

    @Query("SELECT*FROM Personne")
    fun getAll():LiveData<List<Personne>>

    @Update
    fun update(personne : Personne)

    @Delete
    fun delete(personne : Personne)

}
