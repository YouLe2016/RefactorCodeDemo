package part6

class SubstituteAlgorithmExample {
    fun findPerson(people: Array<String>): String {
        for (person in people) {
            if (person == "Tom") {
                return "Tom"
            }
            if (person == "Sam") {
                return "Sam"
            }
            if (person == "Tim") {
                return "Tim"
            }
        }
        return ""
    }
}