/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3Recu;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class ArrayDiagonalFilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int filas;
        int columnas;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Las filas del array deben ser del mismo tamaño que las columnas");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Introduzca las filas del array: \n");
        filas = s.nextInt();
        System.out.print("Introduzca las columnas del array: \n");
        columnas = s.nextInt();
        
        int array [][] = new int [filas][columnas];
        
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                array [i][j] = (int)((Math.random() * 200) + 100);
                System.out.printf("%5d" , array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        //Genera la diagonal superior izquierda a derecha
        System.out.print("A)La diagonal superior izquierda:");
        for(int i = 0; i < columnas; i++){           
            System.out.print(array[i][i] + " ");                       
        }
        
        System.out.println();
        //Genera la diagonal superior derecha a izquierda
        int k = columnas - 1;
        System.out.print("B)La diagonal superior derecha:");
        for(int i = 0; i < columnas; i++){
            System.out.print(array[i][k] + " ");
            k--;
        }
        
        System.out.println();
        //Genera la primera fila
        System.out.print("C)La primera fila es: ");
        for (int i = 0; i < columnas; i++){
            System.out.print(array[0][i] + " ");           
        }
        
        System.out.println();
        //Genera la ultima fila
        System.out.print("D)La última fila es: ");       
        for(int i = 0; i < columnas; i++){
            System.out.print(array[filas -1][i] + " ");
        }
        
        /*//Genera la ultima columna
        for(int i =0; i < columnas; i++){
            System.out.print(array[i][columnas - 1]);
        }*/
    }
    
}
