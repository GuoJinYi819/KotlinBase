package com.example.kotlinbase.szgj

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 20:50
 * @Description: 用途：完成特定功能
 */
data class A(var name:String, var age:Int)

var text = listOf<A>(A("小黑",19),A("小白",11),A("小蓝",19))

fun filterage(age:Int){
    var a= ArrayList<A>()

    for (i in text){
        if(i.age==age){
            a.add(i)
        }
    }
    for (i in a){
        println("${i.name}")
    }
}