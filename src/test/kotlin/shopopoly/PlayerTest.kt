package shopopoly

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object PlayerTest : Spek({

    describe("player") {

        val player = Player(
            name = "Matt",
            boardLocation = 6
        )

        it("should have a name") {
            assertThat(player.name).isEqualTo("Matt")
        }

        it("should have a board location") {
            assertThat(player.boardLocation).isEqualTo(6)
        }
    }
})