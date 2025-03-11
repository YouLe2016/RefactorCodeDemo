package part7

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

const val AccountType_Senior = 1
const val AccountType_Normal = AccountType_Senior + 1

class AccountType(
    private val type: Int,
    val interestRate: Double,
) {
    fun isPremium(): Boolean {
        return type == AccountType_Senior
    }

    fun calcOverdraftCharge(dayOverdrawn: Int): Double {
        if (isPremium()) {
            if (dayOverdrawn > 7) {
                return 10.0 + (dayOverdrawn - 7) * 0.85
            }
            return 10.0
        }
        return dayOverdrawn * 1.75
    }

    fun calculateInterestRate(amount: Int, days: Int): BigDecimal {
        return if (isPremium()) {
            (interestRate * amount * days / 360).toBigDecimal(MathContext(2, RoundingMode.HALF_UP))
        } else {
            (interestRate * amount * days / 30 / 12).toBigDecimal(MathContext(2, RoundingMode.HALF_UP))
        }
    }
}
