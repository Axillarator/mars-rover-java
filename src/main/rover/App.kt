package rover

import java.io.File
import javax.print.attribute.IntegerSyntax

class App {
    fun main(args: Array<String>) {
        //read the input from file
        //for each rover
        //  perform movement
        //  print output
    }

    fun inputL(): String {
        println("L")
        return "L"
    }

    fun userInput(): String {
        val input: String?
        input = readLine()
        return input ?: ""
    }


}

class Input{

    //var plateau_x: Integer
    val input_text_list = readInput()
    val plateau_x = getPlateau()[0]
    val plateau_y = getPlateau()[1]


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
}


class Rover(x_start: Int, y_start: Int, heading: String){

    var x = x_start
    var y = y_start
    var facing = heading

    fun move(input: String){
        /**
         * moves the rover by changing the variables according to the input
         */
        if (input.equals("M")) {
            when (facing) {
                "N" -> y += 1
                "S" -> y -= 1
                "E" -> x += 1
                "W" -> x -= 1
            }
        }
        if (input.equals("L")){
            when (facing){
                "N" -> facing = "W"
                "S" -> facing = "E"
                "E" -> facing = "N"
                "W" -> facing = "S"
            }
        }
        if (input.equals("R")){
            when (facing){
                "N" -> facing = "E"
                "S" -> facing = "W"
                "E" -> facing = "S"
                "W" -> facing = "N"
            }

        }
    }

}
