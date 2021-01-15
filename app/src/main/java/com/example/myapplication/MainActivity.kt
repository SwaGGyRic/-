package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread.sleep(2000)
        startActivity(Intent(this, Kalkylator::class.java))

    }

    private fun function2(v: View){
        Toast.makeText(this, "Я работаю уже", Toast.LENGTH_SHORT).show()
    }

}