import kotlin.random.Random

class MyRandom {
    companion object {
        enum class DaysOfWeek {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        fun randomInt(start: Int, end: Int): Int = start + (Math.random() * (end - start + 1)).toInt()

        fun randomBoolean(): Boolean = randomInt(0, 1) > 0

        fun randomDayOfWeek(): DaysOfWeek {
            return when (randomInt(0, 6)) {
                0 -> DaysOfWeek.SUNDAY
                1 -> DaysOfWeek.MONDAY
                2 -> DaysOfWeek.TUESDAY
                3 -> DaysOfWeek.WEDNESDAY
                4 -> DaysOfWeek.THURSDAY
                5 -> DaysOfWeek.FRIDAY
                else -> DaysOfWeek.SATURDAY
            }
        }
    }
}