package part11.extractSubclass

class LaborJobItem(
    private val employee: Employee, quantity: Int
) : JobItem(quantity) {
    override fun getUnitPrice(): Int {
        return employee.rate
    }
}