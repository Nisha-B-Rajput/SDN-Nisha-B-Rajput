package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)

        val username = usernameInput.text.toString()
        val password = passwordInput.text.toString()
        val button: Button = findViewById(R.id.login_btn)



        button.setOnClickListener {
            if (TextUtils.isEmpty(username)) {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_LONG).show()
            } else if (TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Please enter password", Toast.LENGTH_LONG).show()
            } else if ((username.toString()=="Admin") && (password.toString() == "Admin")){
                startActivity(Intent(this,MainActivity2::class.java))
                }
            else {
                Toast.makeText(this, "Please enter correct username and password", Toast.LENGTH_LONG).show()
            }
        }

    }
}