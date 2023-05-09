/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Nif;
import Servicios.NifServicio;

/**
 *
 * @author Edgardo
 */
public class NifAPP {
    public static void main(String[] args) {
        NifServicio persona=new NifServicio();
        Nif usuario= persona.crearNif();
        
        persona.mostrar(usuario);
    }
}
