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
        // given
        person.department = Department(Person("老白"))
        // when
        val name = person.department?.manager?.name
        // then
        assertEquals(name, "老白")
    }
}