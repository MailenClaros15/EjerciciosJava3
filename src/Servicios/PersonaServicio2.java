/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona2;
import java.util.Scanner;

/**En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario
* y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además,
* comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
* mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
* Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo 
* de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
* (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente,
* si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y 
* la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
 *
 * @author Edgardo
 */
public class PersonaServicio2 {
    boolean edades;
    Scanner leer=new Scanner(System.in);
    
    public void esMayorDeEdad(Persona2 pr2){
        int ps;
       if (pr2.getEdad()>=18){
           edades=true;
           ps=1;
           System.out.println("La persona es mayor de edad  "+edades+" ");
       }
       else{
           edades=false;
           ps=0;
            System.out.println("La persona no es mayor de edad  "+edades+" ");
       }
    }
    public Persona2 crearPersona(){
        Persona2 pr2=new Persona2();
        System.out.println("Ingrese su nombre ");
        pr2.setNombre(leer.next());
        System.out.println("Ingrese su edad ");
        pr2.setEdad(leer.nextDouble());
        System.out.println("Ingrese su sexo ");
        pr2.setSexo(leer.next());
        
        switch (pr2.getSexo()){
            case "H": 
                break;
            case "M":
                break;
            case "O":
                break;
            default:
                System.out.println("Ingreso mal el Sexo ");
                break;
                
        }
        System.out.println("Ingrese su altura ");
        pr2.setAltura(leer.nextDouble());
        System.out.println("Ingrese su peso ");
        pr2.setPeso(leer.nextDouble());
        return pr2;
        
    }
    public int calcularIMC(Persona2 pr2 ){
        double peso;
       
       
        peso=(pr2.getPeso()/(pr2.getAltura()*pr2.getAltura() ));
        if(peso<20){
           
            return -1;
            
        }
         if(peso>=20 && peso<=25){  
             
             return 0;
             
         }
         
           
             
             
             
        return 1;
    }
}




