/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Edgardo
 */
public class Nif {
    private int DNI;
    private String letra;
    
    public Nif(){
        
    }

    public Nif(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return DNI+"-"+letra;
    }
    
}
