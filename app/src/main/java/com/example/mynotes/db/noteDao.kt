package com.example.mynotes.db


import androidx.room.*

@Dao
interface noteDao {


    @Query("SELECT * FROM noteTable ORDER BY id DESC")
    fun getAllUserInfo(): List<NoteEntitiy>?

    @Insert
    fun insertUser(user: NoteEntitiy?)

    @Delete
    fun deleteUser(user: NoteEntitiy?)

    @Update
    fun updateUser(user: NoteEntitiy?)

}