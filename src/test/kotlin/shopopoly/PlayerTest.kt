package shopopoly

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object PlayerTest : Spek({

    describe("player") {

        it("should have a name") {
            assertThat(Player("Matt", 6).name).isEqualTo("Matt")
        }

        it("should have a board location") {
            assertThat(Player("Matt", 6).boardLocation).isEqualTo(6)
        }
    }
})