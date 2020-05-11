package com.example.kotlinbase

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 15:11
 * @Description: 用途：完成特定功能
 */
class ListDemo {
    //list集合
    var lists = listOf<String>("1","2","3","4")
    //遍历
    fun test(){
        //第一种遍历
        for (i in lists){
            println(i)
        }
        //第二种
        for ((i,e) in lists.withIndex()){
            println("下标：${i},值：${e}");
        }
    }
}