/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class FuncionConvierteNumeroEnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introduce número que quieres convertirlo en array: ");
        Scanner s = new Scanner (System.in);
        long n = s.nextLong();

        int[] array = convierteNumeroEnArray(n);

        for (int i = 0; i < array.length ; i++ ) {
            System.out.print(array[i] + "|");
        }
    }
    
    //Funciones//
    public static int[] convierteNumeroEnArray(long n){
               
        int longitud = 0;
        long contador = n;//lo creo para que no me machaque el n
        
        //para ver los digitos que tiene
        while(contador > 0){
            contador /= 10; 
            longitud++;
        }
        
        int[] array = new int [longitud];
        int control = longitud - 1;
        
        //introduce n en cada celda del array
        while (n > 0){
            long numInvertido = n % 10;
            array[control] = (int)numInvertido;
            n /= 10;
            control--;
        }
        return array;
    }
}
