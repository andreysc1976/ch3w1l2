package ru.a_party.ch3w1l2

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit


fun main(){
    val str:String = "проверка работы строки"
    val str1:String = "не проверка работы строки"
    Observable.just(str,str1)
        .flatMap {
            Observable.just(it).delay(100, TimeUnit.MILLISECONDS)
        }
        .map {text ->
            text.split(" ")
        }

        .subscribe({println(it)})
    println("ЙОхохо")
    Thread.sleep(10000)
}

