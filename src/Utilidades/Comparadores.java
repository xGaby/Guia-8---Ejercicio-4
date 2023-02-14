/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Gabriela
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return Double.compare(t2.getHoras(), t1.getHoras());
        }
    };

    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return Double.compare(t1.getHoras(), t2.getHoras());
        }
    };

    public static Comparator<Pelicula> ordenarPorTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getTitulo().compareTo(t2.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarPorDirectorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDirector().compareTo(t2.getDirector());
        }
    };
}
