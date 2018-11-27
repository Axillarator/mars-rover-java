package rover

class Rover(x_start: Int, y_start: Int, heading: String, plateau_x: Int, plateau_y: Int){

    val plat_x = plateau_x
    val plat_y = plateau_y
    var x = x_start
    var y = y_start
    var facing = heading

    fun move(input: String){
        /**
         * moves the rover by changing the variables according to the input
         */
        for (move in input){
            if (move.equals('M')) {
                when (facing) {
                    "N" -> y += 1
                    "S" -> y -= 1
                    "E" -> x += 1
                    "W" -> x -= 1
                }
            }
            if (move.equals('L')){
                when (facing){
                    "N" -> facing = "W"
                    "S" -> facing = "E"
                    "E" -> facing = "N"
                    "W" -> facing = "S"
                }
            }
            if (move.equals('R')){
                when (facing){
                    "N" -> facing = "E"
                    "S" -> facing = "W"
                    "E" -> facing = "S"
                    "W" -> facing = "N"
                }

            }
            when (x){
                -1 -> return
                plat_x + 1 -> return
            }
            when (y){
                -1 -> return
                plat_y + 1 -> return
            }
        }

    }

}
