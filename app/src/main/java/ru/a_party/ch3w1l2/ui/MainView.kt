package ru.a_party.ch3w1l2.ui

import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState

interface MainView: MvpView {
    @SingleState
    fun showUserName(username: String)
}