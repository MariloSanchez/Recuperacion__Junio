/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class Ejercicio1 {
    public static void main (String [] args) {
        System.out.print ("Introduce la nota de tu primer examen de programación: ");
        Scanner s = new Scanner (System.in);
        int nota1 = s.nextInt();
        System.out.print ("Introduce la nota de tu segundo examen de programación: ");
        int nota2 = s.nextInt();

        int suma = nota1 + nota2;
        int media = suma / 2;

        System.out.println ("Tu nota media de programación es: " + media);
        if (media >= 5) {
            System.out.print ("Enhora buena, no tienes que ir a recuperación");
        }else{
            System.out.print ("¿Cuál ha sido el resultado de la recuperación? apto/no apto: ");
            String recuperacion = s.next();
            if (recuperacion.equals("apto")) {
                System.out.print ("La nota de la recuperación es un: 5");
            }else{
                System.out.print ("Tu nota se mantiene en " + media);
            }
        }
    }  
}
