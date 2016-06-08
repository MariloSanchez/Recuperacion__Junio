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
public class Ejercicio3 {
    public static void main (String [] args) {
        
        //Creo el array de colores
        String [] colores = new String [9];
        colores [0] = "verde";
        colores [1] = "rojo";
        colores [2] = "azul";
        colores [3] = "amarillo";
        colores [4] = "naranja";
        colores [5] = "rosa";
        colores [6] = "negro";
        colores [7] = "blanco";
        colores [8] = "morado";

        //Pido 8 palabras por teclado
        System.out.println("Introduzca 8 palabras: ");
        String [] palabras = new String [8];
        for (int i = 0; i < palabras.length; i++){
            Scanner s = new Scanner (System.in);
            palabras [i] = s.next();
        }
        
        
        //array resultado auxiliar 
        String [] resultado = new String [8];
        int k = 0;
        
        //ponemos los colores delante
        for (int j = 0; j < palabras.length; j++){ //recorre el array palabras
            for (int r = 0; r < colores.length; r++){ // y este el de los colores
                if (palabras[j].equals(colores[r])) { //Comprueba si hemos encontrado un color
                    resultado[k] = colores [r];//guardamos
                    k++;
                }
            }
        }
        
        //ponemos las demás palabras al final
        boolean esColor = false;
        for(int i = 0; i < palabras.length; i++){//recorro array palabras
            esColor = false;
            for ( int r = 0; r < colores.length; r++){//recorro array colores
                if((palabras[i].equals(colores[r]))){
                    esColor = true;
                }
            }
            if (!esColor) {
                resultado [k] = palabras [i];
                k++;
            }
        }
        //Mostramos resutaldo 
        for (String elemento : resultado) {
            System.out.print( elemento + " ");
        }
    }
}
