object Bob {
    fun hey(input: String): String {
        val msg = input.trimEnd()
        return when {
            msg.isBlank() -> "Fine. Be that way!"
            isYelling(msg) && msg.last() == '?' -> "Calm down, I know what I'm doing!"
            isYelling(msg) -> "Whoa, chill out!"
            msg.last() == '?' -> "Sure."
            else -> "Whatever."
        }
    }

    fun isYelling(msg: String) = msg.all { it.isUpperCase() || !it.isLetter() } && msg.any { it.isLetter() }
}

