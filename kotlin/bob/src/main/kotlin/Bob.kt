object Bob {
    fun hey(input: String): String {
        val msg = input.trimEnd()
        return when {
            msg.isBlank() -> "Fine. Be that way!"

            msg.any { it.isLetter() } &&
                    msg.all { it.isUpperCase() || !it.isLetter() } && msg.last()
                    == '?' -> "Calm down, I know what I'm doing!"

            msg.any { it.isLetter() } &&
                    msg.all { it.isUpperCase() || !it.isLetter() } -> "Whoa, chill out!"

            msg.last() == '?' -> "Sure."
            else -> "Whatever."
        }
    }
}

