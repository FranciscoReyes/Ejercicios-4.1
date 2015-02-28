/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

/**
 *
 * @author Francisco A. Reyes
 */
public class Coche {
    String modelo;
    String pintura;
    boolean metalizado;
    String matricula;
    String metali;
    int añoFabricacion;
    String modeloCompleto;
    
    
    void setDatosCoche (String mod, String color, boolean metal, String matri, int añoFab) {
        modelo = mod;
        pintura = color;
        metalizado = metal;
        metali = (metalizado == true) ? "Si":"No";
        matricula = matri;
        añoFabricacion = añoFab;
        
        System.out.println("Valores asiganados: Modelo: " + modelo + " \nColor: " + pintura + "\nMetalizado: " + 
        metalizado + " \nMatrícula: " + matricula + " \nAño Fabricación: " + añoFabricacion);
    }
    
    String getDatosCoche () {
        modeloCompleto = ("Modelo: " + modelo + " \nColor: " + pintura + "\nMetalizado: " + 
        metali + " \nMatrícula: " + matricula + " \nAño Fabricación: " + añoFabricacion);
        return modeloCompleto;
    }
}
