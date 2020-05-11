package com.example.kotlinbase.bb

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 19:56
 * @Description: 用途：完成特定功能
 */
        //返回函数 函数返回值为null
fun test():()->Unit{
    var i = 3;
    return fun(){
        i++
        println(i)
    }
}
fun main() {
    //直接接收函数
    var t = test()
    t()
    t()
}