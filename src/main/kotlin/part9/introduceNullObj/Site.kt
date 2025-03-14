package part9.introduceNullObj

class Site {
    var customer: Customer? = null

    fun state(): String {
        var plan = BillingPlanFactory.getBase()
        var name = "occupant"
        var weeksDelinquent = 0
        customer?.let {
            plan = it.plant
            name = it.name
            weeksDelinquent = it.history.weeksDelinquent
        }
        return "name: $name, plan: ${plan.name}, weeksDelinquent: $weeksDelinquent"
    }
}