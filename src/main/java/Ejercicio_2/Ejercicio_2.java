package Ejercicio_2;

public class Ejercicio_2 {
    /*El objetivo es crear una mini calculadora que realice sumas, restas, multiplicaciones, divisiones enteras y con resto.

Esta calculadora maneja enteros de tipo int. Con el tipo int, los valores deben estar entre -2.147.483.648 y 2.147.483.647. Si una variable de tipo int se inicializa a 2.000.000.000 y la variable se multiplica por dos, la variable contendrá: 294.967.296. Ha habido un "desbordamiento". Desafortunadamente, esto no causa un error ni una excepción.

Otro problema con las operaciones con enteros, es que la división por cero no está definida matemáticamente. Cuando se realiza una operación de este tipo, se genera una excepción de tipo ArithmeticException.

La calculadora debe tener esto en cuenta para evitar mostrar un resultado falso.

a. Creación de una clase DesbordaCapacidadExcepcion
b. Creación de la clase de utilidad Operacion
Esta clase contiene tres métodos para sumar, restar y multiplicar (no es necesario crear un método dividir, ya que la división de números enteros no se puede desbordar). Todos toman enteros como argumentos y devuelven un entero.

Los tres generan excepciones del tipo DesbordaCapacidadException, en caso de que el cálculo provoque un desbordamiento de la capacidad de un entero de tipo int.

Una manera fácil de probar si un cálculo con tipos int excede su capacidad, es realizar el cálculo con tipos long y verificar si los resultados son diferentes.*/

}
public class Operacion{
    public static int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a + (long) b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado de la suma excede la capacidad de un entero");
        }
        return (int) resultado;
    }

    public static int restar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a - (long) b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado de la resta excede la capacidad de un entero");
        }
        return (int) resultado;
    }

    public static int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a * (long) b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado de la multiplicación excede la capacidad de un entero");
        }
        return (int) resultado;
    }
}

