package com.may.a4detocho;

public class Clasesita {
    int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String ResultadoDoble() {
        return "El doble de " + numero + " es " + (numero * 2);
    }

    public String ResultadoTriple() {
        return "El triple de " + numero + " es " + (numero * 3);
    }

    public String ResultadoCuadruple() {
        return "El cuádruple de " + numero + " es " + (numero * 4);
    }
}
