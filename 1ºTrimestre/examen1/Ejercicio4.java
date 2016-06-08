/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.println("Introduce un número: ");
        Scanner s = new Scanner (System.in);
        int numIntro = s.nextInt();
        
        int numInvertido = 0;
        int digito = 0;
        int sumaPares = 0;
        
        //Invertir un número
        while(numIntro > 0){
            digito = numIntro%10;
            numInvertido = (numInvertido * 10) + digito;
            numIntro /= 10;      
        }
        System.out.print("Número invertido: " + numInvertido+"\n");
        
        //Digitos Pares
        System.out.print("Los pares son: ");       
        while (numInvertido > 0) { 
            if ((numInvertido % 10) % 2 == 0){       
                System.out.print(numInvertido%10 + " ");//muestra digito a digito los pares
                sumaPares += (numInvertido%10);//hace la suma
            }
            numInvertido = numInvertido/10;//para que quite la ultima cifra al numero invertido y no se repita
        }
        System.out.println();
        System.out.println("La suma de los pares es: " + sumaPares);
    }
}

