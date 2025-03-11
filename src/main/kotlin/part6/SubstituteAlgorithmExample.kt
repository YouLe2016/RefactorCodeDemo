package part6

class SubstituteAlgorithmExample {
    fun findPerson(people: Array<String>): String {
        val list = listOf("Tom", "Sam", "Tim", "Li")
        for (person in people) {
            if (person in list) {
                return person
            }
        }
        return ""
    }
}