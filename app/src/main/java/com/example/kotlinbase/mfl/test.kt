package com.example.kotlinbase.mfl

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 19:44
 * @Description: 用途：完成特定功能
 */
fun main() {
    var s:Son = Son.a()
    var ss:Son = Son.b()
    var list = listOf<Son>(s,ss)

    for (i in list){
       if(i is Son.a){
           i.test()
       }
    }
}