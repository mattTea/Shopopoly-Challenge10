package shopopoly

import assertk.assertThat
import assertk.assertions.isEqualTo
import io.mockk.every
import io.mockk.mockk
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

    describe("move") {

        val diceMock = mockk<Dice>()

        every { diceMock.firstDie } returns(4)
        every { diceMock.secondDie } returns(3)

        it("should add dice roll score to boardLocation") {
            val player = Player("Matt", 5)

            assertThat(player.move(diceMock)).isEqualTo(12)
        }

        it("should restart boardLocation to 1 after moving past 13") {
            val player = Player("Matt", 12)

            player.move(diceMock)
            assertThat(player.boardLocation).isEqualTo(6)
        }
    }
})