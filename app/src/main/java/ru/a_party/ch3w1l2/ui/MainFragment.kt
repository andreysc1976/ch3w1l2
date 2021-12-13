package ru.a_party.ch3w1l2.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.a_party.ch3w1l2.R
import ru.a_party.ch3w1l2.databinding.FragmentMainBinding

val ARG_USERNAME = "user_login"

class MainFragment : MvpAppCompatFragment(R.layout.fragment_main), MainView {
    lateinit var binding : FragmentMainBinding

    private val userLogin: String by lazy {
        arguments?.getString(ARG_USERNAME).orEmpty()
    }

    private val presenter:MainPresenter by moxyPresenter{
            MainPresenter(userLogin)
    }


    override fun showUserName(username:String) {
        binding.userlogin.text = username
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
    }

    companion object {
        fun newInstance(username:String): Fragment=
            MainFragment().apply {
                arguments = Bundle().apply{
                    putString(ARG_USERNAME,username)
                }
            }
    }
}