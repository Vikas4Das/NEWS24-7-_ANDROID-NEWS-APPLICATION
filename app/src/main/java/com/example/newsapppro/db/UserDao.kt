package com.example.newsapppro.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.newsapppro.models.User

@Dao
interface UserDao {

    // Insert/Register user
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun registerUser(user: User): Long

    // Login query
    @Query("SELECT * FROM users WHERE username = :username AND password = :password")
    suspend fun loginUser(username: String, password: String): User?
}
