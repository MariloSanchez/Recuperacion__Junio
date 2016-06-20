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
public class FuncionDevuelveNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Convierte Array En Número");
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("Array: ");
        int[] n = new int[10];
        generaArray(n);      
        System.out.println("\n----------------------------------------------");
        System.out.print("Array convertido en número: ");
        long numero = convierteArrayEnNumero(n);
        System.out.println(numero);;
        
    }
     public static void generaArray(int[] n){
         
        //generamos números dentro del array
        int i;
        for(i = 0; i < n.length; i++){ 
            n[i] = (int)(Math.random() * 10);
            System.out.print(n[i] + "|");
        }
    }
    
    public static long convierteArrayEnNumero(int[] n){
        
        long multiplicador = 1;
        long numero = 0;
        int j;
        
        for(j = n.length - 1; j >= 0; j--){
            //multiplicador = n[j];
            numero += n[j] * multiplicador;
            multiplicador = multiplicador * 10;
        }  
        
        return numero;
    }
}
