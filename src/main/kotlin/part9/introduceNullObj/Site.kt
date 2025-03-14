package part9.introduceNullObj

class Site {
    var customer: Customer = NullCustomer

    fun state(): String {
        return "name: ${customer.name}, plan: ${customer.plant.name}, weeksDelinquent: ${customer.history.weeksDelinquent}"
    }
}

private object NullPaymentHistory : PaymentHistory(0)

private object NullCustomer : Customer(
    name = "occupant",
    plant = BillingPlanFactory.getBase(),
    history = NullPaymentHistory
)