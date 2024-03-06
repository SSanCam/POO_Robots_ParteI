/**
 * Programa principal.
 */
fun main() {
    try {
        // Creamos una instancia de Robot.
        val robot1 = Robot("R2D2", 0, 0, "POSITIVEY")

        // Creamos una serie de movimientos.
        val movimientos = arrayOf(
            intArrayOf(1, -5, 0, -9),
            intArrayOf(3, 3, 5, 6, 1, 0, 0, -7),
            intArrayOf(2, 1, 0, -1, 1, 1, -4),
            intArrayOf(),
            intArrayOf(3,5)
        )

        // Hacemos que el Robot realice los movimientos y se muestren por la terminal.
        for (movimiento in movimientos) {
            robot1.mover(movimiento)
            println(robot1)
        }
    }catch (e: IllegalArgumentException){
        println(e.message)
    }

}