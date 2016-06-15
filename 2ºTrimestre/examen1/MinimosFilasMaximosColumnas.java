/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Mariló
 */
public class MinimosFilasMaximosColumnas {
    public static void main(String[] args) {
        
        int array [][] = new int [4][6];
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 6; j++){
                array[i][j] = (int)((Math.random() *90) + 10);
            }
        }  
        
        int columnaMaximo = 0;
        int filaMinimo = 101;
        
        //Maximo de las filas
        for (int i = 0; i < 4; i++){
            filaMinimo = 101;
            for (int j = 0; j < 6; j++){
                System.out.printf("%5d" , array[i][j]);
                if (filaMinimo > array[i][j]){
                    filaMinimo = array[i][j];
                }                                                             
            }
            System.out.printf("|%5d" , filaMinimo);
            System.out.println();
        } 
          
   
        //Minimo Columnas       
        System.out.println("-------------------------------");  
        for (int j = 0; j < 6; j++){
            columnaMaximo = 0;
            for (int i = 0; i < 4; i++){
                if (columnaMaximo < array[i][j]){
                    columnaMaximo = array [i][j];
                }
            }
            System.out.printf("%5d", columnaMaximo);
        }
    }
}

