package com.example.newsapppro.repository

import com.example.newsapppro.db.UserDao
import com.example.newsapppro.models.User

class AuthRepository(private val userDao: UserDao) {

    suspend fun register(user: User): Boolean {
        return userDao.registerUser(user) != -1L
    }

    suspend fun login(username: String, password: String): User? {
        return userDao.loginUser(username, password)
    }
}
