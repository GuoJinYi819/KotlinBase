package com.example.kotlinbase.mxdx

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 16:50
 * @Description: 用途：完成特定功能
 */
            //定义属性
class Girl(var name:String,var sex:Int){
    //定义行为
    fun test(){
        println("嘿嘿嘿")
    }
}
fun main(args: Array<String>) {
    var g = Girl("小妹",18)
    println(g.name)
    println(g.sex)
    //打印对象行为
    g.test()
}