package demo1

import kotlin.math.pow

/**
 * 数字42是"生命、宇宙以及一切终极问题的答案"
 * （至少这是Douglas Adams在Hitchhiker's Guide to the Galaxy中的说法  ）
 */
fun main() {

    println(42.toString(2))

    val result = 2.toDouble().pow(8).toInt()
    println("result:$result")

    println(2 `**` 1)
    println(2 `**` 2)
}

/**
 * 类型转换
 * toByte：Byte
 * toChar：Char
 * toShort：Short
 * toInt()：Int
 * toLong()：Long
 * toFloat()：Float
 * toDouble()：Double
 */

val intVar:Int = 3
val longVar:Long = intVar.toLong()

val longSum = 3L + intVar

/**
 * 像Java一样，Kotlin没有内置的幂运算符，Java至少在java.lang.Math类中包含
 * 静态pow函数，其签名如下：
 * public static double Math.pow(double a,double b)
 * 由于Java自动将较短的原生类型转换为较长的原生类型
 * 例如，int转换为double，因此这是实现幂运算功能的唯一函数，
 * 然而在Kotlin中没有原生类型，而诸如Int这种类的实例不会自动
 * 转换为Long或者Double，当你注意到Kotlin标准库确实在Float
 * 与Double上定义了一个名为pow的扩展函数，但在Int或Long中没有
 * 相反的pow函数时，这就很烦人。
 *
 * 现有函数的签名如下：
 */
fun Double.pow(x:Double): Double? {return null}
fun Float.pow(x:Float): Float? {return null}

/**
 * 中缀表达式
 * 给予符号新的功能
 */
infix fun Int.`**`(x:Int) = toDouble().pow(x).toInt()
infix fun Long.`**`(x:Int) = toDouble().pow(x).toLong()
infix fun Float.`**`(x:Int) = pow(x)
infix fun Double.`**`(x:Int) = pow(x)

/**
 * 形式上类似于Float与Double上的现有函数
 * fun Int.pow(x:Int) = `**`(x)
 * fun Long.pow(x:Int) = `**`(x)
 *
 * 在定义**函数时使用了infix关键字，但没有将pow扩展为Int与Long从而保持
 * Float与Double模式
 * 最终结果是你可以将**符号用作综合的幂运算符
 */

/**
 * 如果你对双星号操作符包装在反引号中比较反感，可以很容易定义一个
 * 实际的函数名来代替，例如exp
 */