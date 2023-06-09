package com.eslemarik.foodproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eslemarik.foodproject.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        login()

    }

    fun login(){

        binding.tvLogin.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }
    }



}