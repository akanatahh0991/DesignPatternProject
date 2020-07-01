package observer

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        print("GraphObserver: ")
        for (i in 0 .. generator.getPresentNumber()) {
            print("*")
        }
        println("")
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {
            // 何もしない
        }
    }
}
