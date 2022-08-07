package demo1

/**
 * 数字42是"生命、宇宙以及一切终极问题的答案"
 * （至少这是Douglas Adams在Hitchhiker's Guide to the Galaxy中的说法  ）
 */
fun main() {

    println(42.toString(2))
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

