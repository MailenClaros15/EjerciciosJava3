/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 * Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente fórmula: (b^2)-4*a*c Método tieneRaices():
 * devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
 * el discriminante debe ser mayor o igual que 0. Método tieneRaiz(): devuelve
 * un booleano indicando si tiene una única solución, para que esto ocurra, el
 * discriminante debe ser igual que 0. Método obtenerRaices(): llama a
 * tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones. Método
 * obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única
 * raíz. Es en el caso en que se tenga una única solución posible. Método
 * calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará
 * por pantalla las posibles soluciones que tiene nuestra ecuación con los
 * métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
 * métodos y en caso de no existir solución, se mostrará un mensaje. Nota:
 * Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo
 * delante de -b
 *
 * @author Edgardo
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    public Raices crearRaices() {
        Raices ra = new Raices();
        System.out.println("Ingrese el valor de a ");
        ra.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b");
        ra.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c");
        ra.setC(leer.nextDouble());

        return ra;

    }

    public double getDiscrimante(Raices nombre) {
        double a = nombre.getA();
        double b = nombre.getB();
        double c = nombre.getC();
        double discrimante;
        discrimante = Math.pow(b, 2) - 4 * a * c;
        return discrimante;
    }

    public boolean tieneRaices(Raices Nombre) {
        RaicesServicio ds = new RaicesServicio();
        boolean verdadero = false;
        if (ds.getDiscrimante(Nombre) >= 0) {
            verdadero = true;

        }
        return verdadero;
    }

    public boolean tieneRaiz(Raices Nombre) {
        RaicesServicio ds = new RaicesServicio();
        boolean verdadero = false;
        if (ds.getDiscrimante(Nombre) == 0) {
            verdadero = true;

        }
        return verdadero;
    }
    //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en
//* que se tenga una única solución posible.
    //Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

    public void obtenerRaices(Raices Nombre) {
        double a = Nombre.getA();
        double b = Nombre.getB();
        double c = Nombre.getC();
        RaicesServicio ob = new RaicesServicio();
        if (ob.tieneRaices(Nombre) == true) {
            System.out.println("Solucion 1: " + (-b + Math.sqrt(ob.getDiscrimante(Nombre))) / (2 * a));
            System.out.println("Solucion 2: " + (-b - Math.sqrt(ob.getDiscrimante(Nombre))) / (2 * a));
        }
    }
    public void obtenerRaiz(Raices Nombre ){
        double a = Nombre.getA();
        double b = Nombre.getB();
        double c = Nombre.getC();
        RaicesServicio ob = new RaicesServicio();
        if(ob.tieneRaiz(Nombre)==true){
                 System.out.println("Solucion 1: " + (-b + Math.sqrt(ob.getDiscrimante(Nombre))) / (2 * a));   
        }
    }
    //Método
 //* calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará
 //* por pantalla las posibles soluciones que tiene nuestra ecuación con los
 //* métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
 //* métodos y en caso de no existir solución, se mostrará un mensaje. 
    public void calcular(Raices Nombre){
        RaicesServicio ob=new RaicesServicio();
        if (ob.tieneRaices(Nombre)==true){
            ob.obtenerRaices(Nombre);}
        
        else if (ob.tieneRaiz(Nombre)==true){
            ob.tieneRaiz(Nombre);
        }
        else{
            System.out.println("No tiene solución");
        }
    }
}
