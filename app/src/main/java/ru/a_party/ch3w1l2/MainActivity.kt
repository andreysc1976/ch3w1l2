package ru.a_party.ch3w1l2


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import moxy.MvpAppCompatActivity
import ru.a_party.ch3w1l2.MyApp.Navigation.navigatorHolder
import ru.a_party.ch3w1l2.MyApp.Navigation.router
import ru.a_party.ch3w1l2.login.LoginScreen

class MainActivity : AppCompatActivity() {
    private val navigator = CustomNavigator(activity=this,R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null){
           router.navigateTo(LoginScreen)
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}