package part9.replaceConditional

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EmployeeTest {
    @Test
    fun calcPayAmount() {
        val employee = Employee(
            monthlySalary = 1000,
            type = EmployeeType.Engineer
        )
        assertEquals(1000, employee.calcPayAmount())

        val manager = Employee(
            monthlySalary = 1000,
            bonus = 2000,
            type = EmployeeType.Manager
        )
        assertEquals(3000, manager.calcPayAmount())

        val salesMan = Employee(
            monthlySalary = 1000,
            commission = 1000,
            type = EmployeeType.Salesman
        )
        assertEquals(2000, salesMan.calcPayAmount())
    }
}