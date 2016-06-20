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
public class FuncionSumatorioYProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] array = new int [6];
        System.out.println("ARRAY\n-------------");
        for (int i = 0; i < array.length; i++){
            array [i] = (int)(Math.random() * 20);
            System.out.print(array [i] + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println(" La suma de los digitos del array es: " + sumatorio(array));
        System.out.println("El producto del array es: " + producto(array));
        
    }
       
    ////////FUNCIONES/////////
    
    public static int sumatorio(int[] n){
        int suma = 0;
        for(int i = 0; i < n.length; i++){
            suma += n[i];
        }
        return suma;
    }
    
    public static int producto(int[] n){
        int multiplica = 1;//Se multiplica el primer numero del array por 1 y ese por el siguiente numero del array
        for (int i = 0; i < n.length; i++){
            multiplica *= n[i];
        }
        return multiplica;
    }
    
    
}
