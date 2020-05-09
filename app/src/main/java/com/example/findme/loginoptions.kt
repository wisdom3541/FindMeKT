package com.example.findme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.loginoptions.*

class loginoptions : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginoptions)

        intent = Intent(this, fragments::class.java)



        signinbtn.setOnClickListener { v ->

            startActivity(intent)
        }

    }


}