package shopopoly

class Player(val name: String, var boardLocation: Int = 0) {

    fun move(diceScore: Dice = Dice()): Int {
        boardLocation += (diceScore.firstDie + diceScore.secondDie)
        return boardLocation
    }
}