package com.example.findme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.start.*


class Start : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)

        intent = Intent(this,loginoptions::class.java)



        object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                //do  nothing
            }

            override fun onFinish() {

                object : CountDownTimer(5000,1000) {

                    override fun onTick(millisUntilFinished: Long) {
                        appname.animate().translationY(-800f)
                        animation.visibility = View.VISIBLE
                    }

                    override fun onFinish() {
                        animation.visibility = View.GONE
                        startbtn.visibility = View.VISIBLE
                    }
                }.start()
            }
        }.start()

        startbtn.setOnClickListener {v ->

            startActivity(intent)
        }

    }
}
