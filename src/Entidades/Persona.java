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
public class Persona {
    //TRES ATRIBUTOS:
    public String nombre;
    public int edad;
    public String ocupacion;

    
// CONSTRUCTORES: 1 VACIO Y OTRO CON PARÁMETROS
    public Persona() {
    }
       
    public Persona(String nombre, int edad, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    
// GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Persona_1{" + "nombre=" + nombre + ", edad=" + edad + ", ocupacion=" + ocupacion + '}';
    }
    
    
    
}
