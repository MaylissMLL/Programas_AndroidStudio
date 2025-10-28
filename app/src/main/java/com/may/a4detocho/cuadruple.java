package com.may.a4detocho;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.google.android.material.button.MaterialButton;

public class cuadruple extends Fragment implements View.OnClickListener {
    private EditText editaditoCuadruple;
    private MaterialButton calcularC, regresarC;
    private Clasesita operaciones;
    private TextView textResultadoCuadruple;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cuadruple, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textResultadoCuadruple = view.findViewById(R.id.textResultadoCuadruple);
        editaditoCuadruple = view.findViewById(R.id.editaditoCuadruple);
        editaditoCuadruple.setOnClickListener(this);

        calcularC = view.findViewById(R.id.CalcularC);
        calcularC.setOnClickListener(this);

        regresarC = view.findViewById(R.id.RegresarC);
        regresarC.setOnClickListener(this);

        operaciones = new Clasesita();
    }

    @Override
    public void onClick(View v) {
        String cadenita = editaditoCuadruple.getText().toString();

        if (v.getId() == R.id.CalcularC) {
            if (!cadenita.isEmpty()) {
                operaciones.setNumero(Integer.parseInt(cadenita));
                String resultado;
                resultado = operaciones.ResultadoCuadruple();
                textResultadoCuadruple.setText(resultado);
            } else {
                textResultadoCuadruple.setText("Por favor, ingresa un número");
            }
        } else if (v.getId() == R.id.RegresarC) {
            Navigation.findNavController(v).navigate(R.id.inicio);
        }
    }
}