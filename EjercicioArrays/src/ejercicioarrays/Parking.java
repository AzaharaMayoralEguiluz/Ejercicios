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
        //plazas[3] = "Ocupado"; para inicializar una plaza a ocupada 

        System.out.println("NºPlaza-Estado");
        for (nplaza = 0; nplaza < plazas.length; nplaza++) {
            System.out.println(nplaza + "   -   " + plazas[nplaza]);
        }
//asignar la primera plaza libre

    }
    /**
     * busqueda de primer lugar libre
     * @return el valor libre o -1 en caso contrario
     */
    public int busquedaSecuencial(){//busqueda secuencial
        
            int nplaza=0;
             boolean encontrado  = false;
   
   
        while(!encontrado && nplaza<plazas.length){
              if (plazas[nplaza].equalsIgnoreCase("Libre")) {
                 encontrado = true;

             } else {
             nplaza++;}
         }
         if(nplaza==plazas.length){
            nplaza = -1;
         }
         return nplaza;
}
    /**
     * Para buscar el primer sitio libre oara un coche
     */
    public void entradaDeCoches(){
        int nplaza=busquedaSecuencial();//this. no es necesario en este caso concreto, pero si quieres puedes ponerlo
        
        if(nplaza==-1){
            System.out.println("Parking completo");}
        
        else{
            plazas[nplaza]="Ocupado";
             System.out.println("la plaza asignada es: "+ nplaza);
        }
    }
}
