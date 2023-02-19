package com.example.geussthemarvelcharecter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userinput :TextInputEditText = findViewById(R.id.textInputEditText)
        val button : Button = findViewById(R.id.button)
        val result : TextView = findViewById(R.id.textView2)
        val usersanswer = userinput.toString()
        val correctanswer : String = "lorem ipsem"
        if (usersanswer == correctanswer){
            result.text = "You are right"
        }
        else{
            result.text = "You are wrong"
        }
    }
}