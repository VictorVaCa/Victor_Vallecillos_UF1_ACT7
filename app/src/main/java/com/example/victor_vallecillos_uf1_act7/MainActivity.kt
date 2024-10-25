package com.example.victor_vallecillos_uf1_act7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button);
        val username = findViewById<EditText>(R.id.usernameText);
        val password = findViewById<EditText>(R.id.passwordText);

        button.setOnClickListener{
            Log.d("Missatge","Username: " + username.text + " Contrasenya: " + password.text);
            Toast.makeText(this, "Username: " + username.text + " Contrasenya: " + password.text, Toast.LENGTH_SHORT).show();
        }
    }
}