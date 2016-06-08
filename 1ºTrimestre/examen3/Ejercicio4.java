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
public class Ejercicio4 {
    public static void main (String [] args) {
        
        int [] mesa = new int [10];
        boolean encontrada;
    
        for (int i = 0; i < 10; i++){
          mesa [i] = (int)(Math.random()*5);
        }
         // Muestra el array original
        System.out.print("Mesa:     ");
        for (int i = 1; i < 11; i++) {
          System.out.printf("%4d ", i);
        }
        
        System.out.println();
        System.out.print("Personas: ");
        for (int i = 0; i < 10; i++) {
          System.out.printf("%4d ", mesa[i]);
        }
        
        int respuesta;

        do{
            System.out.println();
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            Scanner s = new Scanner (System.in);
            respuesta = s.nextInt();
            encontrada = false;

            if (respuesta > 4){
              System.out.print("Lo siento, no admitimos a grupos mayores de 4. ");
              System.out.print("Tendrá que ver la gala de pie");
            }
            if (respuesta == 1){
              System.out.print("Puede sentarse en la mesa: ");
              int i = 0;
                while(!encontrada && i < 10){
                    if (mesa[i] <= 3){
                        System.out.print(i + " ,");
                        encontrada = true;
                        mesa[i] = mesa[i] + 1;
                    }
                    i++; 
                }
            }
            if (respuesta == 2){
                System.out.print("Puede sentarse en la mesa: ");
                int i = 0;
                while(!encontrada && i < 10){
                    if (mesa[i] <= 2){
                        System.out.print(i + " ,");
                        encontrada = true;
                        mesa[i] = mesa[i] + 2;
                    }
                    i++; 
                }
            }
            if (respuesta == 3){
                System.out.print("Puede sentarse en la mesa: ");
                int i = 0;
                while(!encontrada && i<10){
                    if (mesa [i] <= 1){
                        System.out.print(i + " ,");
                        encontrada = true;
                        mesa[i] = mesa[i] + 3;
                    } 
                    i++;
                }
            }
            if (respuesta == 4){
                System.out.print("Puede sentarse en la mesa: ");
                int i = 0;
                while(!encontrada && i < 10){
                    if (mesa[i] <= 0){
                        System.out.print(i + " ,");
                        encontrada = true;
                        mesa[i] = mesa[i] + 4;
                    }
                    i++;
                }
            }
      }while (respuesta != -1);
    }
}
