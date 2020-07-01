package observer

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class DigitObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("DigitObserver: " + generator.getPresentNumber())
        runBlocking {
            delay(100L)
        }
    }
}