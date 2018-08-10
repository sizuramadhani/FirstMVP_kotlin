package com.example.sizura.firstmvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity(),MainView {
    var a = 12
    var b = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presenter = MainPresenter(this)

        presenter.calculate(a,b)

    }
    override fun result(b: Int) {
        Toast.makeText(this@MainActivity,b.toString(),Toast.LENGTH_LONG).show()

    }

}
