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
public class Persona2 {
    private String nombre;
    private double edad;
    private String sexo;
    private double altura;
    private double peso;
    
    public Persona2(){
        
    }

    public Persona2(String nombre,double edad, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
   
    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona2{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
}
