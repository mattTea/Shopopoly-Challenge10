package shopopoly

class Player(val name: String, var boardLocation: Int = 1) {

    fun move(diceScore: Dice = Dice()): Int {
        boardLocation += (diceScore.firstDie + diceScore.secondDie)

        if (boardLocation > 13) boardLocation -= 13
        return boardLocation
    }
}