package demo1

/**
 * 今天能够抽身出来学一会儿 Kotlin 也是感激啦
 */
import java.text.NumberFormat
import demo1.helloWorldFirstLen as demo1HelloWorldFirstLen

class Person(val first:String,
             val middle:String?,
             val last:String)

val jkRowling = Person("Joanne",null,"Rowling")

val northWest = Person("North",null,"West")

var helloWorld = Person(first="hello",middle=null,last="world")

/**
 * Elvis操作符会检查表达式左边的值，如果它不为空，则返回它。
 * otherwise，该操作符会返回表达式右边的值。
 * 更确切地说，Groovy是按这种方法设计的，Elvis操作符是从Grovvy借来的。
 */
val helloWorldMiddleLen = helloWorld.middle?.length?:0
val helloWorldFirstLen = helloWorld.first?.length?:0
fun main() {
    println(helloWorldMiddleLen)
    println(demo1.helloWorldFirstLen)
}

// null or not
/**
 * Kotlin最主要的特征之一就是使类型系统在编译时强制实现可空性。
 * 如果你声明一个类型为String的变量，则它永不为空，
 * 反之，如果它的类型被声明为String?，则可以如下所示：
 */
/**
 * if s is null , then can not compile
 * the ? behind the variable's type determine this is a type can be null
 */
var s:String = "Hello,World!"
var t:String? = null

/**
 * 在你希望与Java代码进行交互之前，一切都很正常，因为Java代码没有内置这种机制。
 * 但如果使用定义在javax.annotation包下的@Nonnull注解，Java也可以做到这些。
 * 尽管现在认为该规范处于非启用状态，但是许多库都参考了JSR-305兼容性注解，
 * 并且Kotlin也支持它们。
 */

/**
 * 例如，在使用Spring框架时，
 * 可以通过将示例2-9中的代码添加到Gradle构建文件中来强制启动兼容。
 */

/**
 * 强制Gradle兼容JSR-305（Groovy DSL）
 * sourceCompatibility=1.8
 * compileKotlin {
 *      kotlinOptions {
 *          jvmTarget="1.8"
 *          freeCompilerArgs=["-Xjsr305=strict"]
 *      }
 * }
 * compileTestKotlin {
 *      kotlinOptions {
 *          jvmTarget="1.8"
 *          freeCompilerArgs=["Xjsr305=strict"]
 *      }
 * }
 *
 * 如果想要使用Gradle的Kotlin DSL(definition structure language)
 * 来做同样的事情，请参见下面代码
 * tasks.withType<KotlinCompile> {
 *      kotlinOptions {
 *          jvmTarget="1.8"
 *          freeCompilerArgs=listOf("-Xjsr305=strict")
 *      }
 * }
 *
 *
 * 对于Maven，按照Kotlin参考指南中的说明，下面的代码加到pom文件中即可
 * 强制Maven兼容JSR-305
 * <plugin>
 *     <groupId>org.jetbrains.kotlin</groupId>
 *     <artifactId>kotlin-maven-plugin</artifactId>
 *     <version>${kotlin.version}</version>
 *     <executions>...</executions>
 *     <configuration>
 *         <nowarn>true</nowarn>  <!--Disable warnings-->
*          <args>
 *              <!--Enable strict mode for JSR-305 annotations-->
 *              <arg>-Xjsr305=strict</arg>
 *              ...
*          </args>
 *     </configuration>
 * </plugin>
 *
 * JSR-305中定义的@Nonnull注解采用名为when的属性。如果该值的when属性的值为When.ALWAYS,
 * 则这个带注解的类型将被视为非空类型。如果值为When.MAYBE或When.NEVER，它将被认为是可空的。
 * 如果为When.UNKNOWN,则该类型会被认为是可空性未知的平台类型。
 *
 */

/**
 * 当🈶️一个方法，设定来默认值，和可空，如何从Java调用它而无须为每个参数显式指定值
 * 为函数添加@JvmOverloads注解。
 */
//示例 一个带默认参数带Kotlin函数
fun addProduct(name:String,price:Double=0.0,desc:String?=null)=
    "Adding product with $name, ${desc ?:"None"},and "+
            NumberFormat.getCurrencyInstance().format(price)

