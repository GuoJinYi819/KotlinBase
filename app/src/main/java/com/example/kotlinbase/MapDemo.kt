package com.example.kotlinbase

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 15:21
 * @Description: 用途：完成特定功能
 */
class MapDemo {
    //声明
    var map = hashMapOf<String,String>("hh" to "哈哈"
        ,"11" to "one")

    fun test(){
        //遍历map
        for (key in map.entries){
            println("${key.key}->${key.value}")
        }

        for ((k,v)in map){
            println("${k}==${v}")
        }
    }


}