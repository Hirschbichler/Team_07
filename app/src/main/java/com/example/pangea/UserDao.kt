package com.example.pangea

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAll(): List<User>

    @Query("SELECT * FROM users WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Query("SELECT * FROM users WHERE email IS (:email)")
    fun getUserByEmail(email: String): User

    @Insert
    fun insertAll(vararg users: User)

    @Insert
    fun insertOne(user: User)

    @Delete
    fun delete(user: User)
}