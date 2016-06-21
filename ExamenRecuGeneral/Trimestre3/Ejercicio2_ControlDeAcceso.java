/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trimestre3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class Ejercicio2_ControlDeAcceso {
    public static void main(String[] args) {
       
         Scanner s = new Scanner(System.in);
        //Creo los hashmap
        HashMap<String, String> usuarioContrasena = new HashMap<String, String>();
        HashMap<String, String> usuarioNombre = new HashMap<String, String>();
       
        usuarioContrasena.put("albri","111");
        usuarioContrasena.put("mario","222");      
        usuarioContrasena.put("yolap","333");
        usuarioContrasena.put("mogal", "444");
        usuarioContrasena.put("alque", "555");
        
        usuarioNombre.put("albri","Alan Brito Delgado");
        usuarioNombre.put("mario","Mario Neta Grande");      
        usuarioNombre.put("yolap","Yola Prieto Fuerte");
        usuarioNombre.put("mogal", "Mónica Galindo Entrematas");
        usuarioNombre.put("alque","Albert Quero Del Agua");
        
        //pido los datos
        System.out.print("Introduzca el nombre de usuario: ");
        String nombreUsuario = s.nextLine();
        if(!usuarioNombre.containsKey(nombreUsuario)){
            System.out.println("El nombre de usuario es incorrecto");
        }
        if (usuarioNombre.containsKey(nombreUsuario)){
            System.out.print("Introduzca la contraseña:");           
            String contrasena = s.nextLine();     
            if((!usuarioContrasena.get(nombreUsuario).equals(contrasena))){//si usuario no es igual a la contraseña del has es incorrecta
                System.out.println("La contraseña es incorrecta");
            }else{
            System.out.println("!Bienvenido " + usuarioNombre.get(nombreUsuario) + "!");        
            }
        }
        
        
        /*if (usuarioNombre.containsKey(nombreUsuario) && usuarioContrasena.containsValue(contrasena) ) {
            System.out.println("!Bienvenido " + usuarioNombre.get(nombreUsuario) + "!");  
        }else if(!usuarioNombre.containsKey(nombreUsuario)){
            System.out.println("El nombre de usuario es incorrecto");
            }else if( usuarioNombre.containsKey(nombreUsuario) && !usuarioContrasena.containsValue(contrasena)){
                System.out.println("La contraseña es incorrecta");
            }*/
    }
}
