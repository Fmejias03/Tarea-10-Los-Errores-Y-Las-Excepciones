package Ejercicio_1;

import java.util.Scanner;

public class mostrarMain {
    public void mostrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero para calcular su raiz: ");
        int numero = sc.nextInt();
        calculoRaiz raiz = new calculoRaiz(numero);
        raiz.raizCuadrada();
    }
}
