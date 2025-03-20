package part11.extractSubclass

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JobItemTest {
    @Test
    fun calculateTotalIsNotLabor() {
        // given
        val jobItem = UnitJobItem(price = 100, quantity = 2)
        // when
        val result = jobItem.calculateTotal()
        // then
        assertEquals(200, result)
    }

    @Test
    fun calculateTotalIsLabor() {
        // given
        val jobItem = LaborJobItem(quantity = 2, employee = Employee(rate = 200))
        // when
        val result = jobItem.calculateTotal()
        // then
        assertEquals(400, result)
    }
}