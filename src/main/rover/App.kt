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


