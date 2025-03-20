package part11.extractSubclass

abstract class JobItem(private val quantity: Int) {
    fun calculateTotal(): Int {
        return getUnitPrice() * quantity
    }

    abstract fun getUnitPrice(): Int
}