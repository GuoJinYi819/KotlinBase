package com.example.kotlinbase.mxdx

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 17:21
 * @Description: 用途：完成特定功能
 */
class Man(name:String):Human(name) {
    override fun pe() {
        println("${name} 站着")
    }

    override fun eat() {
        println("${name} 巴戟巴戟巴戟吃饭")
    }

}