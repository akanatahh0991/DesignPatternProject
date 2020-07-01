package observer

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        print("GraphObserver: ")
        for (i in 0 .. generator.getPresentNumber()) {
            print("*")
        }
        println("")

        runBlocking {
            delay(100L)
        }
    }
}
