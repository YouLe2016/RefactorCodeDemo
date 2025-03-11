package part7.movemethod

import part7.AccountType
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class Account(
    private val type: AccountType,
    private val dayOverdrawn: Int
) {
    fun calculateInterestRate(amount: Int, days: Int): BigDecimal {
        return if (type.isPremium()) {
            (type.interestRate * amount * days / 360).toBigDecimal(MathContext(2, RoundingMode.HALF_UP))
        } else {
            (type.interestRate * amount * days / 30 / 12).toBigDecimal(MathContext(2, RoundingMode.HALF_UP))
        }
    }

    fun calcOverdraftCharge(): Double {
        if (type.isPremium()) {
            if (dayOverdrawn > 7) {
                return 10.0 + (dayOverdrawn - 7) * 0.85
            }
            return 10.0
        }
        return dayOverdrawn * 1.75
    }
}
