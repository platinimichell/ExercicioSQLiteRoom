package com.example.sqlite_room.data

import com.example.sqlite_room.Usuario

class UserRepository (private val userDao: UserDao) {

    val selectUsers = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }

}