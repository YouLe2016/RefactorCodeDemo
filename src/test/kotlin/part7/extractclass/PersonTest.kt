package part7.extractclass

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PersonTest {
    private val person = Person("李白", TelephoneNumber())

    @Test
    fun getTelephoneNumber() {
        // then
        assertEquals("", person.telephoneNumber)

        // given
        person.phoneNumber.setNumber("5889110")
        // then
        assertEquals("5889110", person.telephoneNumber)

        // given
        person.phoneNumber.setAreaCode("010")
        // then
        assertEquals("(010)5889110", person.telephoneNumber)

        // given
        person.phoneNumber.setNumber("")
        // then
        assertEquals("(010)", person.telephoneNumber)
    }
}