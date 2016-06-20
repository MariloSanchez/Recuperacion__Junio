/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen4;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class FuncionVersionTacana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        long num = s.nextLong();
        long numeroTacano = versionTacania(num);
        System.out.println("La version tacaña del numero es: " + numeroTacano);
    }
    
     public static long versionTacania(long num){             
        long numInvertido = 0;
        long digito = 0; 

        //invertir número
        while (num > 0){
          digito = (int) (num % 10);
          numInvertido = (numInvertido * 10) + digito;
          num /= 10;
        }
        
        //hacemos los digitos aleatorios
        int aleatorio = 0;
        long nuevoNum = 0;

        while (numInvertido > 0){
            digito = (int) (numInvertido % 10);
            aleatorio = (int)(Math.random() * 2);

            if(aleatorio == 1){
              nuevoNum = (nuevoNum * 10) + digito;
            }

            numInvertido /= 10;
        }

        return(nuevoNum);
     }
    
}
