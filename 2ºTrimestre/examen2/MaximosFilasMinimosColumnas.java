/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Mariló
 */
public class MaximosFilasMinimosColumnas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[][] = new int [4][6];
        
        int fila;
        int columna;
        
        //asigno valores al array
        for (fila = 0; fila < 4; fila++){
            for (columna = 0; columna < 6; columna++){
                array[fila][columna] = (int)(Math.random() * 90) + 10;
            }
        }
        
        int filaMaximo = 0;
        int columnaMinimo = 101;
        
        //Maximo de las filas
        for(fila = 0; fila < 4; fila++){
            filaMaximo = 0;
            for (columna = 0; columna < 6; columna++){
                System.out.printf("%5d" , array[fila][columna]);//pinto el array
                if(filaMaximo < array[fila][columna]){
                   filaMaximo = array[fila][columna];
                }                                                            
            }
            System.out.printf("|%5d" , filaMaximo);  //pongo al lado el maximo
            System.out.println();
        }
        
        //Minimo de las columnas
        System.out.println("--------------------------------");
        for(columna = 0; columna < 6; columna++){
            columnaMinimo = 101;
            for (fila = 0; fila < 4; fila++){
                if (columnaMinimo > array[fila][columna]){
                    columnaMinimo = array[fila][columna];                    
                }
            }
            System.out.printf("%5d" , columnaMinimo);
        }
    }
    
}
