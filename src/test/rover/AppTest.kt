package rover

import org.junit.jupiter.api.Test

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Assertions.assertTrue

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
    fun userInput() {
        val appInstance = rover.Input()
        appInstance.readInput()
    }

    @Test
    fun plateau_userInput(){
        val appInstance = rover.Input()
        //val input: List<String>
        val input = appInstance.readInput()
        //val plateau: String
        val plateau = input[0]
        val coordinates = plateau.split(" ")
        val x = coordinates[0].toInt()
        val y = coordinates[1].toInt()
        assertTrue(x >= 0)
        assertTrue(y >= 0)

        assertThat(x).isEqualTo(appInstance.plateau_x)
        assertThat(y).isEqualTo(appInstance.plateau_y)


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

        rover.move("M")
        assertThat(rover.x).isEqualTo(1)
        assertThat(rover.y).isEqualTo(3)
        assertThat(rover.facing).isEqualTo("N")


    }

    @Test
    fun turnRover(){
        val rover = rover.Rover(1, 1, "N")

        rover.move("L")
        assertThat(rover.x).isEqualTo(1)
        assertThat(rover.y).isEqualTo(1)
        assertThat(rover.facing).isEqualTo("W")

        rover.move("R")
        assertThat(rover.x).isEqualTo(1)
        assertThat(rover.y).isEqualTo(1)
        assertThat(rover.facing).isEqualTo("N")
    }

}