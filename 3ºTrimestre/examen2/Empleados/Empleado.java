/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Mariló 
 */

public class Empleado implements Comparable<Empleado> {

    private static int empleadosTotales = 0;
    private static int empleadosConCargo = 0;

    private String nombre;
    private String apellido;
    private String cargo = "";

    public Empleado(String nombre, String apellido) {
      this.nombre = nombre;
      this.apellido = apellido;
      Empleado.empleadosTotales++;
    }

    public static int getEmpleadosTotales() {
      return empleadosTotales;
    }

    public static int getEmpleadosConCargo() {
      return empleadosConCargo;
    }

    public String getApellido() {
      return apellido;
    }

    public String getNombre() {
      return nombre;
    }

    public void asignaCargo(String c) {
      this.cargo = c;
      Empleado.empleadosConCargo++;
    }

    @Override
    public String toString() {
      String cargoAux = this.cargo;

      if (this.cargo.equals("")) {
        cargoAux = "(sin cargo)";
      }
      return this.apellido + ", " + this.nombre + " - " + cargoAux;
    }


    @Override
    public int compareTo(Empleado e) {
      if (this.apellido.equals(e.getApellido())) {
        return this.nombre.compareTo(e.getNombre());
      } else {
        return this.apellido.compareTo(e.getApellido());
      }    
    }
}

