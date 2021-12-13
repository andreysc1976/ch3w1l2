package ru.a_party.ch3w1l2.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

class MainScreen(val username:String): FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment = MainFragment.newInstance(username)
}