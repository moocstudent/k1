import demo1.addProduct
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

/**
 * 听着潇潇的歌，新的一天又开始了
 * 沉浸在Kotlin里，今天打消了去骑行的念头
 */


fun `check all overloads`(){
    assertAll("Overloads called from Kotlin",
        {println(addProduct("Name",5.0,"Desc"))},
        {println(addProduct("Name",5.0))},
        {println(addProduct("Name"))}
    )
}

fun main() {
    `check all overloads`()
}