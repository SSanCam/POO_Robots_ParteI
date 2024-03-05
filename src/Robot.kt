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

    private var direccion: String = direccion

    //METODOS DE CLASE:
    /**
     * Mover:
     *
     */
    fun mover() {
        // TODO El método mover() debe recibir un array de elementos enteros y no retornará nada, ya que los cambios quedarán
        // TODO almacenados en las propiedades del mismo.
    }

    /**
     * Obtener posicion
     *
     */
    fun obtenerPosicion() {
        // TODO no recibe parámetros y retorna una cadena de caracteres con la dirección PositiveX,
        // TODO NegativeX, PositiveY o NegativeY. (Posible mejora con enum class Enum classes)
    }

    /**
     * Obtener direccion
     *
     */
    fun obtenerDireccion() {
        // TODO debe devolver la posición. Ejemplo: (10, -5).
    }

    override fun toString(): String {
        return "R2D2: está en la posición ($posX,$posY) $direccion."
    }


}