package com.example.excepciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nullSafety()
    }

    fun nullSafety() {
        var myString = "MoureDev"
        println(myString)


        var mySafetyString: String? = "MoureDev null safety"
        println(mySafetyString)

        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Continua su ejecuciion"
        println(mySafetyString)

        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString!!)
        }

        mySafetyString?.let {
            println(it)
        }?: run {
            println(mySafetyString!!)
        }

    }

}