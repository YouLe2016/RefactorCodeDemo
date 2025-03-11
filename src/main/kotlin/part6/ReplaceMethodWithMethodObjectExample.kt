package part6

class ReplaceMethodWithMethodObjectExample {
    fun calcPrice(itemPrice: Double, quantity: Int, calcFactor: Int): Double {
        var basePrice = itemPrice * quantity
        var secondBasePrice = itemPrice * quantity * calcFactor
        var thirdBasePrice = itemPrice * quantity * calcFactor * calcFactor
        var fourthBasePrice = 0.0
        var result = 0.0

        if ((thirdBasePrice - secondBasePrice) > 200) {
            fourthBasePrice = thirdBasePrice * 2
            callMethod()
        }

        if ((secondBasePrice - basePrice) > 100) {
            result += basePrice - 20
        }
        result += basePrice + secondBasePrice + thirdBasePrice + fourthBasePrice
        return result
    }

    private fun callMethod() {
        // 实现callMethod的逻辑
    }
}
