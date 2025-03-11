package part6.tool

import part6.ReplaceMethodWithMethodObjectExample

class PriceCalculator(
    itemPrice: Double,
    quantity: Int,
    calcFactor: Int,
    private val example: ReplaceMethodWithMethodObjectExample
) {
    val basePrice: Double = itemPrice * quantity
    val secondBasePrice: Double = itemPrice * quantity * calcFactor
    val thirdBasePrice: Double = itemPrice * quantity * calcFactor * calcFactor

    fun calc(): Double {
        var result = 0.0
        var fourthBasePrice = 0.0
        if ((thirdBasePrice - secondBasePrice) > 200) {
            fourthBasePrice = thirdBasePrice * 2
            example.callMethod()
        }

        if ((secondBasePrice - basePrice) > 100) {
            result += basePrice - 20
        }
        result += basePrice + secondBasePrice + thirdBasePrice + fourthBasePrice
        return result
    }
}
