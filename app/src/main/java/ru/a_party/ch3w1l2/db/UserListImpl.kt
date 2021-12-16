package ru.a_party.ch3w1l2.db

import io.reactivex.rxjava3.core.Observable

class UserListImpl:UserList {
    private val userList:List<User> = listOf<User>(
        User("user1","123"),
        User("user2","234"),
        User("user3","345"),
        User("user4","456"),
    )

    override fun getUsers(): Observable<List<User>> {
        return Observable.just(userList)
    }

    override fun checkUser(login: String, password: String): Observable<Boolean> {
        for (user in userList)
        {
            if (login.equals(user.login)&&password.equals(user.password)){
                return Observable.just(true)
            }
        }
        return Observable.just(false)
    }
}