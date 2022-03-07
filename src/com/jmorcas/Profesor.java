package com.jmorcas;

import java.util.List;

/**
 * @author: Juan Mora
 * @version: 07/03/2022
 */
public class Profesor extends Persona{
    /**
     * Atributos
     */
    List<Prestamo> prestamos;

    /**
     * Constructor de la clase profesor
     * @param numeroDeTelefono numero de telefono
     * @param nombre nombre del profesor
     * @param edad edad del profesor
     * @param prestamos prestamos que tiene el profesor
     */
    public Profesor(String numeroDeTelefono, String nombre, int edad, List<Prestamo> prestamos) {
        super(numeroDeTelefono, nombre, edad);
        this.prestamos = prestamos;
    }

    /**
     * Metodo toString
     * @return Datos de profesor
     */
    @Override
    public String toString() {
        return "Profesor{" +
                "numeroDeTelefono='" + numeroDeTelefono + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", prestamos=" + prestamos +
                '}';
    }
}
