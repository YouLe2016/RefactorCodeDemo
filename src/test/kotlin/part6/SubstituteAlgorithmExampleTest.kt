package part6

import org.junit.jupiter.api.Test

class SubstituteAlgorithmExampleTest {
    @Test
    fun findPersonReturnTom() {
        // given
        val people = arrayOf("Tom", "Jerry", "Spike")
        // when
        val result = SubstituteAlgorithmExample().findPerson(people)
        // then
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

    @Test
    fun findPersonReturnLi() {
        val people = arrayOf("Li")
        val result = SubstituteAlgorithmExample().findPerson(people)
        assert(result == "Li")
    }
}