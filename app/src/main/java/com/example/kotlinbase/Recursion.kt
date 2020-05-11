package com.example.kotlinbase

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 16:24
 * @Description: 用途：完成特定功能
 */
class Recursion {

    //阶乘
    tailrec fun fact(num:Int,result:Int):Long{
        println("运算了==${num}次")
        if(num==1){
            return 1;
        }else{
            return fact(num-1,result+num)
        }
    }

}