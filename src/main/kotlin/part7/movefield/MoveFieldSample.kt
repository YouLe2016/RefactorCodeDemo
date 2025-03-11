package part7.movefield

import part7.AccountType
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

const val AccountType_Senior = 1
const val AccountType_Normal = AccountType_Senior + 1

class Account(
    private val type: AccountType,
    private var interestRate: Double
) {
    fun calculateInterestRate(amount: Int, days: Int): BigDecimal {
        return if (type.isPremium()) {
            (interestRate * amount * days / 360).toBigDecimal(MathContext(2, RoundingMode.HALF_UP))
        } else {
            (interestRate * amount * days / 30 / 12).toBigDecimal(MathContext(2, RoundingMode.HALF_UP))
        }
    }
}
