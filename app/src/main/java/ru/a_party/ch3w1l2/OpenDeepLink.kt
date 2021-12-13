package ru.a_party.ch3w1l2

import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Forward


class OpenDeepLink(private val deepLinkUserId: String) : CustomRouter.Command, Command {

    override fun execute(navigator: CustomNavigator) {
        TODO("navigator.applyCommand(Forward(UserScreen(deepLinkUserId)))")
    }
}