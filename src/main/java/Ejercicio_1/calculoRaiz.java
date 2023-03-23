package Ejercicio_1;

import java.util.Scanner;

public class calculoRaiz {
    int numero;
    public calculoRaiz(int numero){
        this.numero = numero;
    }
    public void raizCuadrada(){
        if(numero < 0){
            throw new ArithmeticException("La raíz cuadrada no está definida para un número negativo.");
        }else{
            System.out.println("√"+numero+" = "+Math.sqrt(numero));
        }
    }
}


