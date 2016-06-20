/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import examen1.AlumnosMatriculados;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author marilo (Es el que te da el profesor)
 */
public class Alumno {
    public static void main(String[] args) {
        ArrayList<AlumnosMatriculados> a = new ArrayList<>();

        AlumnosMatriculados a1 = new AlumnosMatriculados("Elba", "Lazo");
        AlumnosMatriculados a2 = new AlumnosMatriculados("Elba", "Quero");
        a2.matricula("2º BACH");
        AlumnosMatriculados a3 = new AlumnosMatriculados("Albert", "Quero");
        AlumnosMatriculados a4 = new AlumnosMatriculados("Mario", "Neta");
        AlumnosMatriculados a5 = new AlumnosMatriculados("Yola", "Prieto");
        a5.matricula("1º DAW");
        AlumnosMatriculados a6 = new AlumnosMatriculados("Monica", "Galindo");
        a6.matricula("2º DAW");

        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
        a.add(a6);

        Collections.sort(a);

        for (AlumnosMatriculados miAlumno: a) {
          System.out.println(miAlumno);
        }

        System.out.println("Alumnos totales: " + AlumnosMatriculados.getTotalAlumnos());
        System.out.println("Alumnos matriculados: " + AlumnosMatriculados.getAlumnosMatriculados());
  }
}
