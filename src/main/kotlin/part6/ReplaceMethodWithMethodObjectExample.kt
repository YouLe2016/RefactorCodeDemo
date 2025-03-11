package part6

import part6.tool.PriceCalculator

class ReplaceMethodWithMethodObjectExample {
    fun calcPrice(itemPrice: Double, quantity: Int, calcFactor: Int): Double {
        return PriceCalculator(itemPrice, quantity, calcFactor, this).calc()
    }

    fun callMethod() {
        // 实现callMethod的逻辑
    }
}
