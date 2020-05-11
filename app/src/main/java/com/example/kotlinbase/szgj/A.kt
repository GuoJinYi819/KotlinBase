package com.example.kotlinbase.szgj

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 20:50
 * @Description: 用途：完成特定功能
 */
data class A(var name:String, var age:Int)

var text = listOf<A>(A("小黑",19),A("小白",11),A("小蓝",19))


//上边的两个函数 太重复了
//行为参数化  把筛选的行为作为参数传递到过滤器里面  简洁代码 提高效率