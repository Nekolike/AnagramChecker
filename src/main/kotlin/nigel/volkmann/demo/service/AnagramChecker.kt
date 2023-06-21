import java.util.*

class AnagramChecker {
    companion object {
        fun String.isAnagramFor(secondWord: String): Boolean {
            val firstWordWithOnlyLetters = this.keepLettersOnly()
            val secondWordWithOnlyLetters = secondWord.keepLettersOnly()
    
            if (firstWordWithOnlyLetters.length != secondWordWithOnlyLetters.length) {
                return false
            }
    
            return firstWordWithOnlyLetters.lowercase().toCharArray().sorted().equals(
                secondWordWithOnlyLetters.lowercase().toCharArray().sorted())
    
        }
    
        private fun String.keepLettersOnly(): String = this.replace(Regex("[^a-zA-Z]"), "")
    }
}