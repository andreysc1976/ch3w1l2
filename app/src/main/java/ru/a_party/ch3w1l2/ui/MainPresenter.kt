package ru.a_party.ch3w1l2.ui

import moxy.MvpPresenter

class MainPresenter(
    val username: String
): MvpPresenter<MainView>() {
    override fun onFirstViewAttach() {
        username?.let(viewState::showUserName)
    }
}




