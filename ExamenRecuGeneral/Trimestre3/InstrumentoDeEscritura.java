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
public class InstrumentoDeEscritura {
    
    //Atributos de clase
    private static String tipoInstru[]={"lapiz", "boligrafo", "rotulador"};
    private static String tamanoInstru[]={"grande", "pequeño"};
    private static String colorInstru[]={"rojo", "azul", "negro"};
    
    private String tipo;
    private String color;
    private String tamano;

    
    //constructor
    public InstrumentoDeEscritura(){
        int aleatorioTipo = (int)(Math.random()*3);
        this.tipo = tipoInstru[aleatorioTipo];
        int aleatorioTamano = (int)(Math.random()*2);
        this.tamano = tamanoInstru[aleatorioTamano];
        int aleatorioColor = (int)(Math.random()*3);
        this.color = colorInstru[aleatorioColor];
    }
    
    @Override
    public String toString() {
        return tipo + " " + color + " " + tamano;
    }
    
}