package rover

class App {
    fun main(args: Array<String>) {
        //read the input from file
        val input = Input()
        val squad = input.squad
        val paths = input.paths

        println("Output and new coordinates")
        //for each rover
        for (i in 0..squad.lastIndex){
            //  perform movement
            squad[i].move(paths[i])

            //  print output
            print(squad[i].x)
            print(" ")
            print(squad[i].y)
            print(" ")
            println(squad[i].facing)
        }
    }
}



