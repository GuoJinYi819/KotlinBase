package com.example.kotlinbase.mxdx

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 17:14
 * @Description: 用途：完成特定功能
 */
fun main() {
//    var son = Son()
//    println("儿子的性格=${son.c}")
//    son.action()
    var p1 = Man("孙悟空")
    var p2 = WoMan("武则天")
    var p3 = WoMan("小黑")

    //存入到集合
    var list = listOf<Human>(p1,p2,p3)
    for (i in list){
        i.pe()
    }

}