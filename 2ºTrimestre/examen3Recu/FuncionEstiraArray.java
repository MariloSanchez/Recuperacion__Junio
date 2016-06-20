/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3Recu;

/**
 *
 * @author Mariló
 */
public class FuncionEstiraArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int bidimensional [][] = new int [4][6];
        System.out.println("ARRAY BIDIMENSIONAL\n***************************");
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 6; j++){
                bidimensional[i][j] = (int)(Math.random() * 200) + 1;
                System.out.printf("%5d" , bidimensional[i][j]);
            }
            System.out.println();
        }
        System.out.println("ARRAY UNIDIMENSIONAL\n***************************");
        int array [] = estira(bidimensional);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
    public static int[] estira(int[][] n){
        
        int numeroFilas = n.length;//numero de filas del array bidi n
        int numeroColumnas = n[0].length;//numero de columnas del array bidi n
        int tamaño = numeroFilas * numeroColumnas;//tamaño total del array
        int array [] = new int [tamaño];//crear un array uni con el tamaño del bidi
        int k = 0;
        
        for (int i = 0; i < numeroFilas; i++){//recorro array bidimensional
            for (int j = 0; j < numeroColumnas; j++){
                array[k] = n[i][j];//igualo el uni al bidi
                k++;//implemento las celdas
            }
        }
        return array;
    }
    
}
