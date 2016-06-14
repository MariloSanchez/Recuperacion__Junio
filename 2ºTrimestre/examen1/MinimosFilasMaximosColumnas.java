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
        
        int columnaMinimo = 101;
        int filaMaximo = 0;
        
        //Maximo de las filas
        for (int i = 0; i < 4; i++){
            filaMaximo = 0;
            for (int j = 0; j < 6; j++){
                System.out.printf("%5d" , array[i][j]);
                if (filaMaximo < array[i][j]){
                    filaMaximo = array[i][j];
                }
                    if (j == 5){
                        System.out.printf("|%5d" , filaMaximo);
                    }
                }
              System.out.println();
            } 
          
   
        //Minimo Columnas       
        System.out.println("-------------------------------");  
        for (int j = 0; j < 6; j++){
            columnaMinimo = 101;
            for (int i = 0; i < 4; i++){
                if (columnaMinimo > array[i][j]){
                    columnaMinimo = array [i][j];
                }
            }
            System.out.printf("%5d", columnaMinimo);
        }
    }
}

