package shopopoly

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BoardTest : Spek({

    describe("board") {

        it("should be initialized with a location of '1'") {
            val board = Board()
            assertThat(board.location).isEqualTo(1)
        }
    }
})
