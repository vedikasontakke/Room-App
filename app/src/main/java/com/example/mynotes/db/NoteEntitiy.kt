package com.example.mynotes.db

import android.icu.text.CaseMap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// @Entity is the predefined interface
@Entity(tableName = "noteTable")

data class NoteEntitiy (

    // all the name given in the @....  are interface

    @PrimaryKey(autoGenerate = true)

    @ColumnInfo(name = "id") val id : Int = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "note") val note: String,
   // @ColumnInfo(name = "phone") val phone: String?
)