/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class CafeteraApp {
     
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CafeteraServicio cafs = new CafeteraServicio();
        Cafetera cs = new Cafetera();
        
        System.out.println("Bienvenidos a la Cafeteria *EGG*");
        //Agregar Cafe a la Cafetera
        System.out.println("Ingrese la cantidad de cafe que desea agregar a la cafetera: ");
        cafs.agregarCafe(cs, sc.nextInt());
        
        //Llenar Cafetera
        System.out.println("Cargando cafetera...");
        cafs.llenarCafetera(cs);
        
        //Servir taza
        System.out.println("Ingrese el tamaÃ±o de la taza a servir");
        cafs.servirTaza(cs, sc.nextInt());
        
        //Vaciar cafetera
        System.out.println("Vaciando cafetera");
        cafs.vaciarCafetera(cs);
        
    }
}
