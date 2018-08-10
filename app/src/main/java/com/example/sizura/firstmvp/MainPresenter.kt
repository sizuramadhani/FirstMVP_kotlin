package com.example.sizura.firstmvp

class MainPresenter (var mainView: MainView){

    fun calculate (a: Int,b : Int){

        val hasil = a + b

        mainView.result(hasil)
    }

}