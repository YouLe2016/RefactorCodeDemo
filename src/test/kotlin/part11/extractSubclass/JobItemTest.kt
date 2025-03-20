package part11.extractSubclass

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JobItemTest {
    @Test
    fun calculateTotalIsLabor() {
        // given
        val jobItem = JobItem(
            unitPrice = 100,
            quantity = 2,
            employee = null,
            isLabor = false
        )
        // when
        val result = jobItem.calculateTotal()
        // then
        assertEquals(200, result)
    }

    @Test
    fun calculateTotalIsNotLabor() {
        // given
        val jobItem = JobItem(
            unitPrice = 100,
            quantity = 2,
            employee = Employee(rate = 200),
            isLabor = true
        )
        // when
        val result = jobItem.calculateTotal()
        // then
        assertEquals(400, result)
    }
}