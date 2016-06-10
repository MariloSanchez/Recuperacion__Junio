/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class LetraL {
    public static void main(String[] args) {
     
        System.out.println("Introduce la altura: ");
        Scanner s = new Scanner (System.in);
        int altura = s.nextInt();
        
        for (int i = 0; i < altura - 1; i++){
            System.out.println("*");
        }
            for (int i = 0; i < (altura / 2) + 1; i++){
                System.out.print("*");
            }
    }  
}
