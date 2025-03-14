package part9.introduceNullObj

class BillingPlan(val name: String)

object BillingPlanFactory {
    fun getBase(): BillingPlan {
        return BillingPlan("")
    }
}