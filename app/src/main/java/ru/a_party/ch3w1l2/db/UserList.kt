package ru.a_party.ch3w1l2.db

import io.reactivex.rxjava3.core.Observable

interface UserList {
    fun getUsers(): Observable<List<User>>
    fun checkUser(login: String,password: String): Observable<Boolean>
}