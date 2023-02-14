/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class PeliculaServicio {

    private Scanner entrada;
    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {
        this.entrada = new Scanner(System.in).useDelimiter("\n");
        entrada.useLocale(Locale.US); // Leer . por . para decimales
        this.peliculas = new ArrayList();
    }

    public Pelicula crearPelicula() {

        System.out.println("Ingrese el título de la película: ");
        String titulo = entrada.next();

        System.out.println("Ingrese el director de la pelicula: ");
        String director = entrada.next();

        System.out.println("Ingrese la duración de la película en horas: ");
        double horas = entrada.nextDouble();

        return new Pelicula(titulo, director, horas);

    }

    public void agregarPeliculas(Pelicula p) {

        peliculas.add(p);

    }

    public void fabricaPeliculas() {

        System.out.println("Ingrese las películas.");
        Pelicula peliculaCreada = crearPelicula();
        agregarPeliculas(peliculaCreada);
        boolean bandera = false;

        while (bandera == false) {

            System.out.println("Desea seguir añadiendo peliculas: SI o NO");
            String respuesta = entrada.next();
            if (respuesta.equals("si")) {
                agregarPeliculas(crearPelicula());
            } else {
                bandera = true;
            }

        }

    }

    public void mostrarPeliculas() {

        System.out.println("TITULO\tDIRECTOR\tHORAS");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());

        }
    }

    public void mayores1hora() {

        System.out.println("Las películas con una duración mayor a 1 hora son: ");
        for (Pelicula aux : peliculas) {
            if (aux.getHoras() > 1) {
                System.out.println(aux.getTitulo());
            }

        }

    }

    public void ordenarDuracionAscendente() {
        peliculas.sort(Comparadores.ordenarPorDuracionAsc);
        mostrarPeliculas();
    }

    public void ordenarDuracionDescendente() {
        peliculas.sort(Comparadores.ordenarPorDuracionDesc);
        mostrarPeliculas();
    }

    public void ordenarTitulo() {
        peliculas.sort(Comparadores.ordenarPorTituloAsc);
        mostrarPeliculas();
    }

    public void ordenarDirector() {
        peliculas.sort(Comparadores.ordenarPorDirectorAsc);
        mostrarPeliculas();
    }

}
