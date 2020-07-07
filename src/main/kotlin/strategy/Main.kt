package strategy

fun main() {
    val player1 = Player("Taro", WinningStrategy())
    val player2 = Player("Hana", ProbStrategy())
    for (i in 1 .. 10000) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()

        when {
            nextHand1.isStrongerThan(nextHand2) -> {
                println("Winner $player1")
                player1.win()
                player2.lose()
            }
            nextHand2.isStrongerThan(nextHand1) -> {
                println("Winner $player2")
                player2.win()
                player1.lose()
            }
            else -> {
                println("Even ...")
                player1.even()
                player2.even()
            }
        }
    }

    println("Total result: ")
    println(player1.toString())
    println(player2.toString())
}