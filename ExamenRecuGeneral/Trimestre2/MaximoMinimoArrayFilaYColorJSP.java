/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trimestre2;

/**
 *
 * @author Mariló
 */
public class MaximoMinimoArrayFilaYColorJSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Genera el array
        int[][] num = new int[5][8];
        int fila;
        int columna;
        
        for(fila = 0; fila < 5; fila++) {//Fila
            for(columna = 0; columna < 8; columna++) {//Columna
                 num [fila][columna] = (int)(Math.random()*200) + 100;
                System.out.printf("%5d   ", num[fila][columna]);
            }
             System.out.println();
        }
        
        //CALCULO MAXIMO Y MINIMO        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int filaMinimo = 0;
        int filaMaximo = 0;
       
        System.out.println();  
        
        for(fila = 0; fila < 5; fila++) {//recorro el array
            for(columna = 0; columna < 8; columna++){
                if(num[fila][columna] > max){//Descubro el maximo
                    max = num[fila][columna];
                    filaMaximo = fila;//guardo el numero de la fila en una variable
                }         
                if(num[fila][columna] < min){//Descubro el minimo
                    min = num[fila][columna];  
                    filaMinimo = fila;//guardo el numero de la fila en una variable
                }
            }
        }
        System.out.println("El minimo es: " + min  + " y aparece en la siguiente fila: ");
        for (int j = 0; j < 8; j++){
            System.out.print(num[filaMinimo][j]+ "|");
        }
        
        System.out.println("\n**********************************************");
        
        System.out.println("El máximo es: " + max + " y aparece en la siguiente fila: ");
        for (int j = 0; j < 8; j++){
            System.out.print(num[filaMaximo][j]+ "|");
        }
        
        
        //PINTO EL MAXIMO Y EL MINIMO
        /*for(fila = 0; fila < 5; fila++) {//recorro el array
            for(columna = 0; columna < 8; columna++){
                if (num[fila][columna] == min){//Pinto el minimo
                   System.out.print("El minimo es: " + min + " y aparece en la siguiente fila: \n");
                   for(int i = filaMinimo; i < 5; i++){
                       System.out.print(num[filaMinimo]);
                   }
                }
                if (num[fila][columna] == max){//Pinto el maximo
                    System.out.println();
                   System.out.print("El máximo es: " + max + " y aparece en la siguiente fila: \n" + num[(int)filaMaximo]);
                }
            }           
        }
        System.out.println();*/
    }
    
}
