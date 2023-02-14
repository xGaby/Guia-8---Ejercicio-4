/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Gabriela
 */
public class Pelicula {

    private String titulo;
    private String director;
    private double horas; //"," decimales

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        //return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
        return titulo + "\t" + director + "\t" + horas;
    }

}
