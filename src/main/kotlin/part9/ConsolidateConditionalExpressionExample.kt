package part9

class ConsolidateConditionalExpressionExample {
    fun calcDisabilityAmount(age: Int, monthsDisabled: Int, isPartTime: Boolean): Double {
        if (age < 2) {
            return 0.0
        }
        if (monthsDisabled > 12) {
            return 0.0
        }
        if (isPartTime) {
            return 0.0
        }
        if (monthsDisabled > 6) {
            if (age > 60) {
                return 30000.0
            }
        }
        return 10000.0
    }
}