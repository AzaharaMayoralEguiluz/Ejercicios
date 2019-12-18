package ejercicioarrays;

/**
 *
 * @author Azahara Mayoral
 */
public class Parking {

    String[] plazas;

    public Parking() {
        plazas = new String[100];
    }

    public Parking(int numeroPlazas) {//no es necesario, esto seria para realizar pruebas

        plazas = new String[numeroPlazas];
    }

    public void inicializarPlazas() {// nplazas solo existe dentro del bucle, cuando sales del mismo desapareceria

        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            plazas[nplaza] = "LIBRE";
        }
    }

    public void estadoPlazas() {//para visalizar el estado del parking, es el mismo proceso que inicializar a libre pero visualizando

        int nplaza;
        //plazas[3] = "OCUPADA"; para inicializar una plaza a ocupada 

        System.out.println("NºPlaza-Estado");
        for (nplaza = 0; nplaza < plazas.length; nplaza++) {
            System.out.println(nplaza + "   -   " + plazas[nplaza]);
        }

    }
    //asignar la primera plaza libre
    

}
