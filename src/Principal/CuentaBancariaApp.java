/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Servicios.CuentaBancariaServicio;

/**
 *
 * @author Edgardo
 */
public class CuentaBancariaApp {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();

        cbs.crearCuenta();
        cbs.toString();
       
        
    }

}  

