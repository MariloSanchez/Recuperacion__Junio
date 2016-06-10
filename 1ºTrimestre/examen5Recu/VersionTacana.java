/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen5Recu;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class VersionTacana {
    public static void main (String [] args) {
        
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        long num = s.nextLong();
        
        //invertir numero
        long numInvertido = 0;
        long digito; 
       
        while (num > 0){
          digito = num % 10;
          numInvertido = (numInvertido * 10) + digito;
          num /= 10;
        }
        
        //hacemos los digitos aleatorios
        long tacano = 0;
        long aleatorio;
        
        while (numInvertido > 0){
            digito = numInvertido % 10;
            aleatorio = (long)(Math.random() * 2);
            if (aleatorio == 1){
                tacano = (tacano *10) + digito;
            }
            numInvertido = numInvertido / 10;
        }
        System.out.println(tacano);
    }
    
}
