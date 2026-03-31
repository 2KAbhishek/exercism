data class Year(val year: Int) {
    val isLeap: Boolean = when {
        year % 100 == 0 && year % 400 != 0 -> false
        year % 4 == 0 -> true
        else -> false
    }
}
