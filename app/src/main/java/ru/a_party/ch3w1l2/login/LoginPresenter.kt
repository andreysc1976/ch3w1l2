package ru.a_party.ch3w1l2.login

import moxy.MvpPresenter
import ru.a_party.ch3w1l2.MyApp.Navigation.router
import ru.a_party.ch3w1l2.ui.MainScreen

class LoginPresenter: MvpPresenter<LoginView>() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
    }

    fun userLogin(username: String)
    {
        router.navigateTo(MainScreen(username))
    }
}