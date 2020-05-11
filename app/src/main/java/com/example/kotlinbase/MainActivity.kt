package com.example.kotlinbase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 6
        var b = 2
        //加减乘除操作
        var function:Function = Function();
        println(function.sub(a,b))
        println(function.plus(a,b))
        println(function.devide(a,b))
        println(function.mutl(a,b))




    }
}
