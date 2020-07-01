package observer

fun main() {
    val generator: NumberGenerator = RandomNumberGenerator()
    val observer1 = DigitObserver()
    val observer2 = GraphObserver()
    generator.addObserver(observer1)
    generator.addObserver(observer2)
    generator.execute()
}