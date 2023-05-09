/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class CuentaBancariaServicio {
   

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria usu1 = new CuentaBancaria();
        System.out.println("Introduzca Numero de cuenta");
        usu1.setNumeroCuenta(leer.nextInt());
        System.out.println("Introduzca Dni");
        usu1.setDniCliente(leer.nextInt());
    }

    public void ingresar(CuentaBancaria usu1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a Ingresar");
        double saldoNuevo = (usu1.getSaldoActual() + leer.nextDouble());
        usu1.setSaldoActual(saldoNuevo);
        System.out.println("Su saldo actual es " + usu1.getSaldoActual());
    }

    public void retirar(CuentaBancaria usu1) {

        Scanner leer = new Scanner(System.in);
         
                System.out.println(" Ingrese la cantidad a retirar");
        double saldoNuevo = (double) (usu1.getSaldoActual() - leer.nextDouble());
        
        if (saldoNuevo <= 0) {
            System.out.println("Saldo insuficiente, se retirará " + usu1.getSaldoActual());
            usu1.setSaldoActual(0);
        } else {
            usu1.setSaldoActual(saldoNuevo);
        }

        System.out.println("Su saldo actual es " + usu1.getSaldoActual());

    }
}

