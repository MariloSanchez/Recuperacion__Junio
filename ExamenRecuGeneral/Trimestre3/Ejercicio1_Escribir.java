/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trimestre3;

import java.util.ArrayList;

/**
 *
 * @author Mariló
 */
public class Ejercicio1_Escribir {
    public static void main(String[] args) {

        ArrayList<InstrumentoDeEscritura> escogerInstrumento = new ArrayList<>();
        
        
        for(int x = 0; x < 5; x++){
            escogerInstrumento.add(new InstrumentoDeEscritura());            
        }
        
        //Muestra instrumentos      
        System.out.println("Instrumentos: ");
        for(int i = 0; i < escogerInstrumento.size(); i++) {
            System.out.println("Intrumento " + (i+1) + ": " + escogerInstrumento.get(i));
        }
    }
    
}
