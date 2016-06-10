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
public class gestionDeVotos {
     public static void main (String [] args) {
         
         String nombrePartido [] = { "Ciudadanos", "Podemos", "PP", "PSOE", "Izquierda Unida", "UpyD"};
         
         //mostramos el array de partidos politicos
         System.out.println( "Los partidos políticos son: " );
         System.out.println("-----------------------------------------------------");
         for (int i = 0 ; i < 6; i++){
             System.out.println( nombrePartido[i]);
         }
         
        //metemos por teclado la votacion en el array
        int votacion[] = new int [6];
        
        System.out.println("-----------------------------------------------------");

        System.out.println("Introduzca las votaciones de los partidos por orden:");
        for (int i = 0; i < 6; i++){
            System.out.print("Votación " + (i + 1) + ": ");
            Scanner s = new Scanner (System.in);
            votacion[i] = s.nextInt();
        }
        
         System.out.println("----------------------------------------------------");
        //media de todas las votaciones
        double suma = 0;
       
        for (int i = 0; i < 6; i++){
            suma += votacion[i]; 
        }
        double media = suma / 6;
        System.out.println("La media de todas las votaciones es: " + media);
        
        System.out.println("-----------------------------------------------------");
        
        // Partidos con mayor voto que la media
        System.out.print("Los votos de los partidos por encima de la media han sido: ");
        for (int i = 0; i < 6; i++){//recorro array votos
            if ( votacion [i] > media){
                System.out.print( nombrePartido [i]  + ", "); 
            }
        }
         System.out.println();
         System.out.println("-----------------------------------------------------");
        //Partidos con menor voto que la media
        System.out.print("Los votos por debajo de la media han sido: ");
        for (int i = 0; i < 6; i++){//recorro array votos
            if ( votacion [i] < media){
              System.out.print ( nombrePartido [i] + ", ");
            }
        }
    }
    
}
