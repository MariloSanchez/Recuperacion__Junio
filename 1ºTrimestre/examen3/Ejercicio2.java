/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class Ejercicio2 {
    public static void main (String [] args) {
        
        int num [] = new int [10];
        
        //Genero el array
        System.out.println ("Array original:");  
        System.out.println ("***************");
        
        for(int i = 0; i < num.length; i++){    
            num[i]=(int)(Math.random()* 501); 
            System.out.print(num [i] + " | ");
        }
        System.out.println();
        System.out.print("¿Quieres destacar el máximo o el mínimo?: ");
        Scanner s = new Scanner (System.in);
        String respuesta = s.next();
        
        int maximo = 0;
        int minimo = 1000;
        
        //BUSCO EL MAXIMO Y EL MINIMO
        for(int i = 0; i < num.length; i++){ 
            if(respuesta.equals("maximo")){
                if (num[i] > maximo) {
                    maximo = num[i];
                }   
 
            }
            if(respuesta.equals("minimo")){
                if(num[i] < minimo){
                    minimo = num[i];
                }
            }
        }
        
        //PINTO EL MAXIMO Y EL MINIMO
        if(respuesta.equals("maximo")){
            for(int i = 0; i < num.length; i++){ 
                if ( num[i] == maximo){
                    System.out.print("**" + maximo + "** | ");

                }else{
                    System.out.print( num[i] + " | " );
                }
            }
        }
        if(respuesta.equals("minimo")){
            for(int i = 0; i < num.length; i++){ 
                if ( num[i] == minimo){
                    System.out.print("**" + minimo + "** | ");
                }else{
                    System.out.print(num[i] + " | ");
                }
            }
        }
    }
    
}
