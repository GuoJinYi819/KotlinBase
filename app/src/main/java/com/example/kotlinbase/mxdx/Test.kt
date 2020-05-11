package com.example.kotlinbase.mxdx

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 16:42
 * @Description: 用途：完成特定功能
 */
//定义了一个类   设置了两个参数
class Rect(var h:Int,var w:Int)

fun main() {
    //创建了这个类
    val rect = Rect(10, 20)
    //打印
    println("高度 ${rect.h}")
    println("宽度 ${rect.w}")

}