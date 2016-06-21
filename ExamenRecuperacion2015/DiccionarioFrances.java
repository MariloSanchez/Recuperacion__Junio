/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionjunio2015;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class DiccionarioFrances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //Creo los hashmap
        HashMap<String, String> espanolIngles = new HashMap<String, String>();
        HashMap<String, String> inglesFrances = new HashMap<String, String>();
        
        espanolIngles.put("ordenador", "computer");
        espanolIngles.put("rojo", "red");
        espanolIngles.put("sol", "sun");
        espanolIngles.put("leche", "milk");
        espanolIngles.put("manzana", "apple");
        
        inglesFrances.put("computer", "ordinateur");
        inglesFrances.put("red", "rouge");
        inglesFrances.put("sun", "soleil");
        inglesFrances.put("milk", "lait");
        inglesFrances.put("apple", "pomme");
        
        //pido los datos
        System.out.print("Introduzca la palabra en español: ");
        String palabra = s.nextLine();
        if(espanolIngles.containsKey(palabra)){
            System.out.println("La palabra en frances es " + inglesFrances.get(espanolIngles.get(palabra)));                   
        }else{
            System.out.println("La palabra no existe en el diccionario");
        }
    }
    
}
