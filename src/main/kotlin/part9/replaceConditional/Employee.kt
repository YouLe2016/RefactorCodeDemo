package part9.replaceConditional

const val EmployeeType_Engineer = 0
const val EmployeeType_SalesMan = EmployeeType_Engineer + 1
const val EmployeeType_Manger = EmployeeType_SalesMan + 1

class Employee(
    val monthlySalary: Int,
    val commission: Int = 0,
    val bonus: Int = 0,
    val type: EmployeeType = EmployeeType.Engineer
) {
    fun calcPayAmount(): Int {
        return type.calcPayAmount(this)
    }
}