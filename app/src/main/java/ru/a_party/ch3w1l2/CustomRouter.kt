package ru.a_party.ch3w1l2

import com.github.terrakok.cicerone.Router

class CustomRouter : Router() {

    interface Command {
        fun execute(navigator: CustomNavigator)
    }

    fun openDeepLink(deepLinkUserid: String) {
        executeCommands(OpenDeepLink(deepLinkUserid))
    }
}
