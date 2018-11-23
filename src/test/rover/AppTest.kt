package rover

import org.junit.jupiter.api.Test

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat

internal class AppTest {

    @Test
    fun runTests() {
        assertThat(1).isEqualTo(1)
    }

    @Test
    fun createInstanceFromAppClass() {
        val appInstance = rover.App()
    }

    @Test
    fun inputLTest() {
        val appInstance = rover.App()
        assertThat(appInstance.inputL()).isEqualTo("L")
    }

    @Test
    fun userInput() {
        val appInstance = rover.App()
        appInstance.readInput()
    }

    @Test
    fun createRoverInstance(){
        val rover = rover.Rover(1, 1, "N")
    }

    @Test
    fun moveRover(){
        val rover = rover.Rover(1, 1, "N")
        rover.move("M")
        assertThat(rover.x).isEqualTo(1)
        assertThat(rover.y).isEqualTo(2)
        assertThat(rover.facing).isEqualTo("N")

        rover.move("L")
        assertThat(rover.x).isEqualTo(1)
        assertThat(rover.y).isEqualTo(2)
        assertThat(rover.facing).isEqualTo("W")

        rover.move("M")
        assertThat(rover.x).isEqualTo(0)
        assertThat(rover.y).isEqualTo(2)
        assertThat(rover.facing).isEqualTo("W")

        rover.move("R")
        assertThat(rover.x).isEqualTo(0)
        assertThat(rover.y).isEqualTo(2)
        assertThat(rover.facing).isEqualTo("N")
    }

}