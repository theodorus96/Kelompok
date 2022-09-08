package com.example.kelompok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {
    private lateinit var name : TextInputEditText
    private lateinit var username : TextInputEditText
    private lateinit var password : TextInputEditText
    private lateinit var bornDate : TextInputEditText
    private lateinit var email : TextInputEditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        name = findViewById(R.id.etName)
        username = findViewById(R.id.etUsername)
        password = findViewById(R.id.etPassword)
        bornDate = findViewById(R.id.etBornDate)
        email = findViewById(R.id.etEmail)
        btnRegister= findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            val mBundle = Bundle()
            //memasukan data ke dalam budle
            mBundle.putString("nama",name.text.toString())
            mBundle.putString("username",username.text.toString())
            mBundle.putString("password",password.text.toString())
            mBundle.putString("born date",bornDate.text.toString())
            mBundle.putString("email",email.text.toString())
            //melakukan intent dengan memanggil bundle
            intent.putExtra("register",mBundle)

            startActivity(intent)
        }
    }
}