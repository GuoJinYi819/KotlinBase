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

        val diaryGenerater = diaryGenerater("李白")
        println(diaryGenerater)

        checkFace(100)

    }
    //日记生成方法
    fun diaryGenerater(placeName:String):String{
        //动态替换 ${ }
        var temple = "唐代：${placeName}  ---白日依山尽，长河落日圆"
        return temple;
    }

    //条件控制   颜值判断器
    fun checkFace(score:Int){
        if (score>80){
            //字符串模板
            println("分数${score}")
        }else{
            println("分数${score}")
        }
    }

}
