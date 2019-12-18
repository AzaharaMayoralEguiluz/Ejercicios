/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoralejer3academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Azahara Mayoral Eguiluz
 */
public class Academia {

    Curso curso1;
    Curso curso2;
    Curso curso3;

    public Academia() {//nada mas crear la academia instanciaria los tres cursos,es el constructor de academia

        curso1 = new Curso();
        curso2 = new Curso();
        curso3 = new Curso();//instanciamos a los cursos.Para poderlo utilizar

    }

    public void MesajeInicio() {
        System.out.println("Antes de meter a los alumnos hay que meter las plazas que se ofertan en cada curso.");
    }

    public void PlazasCurso1() {//como volver a pedir las plazas¿?

        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        try {
            System.out.println("Las plazas de este año para el curso1 son:");
            curso1.setPlazasOfertadas(Integer.parseInt(teclado.readLine()));

        } catch (IOException ex) {
            System.out.println("Error técnico contacte con su mantenimiento informático");
        } catch (NumberFormatException ex) {
            System.out.println("No es un dato correcto para el número de Plazas. Introduzca un dato correcto:");
        }

    }

    public void PlazasCurso2() {

        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        try {
            System.out.println("Las plazas de este año para el curso2 son:");
            curso2.setPlazasOfertadas(Integer.parseInt(teclado.readLine()));

        } catch (IOException ex) {
            System.out.println("Error técnico contacte con su mantenimiento informático");
        } catch (NumberFormatException ex) {
            System.out.println("No es un dato correcto para el número de Plazas. Introduzca un dato correcto:");
        }

    }

    public void PlazasCurso3() {

        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        try {
            System.out.println("Las plazas de este año para el curso3 son:");
            curso3.setPlazasOfertadas(Integer.parseInt(teclado.readLine()));

        } catch (IOException ex) {
            System.out.println("Error técnico contacte con su mantenimiento informático");
        } catch (NumberFormatException ex) {
            System.out.println("No es un dato correcto para el número de Plazas. Introduzca un dato correcto:");
        }

    }

    public void Matriculacion() {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        int cursoIntroducido = 0;
        int edadIntroducida = 0;
        try {

            while (!(cursoIntroducido == -1)
                    && !((curso1.getPlazasOfertadas() + curso2.getPlazasOfertadas() + curso3.getPlazasOfertadas())
                    == (curso1.getPlazasOcupadas() + curso2.getPlazasOcupadas() + curso3.getPlazasOcupadas()))) {
                System.out.println("Introduzca el curso en el que desea matricularse");
                cursoIntroducido = Integer.parseInt(teclado.readLine());

                if (cursoIntroducido == 1 || cursoIntroducido == 2 || cursoIntroducido == 3) {
                    System.out.println("Introduzca la edad del alumno:");
                    edadIntroducida = Integer.parseInt(teclado.readLine());

                    switch (cursoIntroducido) {

                        case 1:
                            if (!(curso1.getPlazasOcupadas() == curso1.getPlazasOfertadas())) {
                                curso1.setPlazasOcupadas(curso1.getPlazasOcupadas() + 1);
                                curso1.setEdadAcumulada(curso1.getEdadAcumulada() + edadIntroducida);
                            } else {
                                System.out.println("No quedan plazas en el curso1, vuelva a registrarse");
                            }
                            break;
                        case 2:
                            if (!(curso2.getPlazasOcupadas() == curso2.getPlazasOfertadas())) {
                                curso2.setPlazasOcupadas(curso2.getPlazasOcupadas() + 1);
                                curso2.setEdadAcumulada(curso2.getEdadAcumulada() + edadIntroducida);
                            } else {
                                System.out.println("No quedan plazas en el curso2, vuelva a registrarse");
                            }
                            break;
                        case 3:
                            if (!(curso3.getPlazasOcupadas() == curso3.getPlazasOfertadas())) {
                                curso3.setPlazasOcupadas(curso3.getPlazasOcupadas() + 1);
                                curso3.setEdadAcumulada(curso3.getEdadAcumulada() + edadIntroducida);
                            } else {
                                System.out.println("No quedan plazas en el curso3, vuelva a registrarse");
                            }
                            break;
                    }
                }
            }

        } catch (IOException ex) {
            System.out.println("Error técnico consulte con el personal de mantenimiento informatico");
        }

    }

    public void Informe() {
        System.out.println("La matriculacion de este año ha sido cerrada");
        System.out.println("En el curso1 hay un total de " + curso1.getPlazasOcupadas() + "alumnos");
        System.out.println("En el curso2 hay un total de " + curso2.getPlazasOcupadas() + " alumnos");
        System.out.println("En el curso3 hay un total de " + curso3.getPlazasOcupadas() + " alumnos");
        System.out.println("Esto hace un total de " + (curso1.getPlazasOcupadas() + curso2.getPlazasOcupadas() + curso3.getPlazasOcupadas())
                + " plazas ocupadas en todos los cursos.");
        System.out.println("En el curso1 la edad media es: " + (curso1.getEdadAcumulada() / curso1.getPlazasOcupadas()));
        System.out.println("En el curso2 la edad media es: " + (curso2.getEdadAcumulada() / curso2.getPlazasOcupadas()));
        System.out.println("En el curso3 la edad media es: " + (curso3.getEdadAcumulada() / curso3.getPlazasOcupadas()));
        System.out.println("El porcentage de ocupacion en el curso1 es: " + (curso1.getPlazasOcupadas()/curso1.getPlazasOfertadas())*100);
        System.out.println("El porcentage de ocupacion en el curso2 es: " + (curso1.getPlazasOcupadas()/curso1.getPlazasOfertadas())*100);
        System.out.println("El porcentage de ocupacion en el curso3 es: " + (curso1.getPlazasOcupadas()/curso1.getPlazasOfertadas())*100);
    }

}


