package ru.a_party.ch3w1l2.login


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.a_party.ch3w1l2.R
import ru.a_party.ch3w1l2.databinding.FragmentLoginBinding

class LoginFragment: MvpAppCompatFragment(R.layout.fragment_login),LoginView {

    private lateinit var binding: FragmentLoginBinding

    private val presenter: LoginPresenter by moxyPresenter{
            LoginPresenter()
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        binding.button.setOnClickListener {
            presenter.userLogin(binding.inputLoginText.text.toString(),binding.InputPasswordText.text.toString())
        }
    }

    companion object {
        fun newInstance(): Fragment = LoginFragment()
    }
}
