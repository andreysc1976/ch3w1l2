package ru.a_party.ch3w1l2.login

import moxy.MvpPresenter
import ru.a_party.ch3w1l2.MyApp.Navigation.router
import ru.a_party.ch3w1l2.MyApp.Navigation.userDB
import ru.a_party.ch3w1l2.ui.MainScreen

class LoginPresenter: MvpPresenter<LoginView>() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
    }

    fun userLogin(username: String,password: String)
    {
        if (username.isEmpty()||password.isEmpty()){
            return
        }
        userDB.getUsers().map {users->
            var user = users.findLast { user -> user.login == username && user.password == password }
            user?.login?:"login error"
        }.subscribe{
             router.navigateTo(MainScreen(it))
        }
    }
}