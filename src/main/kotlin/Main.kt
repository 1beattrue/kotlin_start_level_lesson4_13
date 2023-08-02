fun main() {
    // companion object (статические поля и методы)

    val calc = Calc()
    println(calc.square(4)) // не совсем удобно для расчета создавать отдельный объект
    // в java мы использовали static, тут этого сделать нельзя

    // создаем companion object с методом square и радуемся
    println(Calc.square(4)) // теперь не нужно создавать объект для вызова метода
    println(Calc.lengthOfCircle(5f))

    println()

    // домашнее задание
    println(MyRandom.randomInt(1, 20))
    println(MyRandom.randomBoolean())
    println(MyRandom.randomDayOfWeek())
}