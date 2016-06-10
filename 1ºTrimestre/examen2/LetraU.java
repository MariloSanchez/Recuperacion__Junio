package examen2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariló
 */
public class LetraU {
    public static void main (String [] args) {
        
        System.out.println("Introduce la altura de la U: ");
        Scanner s = new Scanner (System.in);
        int altura = s.nextInt();
        
        //la barra lateral izquierda
        for(int i = 1; i <= altura -1; i++) {
            System.out.print("*");
            for(int j = 1; j < altura - 1; j++)
		System.out.print("  ");
		System.out.println(" *");
           
        }	
	for (int i = 0; i < (altura - 1); i++)
            System.out.print(" *");
            System.out.println();
        
    }
}
