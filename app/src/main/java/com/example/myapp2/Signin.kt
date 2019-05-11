package com.example.myapp2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_signin.*
import kotlinx.android.synthetic.main.activity_main.*

class Signin : AppCompatActivity() {


    var username1Input : String = ""
    var password1Input : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        buttonSignIn1.setOnClickListener {
            login()
    }
}

    private fun login() {
        username1Input = editUser.text.toString()
        password1Input = editPass.text.toString()

        when{
            username1Input.isEmpty() -> editUser.error = "Nama tidak boleh kosong"
            password1Input.isEmpty() -> editPass.error = "Email tidak boleh kosong"

            else -> {
                tampilToast("Berhasil Log In")
                menuHome()
            }
        }


    }

    private fun menuHome() {

        val intent = Intent(this, Home::class.java)
        val bundle = Bundle()
        bundle.putString("username", username1Input)
        bundle.putString("password", password1Input)

        intent.putExtras(bundle)
        startActivity(intent)

    }
    private fun tampilToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
