package part7.hidedelegate

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HideDelegateSampleTest {
    private val person = Person("小白")

    @Test
    fun getName() {
        assertEquals(person.name,"小白")
    }

    @Test
    fun getDepartmentName() {
        assertEquals(person.managerName, "")
        // given
        val department = Department()
        person.department = Department()
        // then
        assertEquals(person.managerName, "")
        // given
        department.manager = Person("老白")
        // then
        assertEquals(person.managerName, "老白")
    }
}