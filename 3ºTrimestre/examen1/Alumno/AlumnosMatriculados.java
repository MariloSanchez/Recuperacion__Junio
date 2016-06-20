/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class AlumnosMatriculados implements Comparable<AlumnosMatriculados>{
    
    private static int totalAlumnos = 0;
    private static int alumnosMatriculados = 0;
    
    private String nombre;
    private String apellido;
    private String matricula = " ";
    
    public AlumnosMatriculados(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        totalAlumnos++;
    }

    public static int getTotalAlumnos() {
        return totalAlumnos;
    }

    public static int getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //matricula los alumnos
    public void matricula(String c){
        this.matricula = c;
        alumnosMatriculados++;
    }
    
    @Override
    public String toString(){
        String matriculaAux = this.matricula;
        
        if(this.matricula.equals(" ")){
            matriculaAux = "no matriculado";
            return this.apellido + ", " + this.nombre + " - " + " no matriculad";
        }else{
            return this.apellido + ", " + this.nombre + " - " + matriculaAux;
        }
    }
    
    @Override
    public int compareTo(AlumnosMatriculados a){
        if(this.apellido.equals(a.getApellido())){
            return this.nombre.compareTo(a.getNombre());
        }else{
            return this.apellido.compareTo(a.getApellido());
        }
    }
}


