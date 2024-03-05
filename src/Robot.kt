/**
 * Clase Robot
 *
 * @property nombre String El nombre del robot
 * @property posX Int Da la posición en el eje X.
 * @property posY Int Da la posición en el eje Y.
 * @property direccion String Indica en la dirección hacia la que está direccionado el robot.
 */
class Robot(nombre: String, posX: Int, posY: Int, direccion: String) {

    // GETTER - SETTERS
    private var nombre: String = nombre
        set(value) {
            require(nombre.isNotBlank()) { "Éste campo no puede estar vacío." }
            field = value
        }
    private var posX: Int = 0

    private var posY: Int = 0

    private var direccion: String = ""
        set(value) {
            require(direccion in DireccionesPosibles.entries.map { it.name }) { "La dirección $value no es válida." }
            field = value
        }

    //METODOS DE CLASE:
    /**
     * Mover
     *
     * Este método se encarga de mover el robot en la dirección establecida.
     * No retorna ningún valor, ya que los cambios quedan almacenados en las propiedades del objeto.
     *
     * @param movimientos Un array de elementos enteros que representa los movimientos en las direcciones X e Y.
     *
     */
    fun mover(movimiento: IntArray) {
        posX += movimiento[0]
        posY += movimiento[1]
    }

    /**
     * Obtener dirección
     *
     * Este método devuelve la dirección actual hacia la que está orientado el robot.
     * @return La dirección actual del robot.
     */
    fun obtenerDireccion(): String {
        return direccion
    }

    /**
     * Obtener posición
     *
     * Este método devuelve la posición del robot.
     * @return La posición actual del robot en formato (posX, posY).
     */
    fun obtenerPosicion(): String {
        return "($posX, $posY)"
    }

    override fun toString(): String {
        return "R2D2: está en la posición (${obtenerPosicion()}) ${obtenerDireccion()}."
    }


}