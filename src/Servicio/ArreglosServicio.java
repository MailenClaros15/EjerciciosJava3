/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

/**
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes
 * métodos: Método inicializarA recibe un arreglo por parámetro y lo inicializa
 * con números aleatorios. Método mostrar recibe un arreglo por parámetro y lo
 * muestra por pantalla. Método ordenar recibe un arreglo por parámetro y lo
 * ordena de mayor a menor. Método inicializarB copia los primeros 10 números
 * del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del
 * arreglo B con 0.5. En el Main nuevamente: inicializar A, mostrar A, ordenar
 * A, inicializar B, mostrar A y B.
 *
 * @author Edgardo
 */
public class ArreglosServicio {

    public void inicializarA(double[] A) {

        for (int i = 0; i < 50; i++) {
            A[i] = (int) (Math.random() * 10);
        }
    }

    public void mostrar(double[] A) {
        for (int i = 0; i < 50; i++) {

            System.out.print("[" + A[i] + "]");
        }
    }
//Método ordenar recibe un arreglo por parámetro y lo
 // ordena de mayor a menor.
    public void ordenar(double []A){
        for (int i = 0; i < 50; i++) {
        Arrays.sort(A);
   System.out.println("[" + A[i] + "]");
    }
    }
    //Método inicializarB copia los primeros 10 números
 // del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del
 // arreglo B con 0.5. En el Main nuevamente: inicializar A, mostrar A, ordenar
 // A, inicializar B, mostrar A y B.
   public void inicializarB(double[]A,double []B){
       for (int i = 0; i < 10; i++) {
           B[i]=(double) (A[i]);
          System.out.print("[" + B[i] + "]"); 
       }
       for (int i = 10; i < 20; i++) {
           B[i]=(double)(Math.random() * 0.5);
           System.out.print("[" + B[i] + "]");
       } 
      
   } 
}
