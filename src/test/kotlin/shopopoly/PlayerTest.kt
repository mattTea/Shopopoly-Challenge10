package shopopoly

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isFalse
import assertk.assertions.isTrue
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
        val diceMock2 = mockk<Dice>()

        every { diceMock.firstDie } returns(4)
        every { diceMock.secondDie } returns(3)

        every { diceMock2.firstDie } returns(2)
        every { diceMock2.secondDie } returns(2)

        it("should add dice roll score to boardLocation") {
            val player = Player("Matt", 5)

            assertThat(player.move(diceMock)).isEqualTo(12)
        }

        it("should restart boardLocation to 1 after moving past 13") {
            val player = Player("Matt", 12)

            player.move(diceMock)
            assertThat(player.boardLocation).isEqualTo(6)
        }

        it("should set passedGo to true if location 13 is passed") {
            val player = Player("Matt", 12)
            player.move(diceMock)
            assertThat(player.passedGo).isTrue()
        }

        it("should not set passedGo to true if location 13 is not passed") {
            val player = Player("Matt", 2)

            player.move(diceMock2)
            assertThat(player.passedGo).isFalse()
        }

        it("should reset passedGo to false for next move") {
            val player = Player("Matt", 12)

            player.move(diceMock)
            assertThat(player.passedGo).isTrue()

            player.move(diceMock2)
            assertThat(player.passedGo).isFalse()
        }
    }
})