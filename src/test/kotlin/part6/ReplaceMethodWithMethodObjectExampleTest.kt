package part6

import org.junit.jupiter.api.Assertions.*

import kotlin.test.Test

class ReplaceMethodWithMethodObjectExampleTest {
    private val example = ReplaceMethodWithMethodObjectExample()

    @Test
    fun testCalcPrice() {
        val result = example.calcPrice(10.0, 5, 2)
        assertEquals(350.0, result)
    }

    @Test
    fun testCalcPrice2() {
        val result = example.calcPrice(10.0, 5, 4)
        assertEquals(2680.0, result)
    }
}
