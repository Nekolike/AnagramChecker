package nigel.volkmann.demo

import AnagramChecker.Companion.isAnagramFor

class DemoApplication

fun main(args: Array<String>) {
	showWelcomeMessage()

	while(true) {
		println("Enter you first word")
		val firstWord = readLine()!!
		if(userWantsToExit(firstWord)) break
	
		println("Enter you second word")
		val secondWord = readLine()!!
		if(userWantsToExit(secondWord)) break
	
		println("Let's see if they are anagrams")
	
		if(firstWord.isAnagramFor(secondWord)) {
			println("They are!")
		} else {
			println("They are not!")
		}

		println("You can keep going or exit the application by entering x when asked for input")
	}
}

private fun showWelcomeMessage() {
	println("Welcome to my demo.") 
	println("You can enter words to check wether they are anagrams for each other or not")
	println("You can exit the application by simply entering x when asked for input")
}

private fun userWantsToExit(inputToCheck: String): Boolean {
	return inputToCheck.lowercase().equals("x")
}
