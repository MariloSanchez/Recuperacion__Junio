/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class HashMapColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner t = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        
        String[] england = {"Blue","Black","Red","White","Green","Purple","Yellow","Orange","Violet"};
        String[] color = {"#0000ff","#000000","#ff0000","#ffffff","#008000","#800080","#ffff00","#ffa500","#ee82ee"};
        String[] spain = {"azul","negro","rojo","blanco","verde","morado","amarillo","naranja","rosa"};

        HashMap<String, String> espaniolIngles = new HashMap<String, String>();
        HashMap<String, String> espaniolRgb = new HashMap<String, String>();
        
        
        
        for(int i = 0; i < color.length; i++){
            espaniolIngles.put(spain[i].toLowerCase(), england[i]);
            espaniolRgb.put(spain[i].toLowerCase(), color[i].toLowerCase());
        }
        
        System.out.println("Introduzca un color: ");
        String respuesta = t.next();
        
        System.out.println("--------------------------------------------------------------------------------------");

        if(espaniolRgb.containsKey(respuesta)){
            System.out.println("El color " + respuesta + " es " 
            + espaniolIngles.get(respuesta) + " y el código RGB es " + espaniolRgb.get(respuesta));
        }else{
            System.out.println("Color inexistente!");
        }
    }
    
}
