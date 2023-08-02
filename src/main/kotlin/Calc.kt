class Calc {
    fun square(num: Int) = num * num

    // просто объект, который создается без создания экземпляра класса Calc и принадлежит классу Calc
    companion object {
        const val PI = 3.14 // объявляем мы ее как константу, чтобы у нее не было геттера (аналог java: public static final float PI)
        fun square(n: Int) = n * n
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}