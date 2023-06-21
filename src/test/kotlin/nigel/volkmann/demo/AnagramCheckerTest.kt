package nigel.volkmann.demo

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource
import org.springframework.boot.test.context.SpringBootTest
import AnagramChecker.Companion.isAnagramFor

@SpringBootTest
class DemoApplicationTests {

	@ParameterizedTest
    @CsvFileSource(resources = ["/anagrams.csv"], numLinesToSkip = 1)
	fun `check words which are anagrams`(firstWord: String, secondWord: String) {
        assertTrue(firstWord.isAnagramFor(secondWord))
	}

    @ParameterizedTest
    @CsvFileSource(resources = ["/nonAnagrams.csv"], numLinesToSkip = 1)
    fun `check words which are not anagrams`(firstWord: String, secondWord: String) {
        assertFalse(firstWord.isAnagramFor(secondWord))
	}
}