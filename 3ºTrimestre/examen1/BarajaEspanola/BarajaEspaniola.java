/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author Mariló
 */
public class BarajaEspaniola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Baraja> mazo1 = new ArrayList<>();
        ArrayList<Baraja> mazo2 = new ArrayList<>();
        
        System.out.println("Mazo 1:");
        for(int i = 0; i < (int)((Math.random() * 5) + 1); i++){
            Baraja nuevaB = new Baraja();
            mazo1.add(nuevaB);
            System.out.println(nuevaB.toString());
        }
        
        System.out.println("\n");
        
        System.out.println("Mazo 2:");
        for(int i = 0; i < (int)((Math.random() * 5) + 1); i++){
            Baraja nuevaB = new Baraja();
            mazo2.add(nuevaB);
            System.out.println(nuevaB.toString());
        }
        
        System.out.println("\n");
        
        ArrayList<Baraja> mezcla = Baraja.mezclar(mazo1, mazo2);
        
        System.out.println("Mezcla Final: ");
        for(int i = 0; i < mezcla.size(); i++){
            Baraja barajaFinal = mezcla.get(i);
            System.out.println(barajaFinal.toString());
        }
    }
    
}
