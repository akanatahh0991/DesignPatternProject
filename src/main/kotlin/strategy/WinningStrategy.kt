package strategy

class WinningStrategy: Strategy{
    private var won: Boolean = false

    private lateinit var prevHand: Hand

    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.getHand((0 until 3).random())
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}