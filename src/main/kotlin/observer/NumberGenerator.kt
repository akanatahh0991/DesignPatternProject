package observer

abstract class NumberGenerator {
    val observers = ArrayList<Observer>()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        for(observer in observers) {
            observer.update(this)
        }
    }
    abstract fun getPresentNumber(): Int
    abstract fun execute()
}