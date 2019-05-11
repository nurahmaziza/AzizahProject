package com.example.myapp2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSignIn.setOnClickListener{
            kembali()}
    }



    private fun kembali()
    {
        val intent = Intent(this, Signin::class.java)
        startActivity(intent)
    }

}
