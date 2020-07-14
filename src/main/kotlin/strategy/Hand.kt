package strategy

enum class Hand(val handValue: Int){
    GUU(0),
    CHO(1),
    PAA(2);

    companion object {
        fun getHand(handValue: Int): Hand = values().first { handValue == it.handValue }
    }

    override fun toString(): String = when(this) {
        GUU -> "グー"
        CHO -> "チョキ"
        PAA -> "パー"
    }

    fun isStrongerThan(hand: Hand): Boolean = (fight(hand) == 1)

    fun isWeakerThan(hand: Hand): Boolean = (fight(hand) == -1)

    private fun fight(hand: Hand) = when {
        // 引き分け
        this == hand -> 0
        // 勝ち
        (this.handValue + 1) % 3 == hand.handValue -> 1
        // 負け
        else -> -1
    }
}
