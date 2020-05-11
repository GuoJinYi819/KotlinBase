package com.example.kotlinbase.sz

import com.example.kotlinbase.mxdx.Human

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 17:34
 * @Description: 用途：完成特定功能
 */
//继承抽象类   实现接口
class Man:Human(name = "黑犀铠甲"),IMan{
    override fun pe() {

    }

    override fun eat() {
        println("不会吃饭")
    }

    //重写接口方法
    override fun a() {
        println("aaaaa")
    }

}