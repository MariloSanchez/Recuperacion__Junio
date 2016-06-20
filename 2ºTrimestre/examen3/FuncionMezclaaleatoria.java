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
public class FuncionMezclaaleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        System.out.print("Introduce un número: ");
          long num1 = s.nextInt();
          System.out.print("Introduce un segundo número: ");
          long num2 = s.nextInt();
          System.out.println("-------------------------------------------------------------------------------");
         
          long numFinal = mezclaAleatoria(num1, num2);      
          
          System.out.println("El número resultante es " + numFinal);
    }
    
    //primero convertimos los dos números en arrays
      public static int[] convierteNumeroEnArray(long n){
      int longitud = 0;
      long contador = n;

      //invierte el número
      while (contador > 0){
        contador /= 10;
        longitud++;
      }

      int[] a = new int[longitud];
      int control = longitud - 1;

      //vuelve a invertir el número a su forma original
      //y lo introduce en cada celda del array
      while (n > 0){
        long numInvertido = n % 10;
        a[control] = (int)numInvertido;
        n /= 10;
        control--;
      }

        return a;
      }
    
    
    public static long mezclaAleatoria(long x, long y){
        int[] xArray = convierteNumeroEnArray(x);
        int[] yArray = convierteNumeroEnArray(y);
        
        //unir los dos arrays
        int tamanioArray = xArray.length + yArray.length;
        int[] arrayFinal =  new int[tamanioArray];
        
        int i;
        int j;
        int contador = 0;
        
        //meter los números en el array final
        for(i = 0; i < xArray.length; i++){
          arrayFinal[i] = xArray[i];
        }
        
        for(j = i; j < arrayFinal.length; j++){
          arrayFinal[j] = yArray[contador];
          contador++;
        }
        
        int numFinal = 0;
        int aleatorio;
        boolean numExiste;
        
        //mezclar los arrays
        int[] indiceArray = new int[arrayFinal.length];
        int indice = (int)(Math.random() * arrayFinal.length);
        boolean existe = false;
        indiceArray[0] = arrayFinal[indice];
        
        for(i = 0; i < arrayFinal.length; i++) {
            do {
                indice = (int)(Math.random() * arrayFinal.length);
                existe = false;
                
                for(j = 0; j < i; j++) {
                    if(indiceArray[j] == indice) {
                        existe = true;
                    } 
                }
            } while(existe);
            indiceArray[i] = indice;
        }
        
        //Se le asignan valores a un nuevo array
        int[] arrayNuevo = new int[arrayFinal.length];
        for(i = 0; i < arrayFinal.length; i++) {
            arrayNuevo[i] = arrayFinal[indiceArray[i]];
        }
        
        //Se tranforma el array en un número entero
        for(i = 0; i < arrayNuevo.length; i++) {
            int n = arrayNuevo[i];
            numFinal = numFinal * 10 + n;
        }
        
        return numFinal;
    }
    
}
