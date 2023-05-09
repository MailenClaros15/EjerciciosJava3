/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Edgardo
 */
public class PersonaAPP {
   public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();

        System.out.println(p1);

    }

} 

