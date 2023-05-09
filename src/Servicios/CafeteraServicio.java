/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
 * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima. Método servirTaza(int): se pide el tamaño de una taza vacía, el
 * método recibe el tamaño de la taza y simula la acción de servir la taza con
 * la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar
 * la taza, se sirve lo que quede. El método le informará al usuario si se llenó
 * o no la taza, y de no haberse llenado en cuanto quedó la taza. Método
 * vaciarCafetera(): pone la cantidad de café actual en cero.
 *
 * Método agregarCafe(int): se le pide al usuario una cantidad de café, el
 * método lo recibe y se añade a la cafetera la cantidad de café indicada.
 *
 *
 * @author Edgardo
 */
/*public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    Cafetera c1 = new Cafetera();

    public void llenarCafetera(Cafetera c1) {
        c1.setCapacidadMáxima(c1.getCantidadActual());

    }

    public void agregarCafe(int cafe) {

    }

    public void servirTaza(int taza) {
        int opcion;
        System.out.print("Seleccione el tamaño de taza");
        System.out.print("1.Pequeña");
        System.out.print("2.Mediana");
        System.out.print("3.Grande");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                if (50 <= c1.getCantidadActual()) {
                    System.out.print("Su taza se llenó");
                      c1.setCantidadActual((c1.getCantidadActual()-50));
                } else {
                    System.out.print("su taza no se llenó"+(c1.getCantidadActual()/50*100));

                    break;
                }
            case 2:
                if (100 < c1.getCantidadActual()) {
                    System.out.print("su taza se llenó");
                      c1.setCantidadActual((c1.getCantidadActual()-100));
                } else {
                    System.out.print("su taza no se llenó"+(c1.getCantidadActual()/100*100));
                    break;
                }
            case 3:
                if (150 < c1.getCantidadActual()) {
                    System.out.print("su taza se llenó");
                      c1.setCantidadActual((c1.getCantidadActual()-150));
                } else {
                    System.out.print("su taza no se llenó"+(c1.getCantidadActual()/150*100));
 
                    break;
                }
        }

    }
    public void vaciarCafetera() {

       
            c1.setCantidadActual(0);
    }

 public void agregarCafe(Cafetera cs, int cant){
        
        cs.setCantidadActual(cs.getCantidadActual()+cant); 
    }
}
 */
public class CafeteraServicio {
    
    
    public void llenarCafetera(Cafetera cs){
      
        cs.setCapacidadMaxima(cs.getCantidadActual());
    }
    
    public void servirTaza(Cafetera cs, int tam){
       
            System.out.println("Serviendo una taza de cafe...");
            int resta = tam - cs.getCantidadActual();
            if (resta == 0) {
                System.out.println("Taza llena, la medida justa ");
            }else
                if (resta>0) {
                    System.out.println("Taza medio llena, Falto Cafe! ");
                    System.out.println("La taza cuenta con "+resta+ "de capacidad disponible para su llenado");

                }else{
                    
                    System.out.println("Taza llena! Sobro cafe, alguien quiere un poco?");
                }
        }
    
    public void vaciarCafetera(Cafetera cs){
        cs.setCantidadActual(0);   
    }
    
    public void agregarCafe(Cafetera cs, int cant){
        
        cs.setCantidadActual(cs.getCantidadActual()+cant); 
    }
}
