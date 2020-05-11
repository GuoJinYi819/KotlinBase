package com.example.kotlinbase.mfl

/**ClassName: KotlinBase
 * @author 作者 : GuoJinYi
 * @version 创建时间：2020/5/11 0011 19:42
 * @Description: 用途：密封类
 */
//外边的类就不能继承它
sealed class Son{   //sealed class 子类类型有限的class
    class a:Son()
    class b:Son()
    fun test(){
        println("11111")
    }
}