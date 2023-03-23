package Ejercicio_2;

public class Operacion {
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

    public static int dividir(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long) a / (long) b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado de la división excede la capacidad de un entero");
        }
        return (int) resultado;
    }

    public static int raizCuadrada(int a) throws DesbordaCapacidadExcepcion {
        long resultado = (long) Math.sqrt(a);
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion("El resultado de la raiz cuadrada excede la capacidad de un entero");
        }
        return (int) resultado;
    }


}
