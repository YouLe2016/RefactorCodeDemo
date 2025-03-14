package part9.introduceNullObj

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SiteTest {
    @Test
    fun state() {
        val site = Site()
        assertEquals(site.state(),"name: occupant, plan: , weeksDelinquent: 0")

        val customer = Customer(
            name = "李白",
            plant = BillingPlan(name = "购物"),
            history = PaymentHistory(weeksDelinquent = 6)
        )
        site.customer = customer
        assertEquals(site.state(), "name: 李白, plan: 购物, weeksDelinquent: 6")
    }

}