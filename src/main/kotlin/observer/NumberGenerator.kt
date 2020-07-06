package observer

abstract class NumberGenerator {
    val observers = arrayListOf<Observer>()

    fun addObserver(observer: Observer) = observers.add(observer)

    fun deleteObserver(observer: Observer) = observers.remove(observer)

    protected fun notifyObservers() = observers.forEach{ it.update(this) }
    abstract fun getNumber(): Int
    abstract fun execute()
}