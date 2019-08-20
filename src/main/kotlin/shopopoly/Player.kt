package shopopoly

class Player(val name: String, var boardLocation: Int = 1) {

    var passedGo = false

    fun move(diceScore: Dice = Dice()): Int {
        passedGo = false
        boardLocation += (diceScore.firstDie + diceScore.secondDie)

        if (boardLocation > 13) {
            boardLocation -= 13
            passedGo = true
        }

        return boardLocation
    }
}