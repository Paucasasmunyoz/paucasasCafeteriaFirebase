package com.pcmdam.paucasascafeteria

import com.pcmdam.paucasascafeteria.User


class LoginProvider {

    companion object {

        fun login(username: String, password: String): Boolean {
            val user = userName.find { it.username == username && it.password == password }
            return user != null
        }

        fun addUser(username: String, password: String) {
            val newUser = User(username, password)
            userName.add(newUser)
        }



        private val userName = mutableListOf<User>(
            User("Pau", "1234"),
            User("Enaitz", "1234"),
        )
    }
}