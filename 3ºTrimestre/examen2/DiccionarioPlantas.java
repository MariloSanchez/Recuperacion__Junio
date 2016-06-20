/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class DiccionarioPlantas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        HashMap<String, String> m = new HashMap<String, String>();
        Scanner s = new Scanner(System.in);

        m.put("ortiga", "urtica dioica");
        m.put("romero", "rosmarinus officinalis");      
        m.put("aloe vera", "aloe barbadensis miller");
        m.put("ayahuasca", "banisteriopsis caapi");
        

        System.out.print("Introduzca la planta de la que desea la información: ");
        String palabraIntro = s.nextLine();
        
        
        if (m.containsKey(palabraIntro)) {
            System.out.println(palabraIntro + " su nombre científico es: " + m.get(palabraIntro));
            
            if(palabraIntro.equals("ortiga")){
                System.out.println("Propiedades: Es diurética y depurativa. Baja los niveles de colesterol.");
            }
            if(palabraIntro.equals("romero")){
                System.out.println("Tiene efectos estimulantes y tónicos,\n" +
                "favorece en la recuperación de las\n" +
                "enfermedades respiratorias y del aparato\n" +
                "digestivo.");
            }
            if(palabraIntro.equals("aloe vera")){
                System.out.println("Regenera las células de la piel e incluso\n" +
                "las de tejidos internos. Elimina hongos y\n" +
                "virus. Protege el sistema inmunitario.");
            }
            if(palabraIntro.equals("ayahuasca")){
                System.out.println("Se usa en el tratamiento de la depresión\n" +
                " y la ansiedad así como en los problemas\n" +
                "de personalidad y esquizofrenia");
            }
            
        } else {
        System.out.print("Lo siento, esa planta no existe.");
        }  
    }
    
}
