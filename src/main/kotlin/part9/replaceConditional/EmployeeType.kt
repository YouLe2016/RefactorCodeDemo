package part9.replaceConditional


sealed class EmployeeType {
    abstract fun calcPayAmount(employee: Employee): Int

    object Engineer : EmployeeType() {
        override fun calcPayAmount(employee: Employee): Int =
            employee.monthlySalary
    }

    object Manager : EmployeeType() {
        override fun calcPayAmount(employee: Employee): Int =
            employee.monthlySalary + employee.bonus
    }

    object Salesman : EmployeeType() {
        override fun calcPayAmount(employee: Employee): Int =
            employee.monthlySalary + employee.commission
    }
}

