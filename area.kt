import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Elige la figura para calcular el área: ")
        println("1.- Cuadrado")
        println("2.- Círculo")
        println("3.- Triángulo")
        println("4.- Salir")
        print("Opción: ")
        val opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                // Calcular área del cuadrado
                print("Introduce el lado 1 del cuadrado: ")
                val lado1 = scanner.nextDouble()
                print("Introduce el lado 2 del cuadrado: ")
                val lado2 = scanner.nextDouble()
                val area = areaCuadrado(lado1, lado2)
                println("El área del cuadrado es: $area")
            }
            2 -> {
                // Calcular área del círculo
                print("Introduce el radio del círculo: ")
                val radio = scanner.nextDouble()
                val area = areaCirculo(radio)
                println("El área del círculo es: $area")
            }
            3 -> {
                // Calcular área del triángulo
                print("Introduce la base del triángulo: ")
                val base = scanner.nextDouble()
                print("Introduce la altura del triángulo: ")
                val altura = scanner.nextDouble()
                val area = areaTriangulo(base, altura)
                println("El área del triángulo es: $area")
            }
            4 -> {
                // Salir del programa
                println("Saliendo del programa...")
                break
            }
            else -> {
                println("Opción inválida, por favor selecciona una opción entre 1 y 4.")
            }
        }
        println() // Espacio para mejorar la legibilidad
    }
}

// Función para calcular el área del cuadrado
fun areaCuadrado(a: Double, b: Double): Double {
    return a * b
}

// Función para calcular el área del círculo
fun areaCirculo(radio: Double): Double {
    return 3.14 * (radio * radio)
}

// Función para calcular el área del triángulo
fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}