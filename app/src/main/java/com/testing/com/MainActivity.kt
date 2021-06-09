package com.testing.com

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayout = findViewById<View>(R.id.layout22) as LinearLayout
        val textView = TextView(this)

        val  person = arrayListOf<User>(
         User("\n Артём = 30",   30)
        ,User("\nМаксим = 20",   20)
        ,User("\nДарья = 14",    14)
        ,User("\nВиктория = 15", 15)
        ,User("\nМария = 17",    17)
        ,User("\nМихаил = 18",   18)
        ,User("\nКирилл = 18",   18)
        ,User("\nАлександр = 20",20)
        ,User("\nВалерия = 25",  25)
        ,User("\nАрина = 33",    33)
        ,User("\nКарина = 15",   15)
        ,User("\nАлиса = 17",    17)
        ,User("\nМилана = 16",   16)
        ,User("\nЕгор = 44",     44)
        ,User("\nТимур = 44",    44)
        ,User("\nНикита = 31",   31)
        ,User("\nЮлия = 18",     18)
        )

        val oldest =  person.asSequence().filter { it.Age < 18 }.map(User::Name ).joinToString()


        textView.text= "$oldest"
        linearLayout.addView(textView)
    }

}




