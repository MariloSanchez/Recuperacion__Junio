/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionjunio2015;

/**
 *
 * @author Mariló
 */
public class MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array[][] = new int [3][2];
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                array[i][j] = (int)(Math.random()*10) + 1;
                System.out.printf("%5d" , array[i][j]);
            }
            System.out.println();
        }
        System.out.println("ARRAY TRANSPUESTO");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("%5d" , transpuesta(array)[i][j]);
            }
            System.out.println();
        }
    }
    
    public static int[][] transpuesta(int[ ][ ] a){
        
        //para tener el tamaño de filas a.length
        //para el tamaño de columna es a[].length
        
        int arrayTrans [][] = new int [a[0].length][a.length];
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                arrayTrans [j][i] = a[i][j];
            }
        }
        return arrayTrans;
    }
}
