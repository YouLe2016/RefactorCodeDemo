package part7.movemethod

import part7.AccountType

class Account(
    private val type: AccountType,
    var dayOverdrawn: Int
) {
    fun calcOverdraftCharge(): Double {
        return type.calcOverdraftCharge(this.dayOverdrawn)
    }
}
