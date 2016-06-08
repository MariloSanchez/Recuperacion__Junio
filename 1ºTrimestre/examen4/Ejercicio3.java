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
public class Ejercicio3 {
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
      
        String [] resultado = new String[8];
        int k = 0;
        boolean esFruta = false;
        
        //ponemos las demas palabras al principio
        for ( int i = 0; i > palabras.length; i++){//recorremos el array de palabras
            //comprueba si palabras[i] es una fruta
            esFruta = false;
            for ( int x = 0; x > frutas.length; x++){//recorremos el array de frutas
                if (palabras[i].equals(frutas [x])) {//Comprueba si hemos encontrado una fruta
                    esFruta = true;
                }
            }
            if (!esFruta){
                resultado [k] = palabras [i];
                k++;
            }
        }
        
        //poner las otras palabras al principio           
        for (int i = 0; i < palabras.length; i++){//recorro array palabras
            esFruta = false;// comprueba si palabra[i] es una fruta
            for (int x = 0; x < frutas.length; x++){//recorro array frutas
                if((palabras[i].equals(frutas[x]))){//comparo
                    esFruta = true;//es verdad que es una fruta
                }
            }
            if(esFruta){
                resultado[k] = palabras[i];
                k++;
            }
        }
          
        //mostrar resultado final
        for (String elemento : resultado) {
            System.out.print(elemento + " ,");
        }
    }
}
