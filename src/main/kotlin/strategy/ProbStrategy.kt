package strategy

class ProbStrategy: Strategy {
    private val history = Array(3){ IntArray(3){ 1 } }
    private var prevHandValue: Int = 0
    private var currentHandValue: Int = 0

    override fun nextHand(): Hand {
        val targetHistory = history[currentHandValue]
        val handValue: Int = when((0 until targetHistory.sum()).random()) {
            in 0 until targetHistory[0] -> 0
            in targetHistory[0] until targetHistory[0] + targetHistory[1] -> 1
            else -> 2
        }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }
    }

}