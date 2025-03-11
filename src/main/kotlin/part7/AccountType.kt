package part7

const val AccountType_Senior = 1
const val AccountType_Normal = AccountType_Senior + 1

class AccountType(
    private val type: Int,
    var interestRate: Double
) {
    fun isPremium(): Boolean {
        return type == AccountType_Senior
    }
}
