package com.may.a4detocho;

public class Clasesita2 {
    int numero1;
    int numero2;
    int resultado;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String ResultadoSuma() {
        resultado = numero1 + numero2;
        return "Resultado suma: " + resultado;
    }

    public String ResultadoResta() {
        resultado = numero1 - numero2;
        return "Resultado resta: " + resultado;
    }

    public String ResultadoMultiplicacion() {
        resultado = numero1 * numero2;
        return "Resultado multiplicación: " + resultado;
    }

    public String ResultadoDivision() {
        resultado = numero1 / numero2;
        return "Resultado división: " + resultado;
    }
}
