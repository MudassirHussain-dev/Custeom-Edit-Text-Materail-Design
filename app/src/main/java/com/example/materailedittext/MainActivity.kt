package com.example.materailedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        til_password.setEndIconOnClickListener {
            Toast.makeText(this@MainActivity, "OK", Toast.LENGTH_SHORT).show()
        }

        et_phone.doOnTextChanged { text, start, before, count ->
            if(text!!.length>10){
                til_phone.error ="No more"
            }else if (text.length<10){
                til_phone.error=""
            }
        }
    }
}