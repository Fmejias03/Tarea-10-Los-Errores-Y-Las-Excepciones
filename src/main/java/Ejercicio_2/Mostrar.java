package Ejercicio_2;

import java.util.Scanner;

public class Mostrar {
    public void mostrar(){
        Scanner sc = new Scanner(System.in);
        Operacion operacion = new Operacion();
        while (true) {
            System.out.println("Bienvenido al programa de operaciones, si desea salir introduzca dos numero aleatorios y la operación 'Salir'");
            System.out.println("Ingrese el primer número");
            int a = sc.nextInt();
            System.out.println("Ingrese el segundo número");
            int b = sc.nextInt();
            System.out.println("Ingrese la operación a realizar, si quiere salir itroduzca 'Salir'");
            String operador = sc.next();
            try {
                switch (operador) {
                    case "+", "Suma", "sumar", "Sumar", "suma":
                        System.out.println(operacion.sumar(a, b));
                        break;
                    case "-", "Resta", "restar", "Restar", "resta":
                        System.out.println(operacion.restar(a, b));
                        break;
                    case "*", "Multiplicación", "multiplicar", "Multiplicar", "multiplicación":
                        System.out.println(operacion.multiplicar(a, b));
                        break;
                    case "/", "División", "dividir", "Dividir", "división":
                        System.out.println(operacion.dividir(a, b));
                        break;
                    case "Raiz", "raiz", "Raíz", "raíz", "Raiz cuadrada", "raiz cuadrada", "Raíz cuadrada", "raíz cuadrada":
                        System.out.println(operacion.raizCuadrada(a));
                        break;
                    case "Salir", "salir":
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Operador no válido");
                }
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage());
            }
        }

    }


}

