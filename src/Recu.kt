
import java.util.Random
import java.util.Scanner

/*
Crea un programa en kotlin que
a) Pida al usuario que introduzca un número al que llamaremos X. (1 punto)
b) Si el número es par, de mostrar un cuadrado de X elementos y mostrar los por pantalla del siguiente modo:
Suponiendo X = 2 (3 puntos)

c) Si el número es impar debe crearse una lista de X * 5 elementos compuesta de números aleatorios. (1 punto)

Posteriormente debes:
1- Mostrar todos los elementos de la lista. (1 punto)
2- Mostrar los elementos pares de la lista. (2 puntos)
3- Mostrar los elementos ordenados. (2 puntos)
 */


fun main(args: Array<String>){
    var X:Int
    var elementos:Int
    val desde = 0
    val hasta = 100
    var random = Random()

    print("Escribe un numero: ")
    X = readLine()?.toInt() as Int
    println("El numero es: $X")
    elementos = X*5

    if (X%2 == 0){
        print("No se como hacer esto")
    } else {
        if (X%2!=0){
            var lista  = IntArray(elementos) { random.nextInt(hasta - desde) + desde }.asList()
            println("Los elementos de la lista son: $lista")
            println("Elementos en Orden: ${lista.sorted()}")
            println("Los numeros pares de la lista son: ")
            for (i in lista) {
                if (i % 2 == 0) {
                     print("$i, ")
                }
            }

        }

    }

}


