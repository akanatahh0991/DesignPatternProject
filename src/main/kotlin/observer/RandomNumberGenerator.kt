package observer

class RandomNumberGenerator: NumberGenerator() {
    private var number: Int = 0
    override fun getNumber(): Int = number

    override fun execute() {
        for (i in 1 .. 20) {
            number = (0 until 50).random()
            notifyObservers()
        }
    }
}