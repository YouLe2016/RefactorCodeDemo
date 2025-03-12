package part7.extractclass

class Person(
    private val name: String,
    val phoneNumber: TelephoneNumber
) {
    val telephoneNumber: String
        get() = phoneNumber.phoneNumber
}