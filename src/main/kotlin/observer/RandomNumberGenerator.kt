package observer

class RandomNumberGenerator: NumberGenerator() {
    private var number: Int = 0
    override fun getPresentNumber(): Int = number

    override fun execute() {
        for (i in 1 .. 20) {
            number = (1..50).random()
            notifyObservers()
        }
    }
}