package com.example.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Personne::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun personneDAO(): PersonneDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "bddPersonne"
                    ).build()
                }
                INSTANCE = instance
            }
            return INSTANCE!!
        }
    }
}
