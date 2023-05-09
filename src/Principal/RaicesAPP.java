/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author Edgardo
 */
public class RaicesAPP {
     public static void main(String[] args) {
         RaicesServicio Rz=new RaicesServicio();
         Raices Nombre=Rz.crearRaices();
        
         Rz.calcular(Nombre);
     }
}
