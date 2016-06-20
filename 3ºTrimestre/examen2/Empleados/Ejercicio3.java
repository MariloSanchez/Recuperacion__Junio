/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mariló es el que me da el profesor
 */
public class Ejercicio3 {
    public static void main(String[] args) {
       
        ArrayList<Empleado> e = new ArrayList<>();
        Empleado e1 = new Empleado("Elba", "Lazo");
        Empleado e2 = new Empleado("Elba", "Quero");
        Empleado e3 = new Empleado("Albert", "Quero");
        Empleado e4 = new Empleado("Mario", "Neta");
        Empleado e5 = new Empleado("Yola", "Prieto");
        Empleado e6 = new Empleado("Monica", "Galindo");
        e2.asignaCargo("Diseñador gráfico");
        e5.asignaCargo("Programador senior");
        e6.asignaCargo("Programador junior");
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        e.add(e5);
        e.add(e6);
        Collections.sort(e);
        for (Empleado empleadoAux : e) {
        System.out.println(empleadoAux);
        }
        System.out.println("Empleados totales: " + Empleado.getEmpleadosTotales());
        System.out.println("Empleados con cargo: " + Empleado.getEmpleadosConCargo());
    }
}
    

