package part6

class ReplaceTempWithQuerySample {
    private var quantity: Int = 0
    private var itemPrice: Int = 0

    fun calcPrice(): Double {
        val basePrice = quantity * itemPrice
        val discountFactor = if (basePrice > 1000) 0.95 else 0.98
        return basePrice * discountFactor
    }
}