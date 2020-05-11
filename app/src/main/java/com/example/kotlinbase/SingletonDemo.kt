package com.example.kotlinbase

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 19:06
 * @Description: 用途：完成特定功能
 */
//单例模式
class SingletonDemo{
    //私有 构造函数
    private constructor()

    //类名调用  相当于java中的静态方法
    companion object{
        //定义静态实例                    ? 代表参数可以为空
        private var instance:SingletonDemo? = null
        get(){
            if(field==null){
                field = SingletonDemo()
            }
            return field
        }
        fun get():SingletonDemo{
                        //!! 如果参数为空 就抛出异常
            return instance!!
        }
    }
    fun a1(){
        println("嘿嘿")
    }
}