/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Entidades.Persona2;
import Servicios.PersonaServicio2;

/**
 * Realizar una clase llamada Persona en el paquete de entidades que tengan los
 * siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer,
 * ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede
 * hacerlo. Agregar constructores, getters y setters.
 *
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. Metodo crearPersona(): el método crear persona, le pide
 * los valores de los atributos al usuario y después se le asignan a sus
 * respectivos atributos para llenar el objeto Persona. Además, comprueba que el
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deberá mostrar un mensaje
 *
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 * A continuación, en la clase main hacer lo siguiente:
 *
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. Por último,
 * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables(arrays), para después calcular un porcentaje de esas 4
 * personas cuantas están por debajo de su peso, cuantas en su peso ideal y
 * cuantos, por encima, y también calcularemos un porcentaje de cuantos son
 * mayores de edad y cuantos menores. Para esto, podemos crear unos métodos
 * adicionales.
 *
 *
 * @author Edgardo
 */
public class PersonaAPP_2 {

    public static void main(String[] args) {
        PersonaServicio2 persona1 = new PersonaServicio2();
        int contPesoBajo = 0;
        int contPeso = 0;
        int contPesoAlto = 0;
        double pesoPersona;
        Persona2[] vector = new Persona2[4];
        for (int i = 0; i < 4; i++) {
            vector[i] = persona1.crearPersona();

        }
        for (int i = 0; i < 4; i++) {
            persona1.esMayorDeEdad(vector[i]);
            persona1.calcularIMC(vector[i]);

            if (persona1.calcularIMC(vector[i]) == -1) {
                contPesoBajo = contPesoBajo + 1;
                System.out.println("La persona está por debajo de su peso ");
            }
            if (persona1.calcularIMC(vector[i]) == 0) {

                contPeso = contPeso + 1;
                System.out.println("La persona está en su peso ideal ");
            } else {

                contPesoAlto = contPesoAlto + 1;
                System.out.println("La persona está en sobrepeso ");

            }
            
          
                   
                   
               }
        
        System.out.println("El porcentaje de gente que tiene peso bajo es: "+(contPesoBajo*0.25)+ "%");
        System.out.println("El porcentaje de gente que está en su peso ideal es: "+(contPeso*0.25)+ "%");
        System.out.println("El porcentaje de gente que tiene peso alto es: "+(contPesoAlto*0.25)+ "%");
           }
          

        }
   

