/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen5Recu;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class PasosDelPrimerNumeroAlSegundoDelArray {
    public static void main (String [] args) {
        
        int numeros [] = new int [20];
        int pasos = 0;
        int pasosDados = 0;
        
        System.out.println("ARRAY ORIGINAL\n---------------------------------");
        for (int i = 0; i < 20; i++){
            numeros[i] = (int)(Math.random() * 1001);
            System.out.print( numeros [i] + " | ");
        }
        System.out.println();
        Scanner s = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer (que se encuentre en el array): ");
        int primerNum = s.nextInt();
        System.out.println("Por favor, introduzca el segundo (que se encuentre en el array): ");
        int segundoNum = s.nextInt();
        
        
        for (int i = 0; i <20; i++){
            pasos ++;
            if (primerNum == numeros[i]){
                pasos = 0;
            }
            if (segundoNum == numeros [i]){
                pasosDados = pasos;
            }
        }
        System.out.print("Del " + primerNum + " hasta el " + segundoNum+ " hay " + pasosDados + " pasos");
    }
    
}
