package com.jmorcas;

/**
 * @author: Juan Mora y Agustin Barragan Lara
 * @version: 07/03/2022
 */

public class Persona {
    /**
     * Dejo el atributo protected
     * y he añadido de la clase Profesor sus dos atributos
     * String nombre, el cual le he puesto nombre en vez de str e int edad
     */
    protected String numeroDeTelefono;
    String nombre;
    int edad;

    public Persona(String numeroDeTelefono, String nombre, int edad) {
        super();
        this.numeroDeTelefono = numeroDeTelefono;
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Creo el getNumeroDeTelefono
     *
     * @return devuelve el numero de telefono
     */
    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    /**
     * Creo el setNumeroDeTelefono
     *
     * @param numeroDeTelefono paso por parametro el numeroDeTelefono
     */
    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

}
