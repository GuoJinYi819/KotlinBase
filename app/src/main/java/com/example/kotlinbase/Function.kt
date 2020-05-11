package com.example.kotlinbase

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 14:11
 * @Description: 用途：完成特定功能
 */
class Function {
  //fun 固定写法  plus函数名 a,b函数  Int返回值
    fun plus(a:Int,b:Int):Int{
      //函数体(方法体)
        return a+b;
    }
    fun sub(a:Int,b:Int):Int{
        //函数体(方法体)
        return a-b;
    }
    fun mutl(a:Int,b:Int):Int{
        //函数体(方法体)
        return a*b;
    }
    fun devide(a:Int,b:Int):Int{
        //函数体(方法体)
        return a/b;
    }

    //函数和函数表达式
    //这个i 就成了一个函数
    var i = {x:Int,y:Int->x+y}
    var x = i(5,9);

    //直接返回
    fun add(x:Int,y:Int):Int = x+y
}