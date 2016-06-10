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
public class ArrayMultiplosCincoYSiete {
    public static void main (String [] args) {
        
        int numero [] = new int [20];
        
        System.out.println("Array original\n***************");
        for (int i = 0; i < 20; i++){
            numero [i]= (int)(Math.random()* 401);
            System.out.print(numero [i] + " | ");
        }
        System.out.println();
        System.out.print("¿Quieres mostrar los múltiplos de 5 o los de 7?: ");
        Scanner s = new Scanner (System.in);
        int respuesta = s.nextInt();
        
        int multiplosCinco;
        int multiplosSiete;
        
        System.out.println("Array resultante\n***************");
        if (respuesta == 5){
            for (int i = 0; i < 20; i++){
                if((numero[i] % 5) == 0){
                    System.out.print("**" + numero[i] + "** | ");
                }else{
                    System.out.print(numero[i] + " | ");
                }
            }
        }
        if (respuesta == 7){
           for (int i = 0; i < 20; i++){
               if((numero[i] % 7 == 0)){
                   System.out.print("**" + numero[i] + "** | ");
               }else{
                   System.out.print(numero[i] + " | ");
               }
           } 
        }
    }
}
