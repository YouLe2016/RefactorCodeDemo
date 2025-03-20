package part11.extractSubclass

class JobItem(
    private val unitPrice: Int,
    private val quantity: Int,
    private val employee: Employee?,
    private val isLabor: Boolean = false,
) {
    fun calculateTotal(): Int {
        return getUnitPrice() * quantity
    }

    fun getUnitPrice(): Int {
        return if (isLabor) employee!!.rate else unitPrice
    }
}