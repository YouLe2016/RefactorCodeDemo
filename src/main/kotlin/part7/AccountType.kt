package part7

import part7.movefield.AccountType_Senior

class AccountType(
    private val type: Int
) {
    fun isPremium(): Boolean {
        return type == AccountType_Senior
    }
}
