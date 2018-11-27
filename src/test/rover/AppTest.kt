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
        //run main method
        appInstance.main(emptyArray())
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
    fun squad_userInput(){
        val appInstance = rover.Input()
        val squad = appInstance.squad
        for (rover in squad){
            //rover starting position
            assertTrue(rover.x >= 0)
            assertTrue(rover.y >= 0)
            assertTrue(rover.facing in "NESW")

            //rover on plateau
            assertTrue(rover.x <= appInstance.plateau_x)
            assertTrue(rover.y <= appInstance.plateau_y)
        }
    }

    @Test
    fun path_userInput(){
        val appInstance = rover.Input()
        val paths = appInstance.paths
        for (path in paths){
            assertTrue(path.filter {it in "MRL"} == path)
            assertTrue(path.all {it in "MRL"})
        }
    }

    @Test
    fun createRoverInstance(){
        val rover = rover.Rover(1, 1, "N", 5, 5)
    }

    @Test
    fun moveRover(){
        val rover = rover.Rover(1, 1, "N", 5, 5)
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
        val rover = rover.Rover(1, 1, "N", 5, 5)

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