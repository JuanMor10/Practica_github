package com.jmorcas;

/**
 * @author: Juan Mora
 * @version: 07/03/2022
 */
public class Persona {
    protected String numeroDeTelefono;
    public Persona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}