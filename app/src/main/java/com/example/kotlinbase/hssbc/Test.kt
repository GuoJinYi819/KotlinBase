package com.example.kotlinbase.hssbc

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 20:03
 * @Description: 用途：完成特定功能
 */

var print = fun (name:String):Unit{
    println(name)
}

fun main() {
    var list = listOf<String>("111","1223")
   // list.forEach(print)  太麻烦
    //闭包
    list.forEach {
        println(it)
    }
}