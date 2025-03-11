package part6

import org.junit.jupiter.api.Test

class SubstituteAlgorithmExampleTest {
    @Test
    fun findPersonReturnTom() {
        val people = arrayOf("Tom", "Jerry", "Spike")
        val result = SubstituteAlgorithmExample().findPerson(people)
        assert(result == "Tom")
    }

    @Test
    fun findPersonReturnSam() {
        val people = arrayOf("Jerry", "Sam", "Spike")
        val result = SubstituteAlgorithmExample().findPerson(people)
        assert(result == "Sam")
    }

    @Test
    fun findPersonReturnEmpty() {
        val people = arrayOf("Jerry", "Spike")
        val result = SubstituteAlgorithmExample().findPerson(people)
        assert(result == "")
    }

    @Test
    fun findPersonReturnTim() {
        val people = arrayOf("Jerry", "Spike", "Tim")
        val result = SubstituteAlgorithmExample().findPerson(people)
        assert(result == "Tim")
    }

}