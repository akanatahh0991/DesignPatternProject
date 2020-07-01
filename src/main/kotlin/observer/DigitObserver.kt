package observer

class DigitObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("DigitObserver: " + generator.getPresentNumber())
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
            // 何もしない
        }
    }
}