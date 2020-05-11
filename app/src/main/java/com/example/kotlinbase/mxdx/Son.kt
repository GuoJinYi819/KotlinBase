package com.example.kotlinbase.mxdx

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 17:12
 * @Description: 用途：完成特定功能
 */
class Son:Fathor() {
    //重写父类方法
    override fun action() {
        println("儿子不喜欢大声bb")
    }
}