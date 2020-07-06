package observer

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("GraphObserver: " + "*".repeat(generator.getNumber()))
        runBlocking {
            delay(100L)
        }
    }
}
