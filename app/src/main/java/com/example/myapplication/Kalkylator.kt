package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kalkylator.*

class Kalkylator : AppCompatActivity() {

    var curValue: String = ""
    var op = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkylator)

        btn5.setOnClickListener{
            curValue = curValue + "1"}
        btn6.setOnClickListener{
            curValue = curValue + "2"}
        btn7.setOnClickListener{
            curValue = curValue + "3"}
        btn8.setOnClickListener{
            curValue = curValue + "4"}
        btn9.setOnClickListener{
            curValue = curValue + "5"}
        btn10.setOnClickListener{
            curValue = curValue + "6"}
        btn11.setOnClickListener{
            curValue = curValue + "7"}
        btn12.setOnClickListener{
            curValue = curValue + "8"}
        btn13.setOnClickListener{
            curValue = curValue + "9"}
        btn15.setOnClickListener{
            curValue = curValue + "0"}

        
    }
}