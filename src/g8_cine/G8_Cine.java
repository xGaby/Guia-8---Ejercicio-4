/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8_cine;

import Servicios.PeliculaServicio;
//import java.util.Locale;
/**
 *
 * @author Gabriela
 */
public class G8_Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Locale.setDefault(new Locale("en", "US")); //formato . por x , decimales
        PeliculaServicio s1 = new PeliculaServicio();

        s1.fabricaPeliculas();

        s1.mostrarPeliculas();

        s1.mayores1hora();
        
        //Ordenar
        System.out.println("Ordenamos por Duración Ascendente: ");
        s1.ordenarDuracionAscendente();

        System.out.println("Ordenamos por Duración Descendente: ");
        s1.ordenarDuracionDescendente();

        System.out.println("Ordenamos por Alfabeticamente Titulo: ");
        s1.ordenarTitulo();

        System.out.println("Ordenamos por Alfabeticamente Director: ");
        s1.ordenarDirector();

    }

}
