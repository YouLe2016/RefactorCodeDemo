package part6

class ReplaceTempWithQuerySample() {
    private var quantity: Int = 0
    private var itemPrice: Int = 0

    fun calcPrice(): Double {
        val result = calcBasePrice() * calcFactor()
        println("price: $result")
        return result
    }

    private fun calcFactor(): Double {
        val result = if (calcBasePrice() > 1000) 0.8 else 0.9
        println("factor: $result")
        return result
    }

    private fun calcBasePrice(): Int {
        val result = quantity * itemPrice
        println("basePrice: $result")
        return result
    }

    fun run() {
        quantity = 600
        itemPrice = 2
        calcPrice()
        quantity = 400
        itemPrice = 2
        calcPrice()
    }
}