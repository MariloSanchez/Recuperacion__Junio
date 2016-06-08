/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class Ejercicio4 {
    public static void main (String [] args) {
        
        System.out.print (" Introduce un número entero: ");
        Scanner s = new Scanner (System.in);
        long num1 = s.nextInt();
        System.out.print ("Introduce otro número entero: ");
        long num2 = s.nextInt(); 
        
         //Le damos la vuelta a los numeros
        long volteado1 = 0;
        long volteado2 = 0;

        while (num1 > 0) {
            volteado1 = (volteado1 * 10) + (num1 % 10);
            num1 /= 10;
        }
        while (num2 > 0) {
            volteado2 = (volteado2 * 10) + (num2 % 10);
            num2 /= 10;
        }
        long volteado3 = volteado1;
        long volteado4 = volteado2;
        
        //para ver los pares digito a digito del num intro 
        System.out.print("El número formado por los pares es: ");
        while ((volteado1 > 0) && (volteado2 > 0)){
            if ( (volteado1%10)%2==0 ) {//para el primer número
                System.out.print(volteado1%10);
            }
            volteado1 = volteado1/10;
            
            if ( (volteado2%10)%2==0 ) {//para el segundo número
                System.out.print(volteado2%10);
            }
            volteado2 = volteado2/10;           
        }
        System.out.println();
        
        
        //para ver los impares  
        System.out.print ("El número formado por los impares es: ");
         
        while ((volteado3 > 0) && (volteado4 > 0)){
            if ((volteado3%10)%2!= 0) {
                System.out.print(volteado3%10);
            }
            volteado3 = volteado3/10;
        
            if ( (volteado4%10)%2!=0 ) {
                System.out.print(volteado4%10);
            }
            volteado4 = volteado4/10;
        
        }
    }
    
}
