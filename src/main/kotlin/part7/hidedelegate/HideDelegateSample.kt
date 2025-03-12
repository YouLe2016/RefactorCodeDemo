package part7.hidedelegate

class Department(
    val manager: Person?
)

open class Person(
    val name: String
) {
    var department: Department? = null
}