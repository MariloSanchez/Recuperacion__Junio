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
public class FuncionDesenrollaDeArribaABajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner t = new Scanner (System.in);
        System.out.println("DESERRONLLAR ARRAY BIDIMENSIONAL");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Array Generado:");
        int[][] arrayBidi = generaArrayBidi(10, 10, 10, 99);
        muestraArrayBidi(arrayBidi);
        
        System.out.println("\n-----------------------------------------------------");
        muestraArrayUni(desenrrolla(arrayBidi));
    }
    
    //////FUNCIONES//////
    public static int[][] generaArrayBidi(int fila, int columna, int min, int max){          
        int i = fila;
        int j = columna;
        int[][] a = new int[fila][columna];
        
        for(i = 0; i < fila; i++){ 
            for(j = 0; j < columna; j++){
                a[i][j] = (int)(Math.random() * 89) + 11;
            }
        }
        
        return a;
    }
    
    public static void muestraArrayBidi(int a[][]){
        int k;
        int l;
        
        for(k = 0; k < a.length; k ++){ 
            System.out.println(" ");
            for(l = 0; l < a.length; l++){
                System.out.print(a[k][l] + " ");
            }
        }
    }
    
    public static int[] desenrrolla(int[][] a){
        int filas = a.length;
        int columnas = a.length;
        int capacidad = filas * columnas;
        int[] arrayUni = new int[capacidad];
        
        int posicion = 0;     
        int vuelta = 0;
        int i;
        
        while(posicion < capacidad){  
            for(i = 0 + vuelta; i < filas - vuelta; i++){
                arrayUni[posicion] = a[i][0 + vuelta];
                posicion++;
            }
            
            for(i = 1 + vuelta; i < columnas - vuelta; i++){
                arrayUni[posicion] = a[filas - 1 - vuelta][i];
                posicion++;
            }
            
            for(i = filas - 2 - vuelta; i >= 0 + vuelta; i--){
                arrayUni[posicion] = a[i][columnas - 1 - vuelta];
                posicion++;
            }
            
            for(i = columnas - 2 - vuelta; i >= 1 + vuelta; i--){
                arrayUni[posicion] = a[0 + vuelta][i];
                posicion++;
            }

            vuelta++;
        }
        
        return arrayUni;
    }
    
    public static void muestraArrayUni(int a[]){
        for (int b : a) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
    }
    
}
