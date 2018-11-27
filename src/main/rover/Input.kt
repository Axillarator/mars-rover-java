package rover

import java.io.File

class Input{

    //var plateau_x: Integer
    val input_text_list = readInput()
    val plateau_x = getPlateau()[0]
    val plateau_y = getPlateau()[1]
    val squad = getListOfRovers()
    val paths = getListOfPaths()


    fun readInput(): List<String>{
        val fileName = "src/main/rover/input.txt"
        val content = File(fileName).readLines()
        //println(content)
        return content
    }

    fun getPlateau(): List<Int>{
        val text_list = input_text_list[0].split(" ")
        val int_list = mutableListOf<Int>()

        for (i in 0..1){
            int_list.add(text_list[i].toInt())
        }
        return int_list
    }

    fun getListOfRovers(): List<Rover>{
        val rover_list = mutableListOf<Rover>()
        for (i in 1..(input_text_list.lastIndex)){
            if (i % 2 == 1){
                //new Rover with starting postition
                val rover_string_input: String = input_text_list[i]
                val rover_list_input: List<String> = rover_string_input.split(" ")
                val x = rover_list_input[0].toInt()
                val y = rover_list_input[1].toInt()
                val h = rover_list_input[2]
                rover_list.add(Rover(x,y,h, plateau_x, plateau_y))
            }
        }
        return rover_list
    }

    fun getListOfPaths(): List<String>{
        val path_list = mutableListOf<String>()
        for (i in 2..(input_text_list.lastIndex)){
            if (i % 2 == 0){
                //new Path
                val path_string_input: String = input_text_list[i]
                path_list.add(path_string_input)
            }
        }
        return path_list
    }
}
