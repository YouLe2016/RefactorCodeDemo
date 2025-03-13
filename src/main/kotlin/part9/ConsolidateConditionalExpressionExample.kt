package part9

class ConsolidateConditionalExpressionExample {
    fun calcDisabilityAmount(age: Int, monthsDisabled: Int, isPartTime: Boolean): Double {
        // 合并前置条件判断
        if (isNotDisability(age, monthsDisabled, isPartTime)) {
            return 0.0
        }
        // 处理主要逻辑
        return if (monthsDisabled > 6 && age > 60) 30000.0 else 10000.0
    }

    private fun isNotDisability(age: Int, monthsDisabled: Int, isPartTime: Boolean): Boolean =
        age < 2 || monthsDisabled > 12 || isPartTime
}