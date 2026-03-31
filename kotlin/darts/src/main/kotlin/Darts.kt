object Darts {

    fun score(x: Number, y: Number): Int {
        val dx = x.toDouble()
        val dy = y.toDouble()
        val distance = kotlin.math.sqrt(dx * dx + dy * dy)
        return when {
            distance <= 1.0 -> 10
            distance <= 5.0 -> 5
            distance <= 10.0 -> 1
            else -> 0
        }
    }
}
