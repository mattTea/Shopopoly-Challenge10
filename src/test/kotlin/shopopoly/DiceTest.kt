package shopopoly

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object DiceTest : Spek({

    describe("dice") {

        val dice = Dice(2, 4)

        it("should return 2 integers") {
            assertThat(dice.firstDie).isEqualTo(2)
            assertThat(dice.secondDie).isEqualTo(4)
        }
    }
})