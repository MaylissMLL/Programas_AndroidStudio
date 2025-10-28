package com.may.a4detocho;

import java.util.ArrayList;

public class Caratula {
    private ArrayList<String> cadenitas;

    public Caratula() {
        cadenitas = new ArrayList<>();
        cadenitas.add("1. Programa de Animaciones");
        cadenitas.add("2. Programa de Operaciones con Fragmentos");
        cadenitas.add("3. Programa de Múltiplos");
    }

    public ArrayList<String> regresa() {
        return cadenitas;
    }
}
