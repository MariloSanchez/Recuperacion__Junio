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
public class ArrayFrutasAlFinal {
    public static void main (String [] args) {
        
        //array frutas
        String [] frutas = { "manzana", "mandarina","mango", "chirimoya", "nectarina" };
        
        //pedir 8 palabras por teclado    
        String[] palabras = new String[8];

        for(int i = 0; i < palabras.length; i++){
            System.out.print("Introduce palabra: ");
            Scanner s = new Scanner (System.in);
            palabras[i] = s.nextLine();
        }
        
        String[] resultado = new String[8];
        int k = 0;
        boolean esFruta = false;
          
        //poner las demas palabras al principio
        for(int i = 0; i < palabras.length; i++){
            // comprueba si palabra[i] es una fruta
            esFruta = false;
            for(int x = 0; x < frutas.length; x++){
                if((palabras[i].equals(frutas[x]))){
                    esFruta = true;
                }
            }
            
            if(!esFruta){
                resultado[k] = palabras[i];
                k++;
            }
        }
          
        //poner las otras palabras al principio
        for(int i = 0; i < palabras.length; i++){
            // comprueba si palabra[i] es una fruta
            esFruta = false;
            for(int x = 0; x < frutas.length; x++){
                if((palabras[i].equals(frutas[x]))){
                    esFruta = true;
                }
            }

            if(esFruta){
                resultado[k] = palabras[i];
                k++;
            }
        }
          
        //mostrar resultado final
        System.out.println("Array resultante");
        System.out.println("------------------");
        for (String elemento : resultado) {
            System.out.print(elemento + " ");
        }
        
    }
}
