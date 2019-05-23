/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author david
 */
public class Simbolos {
    private String opcion;

    public Simbolos() {
        this.opcion = "";
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    
    public void Suma(){
        this.opcion = "+";
    }
    
    public void Resta(){
        this.opcion = "-";
    }
    
    public void Multiplicacion(){
        this.opcion = "X";
    }
    
    public void Division(){
        this.opcion = "/";
    }
    
    public void Igual(){
        this.opcion = "=";
    }
    
    public void Borrar(){
        this.opcion = "";
    }
}
