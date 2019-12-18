/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarrays;

/**
 *
 * @author Azahara Mayoral
 */
public class EjercicioArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parking artesano;

        artesano = new Parking(5);// le paso 5 para las pruebas si no no hace falta pasarle nada
        artesano.inicializarPlazas();
        artesano.estadoPlazas();
    }

}
