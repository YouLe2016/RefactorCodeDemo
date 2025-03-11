package part7.movefield

import part7.AccountType
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class Account(
    private val type: AccountType
) {
    fun calculateInterestRate(amount: Int, days: Int): BigDecimal {
        return if (type.isPremium()) {
            (type.interestRate * amount * days / 360).toBigDecimal(MathContext(2, RoundingMode.HALF_UP))
        } else {
            (type.interestRate * amount * days / 30 / 12).toBigDecimal(MathContext(2, RoundingMode.HALF_UP))
        }
    }
}
