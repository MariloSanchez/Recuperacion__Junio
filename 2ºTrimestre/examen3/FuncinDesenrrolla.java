/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

/**
 *
 * @author Mariló
 */
public class FuncinDesenrrolla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] array = new int[6][4];
        
        System.out.println("ARRAY BIDIMENSIONAL\n***************");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = (i * array[0].length) + j;
                System.out.printf("%5d" , array[i][j]);
            }
            System.out.println();
        }
        System.out.println("ARRAY DESERRONLLADO\n***************");
        int[] arrayUni = desenrolla(array);
    
        for(int i = 0; i < arrayUni.length; i++){
            System.out.printf("%3d", arrayUni[i]);
        }
    }
    public static int[] desenrolla(int[][] n){
        int[] array = new int[n.length * n[0].length];
    
        int contador = 0;

        for(int vuelta = 0; contador < array.length; vuelta++){
            for(int i = vuelta; i < n[0].length - vuelta; i++){
                array[contador] = n[vuelta][i];
                contador++;
            }
            for(int i = vuelta + 1; i < n.length - vuelta; i++){
                array[contador] = n[i][n[0].length - (vuelta + 1)];
                contador++;
            }
            for(int i = n[0].length - (vuelta + 1) - 1; i >= vuelta; i--){
                array[contador] = n[n.length - (vuelta + 1)][i];
                contador++;
            }
            for(int i = n.length - (vuelta + 1) - 1; i > vuelta; i--){
                array[contador] = n[i][vuelta];
                contador++;
            }
        }

        return array;
    }
    
}
