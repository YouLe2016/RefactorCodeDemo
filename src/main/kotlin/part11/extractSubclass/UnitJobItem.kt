package part11.extractSubclass

class UnitJobItem(
    private val price: Int, quantity: Int
) : JobItem(quantity) {
    override fun getUnitPrice(): Int {
        return price
    }
}