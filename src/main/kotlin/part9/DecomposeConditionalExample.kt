package part9

import java.util.Date

// 注意：Java的Date构造函数中month是0-11（6对应7月，9对应10月）
// Date构造函数的year需减1900
private val SUMMER_START = Date(2022 - 1900, 7 - 1, 1)
private val SUMMER_END = Date(2022 - 1900, 10 - 1, 1)

class DecomposeConditionalExample {
    fun calcCharge(
        date: Date,
        quantity: Int,
        winterRate: Double,
        summerRate: Double,
        winterServiceCharge: Double
    ): Double {
        return if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            quantity * winterRate + winterServiceCharge
        } else {
            quantity * summerRate
        }
    }
}