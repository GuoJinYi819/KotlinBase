package com.example.kotlinbase.mxdx

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 17:21
 * @Description: 用途：完成特定功能
 */
class WoMan(name:String):Human(name) {
    override fun eat() {
        println("${name} 小口吃饭")
    }

}