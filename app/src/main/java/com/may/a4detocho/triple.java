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

public class triple extends Fragment implements View.OnClickListener {
    private EditText editaditoTriple;
    private MaterialButton calcularT, regresarT;
    private Clasesita operaciones;
    private TextView textResultadoTriple;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_triple, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textResultadoTriple = view.findViewById(R.id.textResultadoTriple);
        editaditoTriple = view.findViewById(R.id.editaditoTriple);
        editaditoTriple.setOnClickListener(this);

        calcularT = view.findViewById(R.id.CalcularT);
        calcularT.setOnClickListener(this);

        regresarT = view.findViewById(R.id.RegresarT);
        regresarT.setOnClickListener(this);

        operaciones = new Clasesita();
    }

    @Override
    public void onClick(View v) {
        String cadenita = editaditoTriple.getText().toString();

        if (v.getId() == R.id.CalcularT) {
            if (!cadenita.isEmpty()) {
                operaciones.setNumero(Integer.parseInt(cadenita));
                String resultado;
                resultado = operaciones.ResultadoTriple();
                textResultadoTriple.setText(resultado);
            } else {
                textResultadoTriple.setText("Por favor, ingresa un número");
            }
        } else if (v.getId() == R.id.RegresarT) {
            Navigation.findNavController(v).navigate(R.id.inicio);
        }
    }
}