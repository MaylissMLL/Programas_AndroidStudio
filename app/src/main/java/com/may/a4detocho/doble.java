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

public class doble extends Fragment implements View.OnClickListener {
    private EditText editaditoDoble;
    private MaterialButton calcularD, regresarD;
    private Clasesita operaciones;
    private TextView textResultadoDoble;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_doble, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textResultadoDoble = view.findViewById(R.id.textResultadoDoble);
        editaditoDoble = view.findViewById(R.id.editaditoDoble);
        editaditoDoble.setOnClickListener(this);

        calcularD = view.findViewById(R.id.CalcularD);
        calcularD.setOnClickListener(this);

        regresarD = view.findViewById(R.id.RegresarD);
        regresarD.setOnClickListener(this);

        operaciones = new Clasesita();

    }

    @Override
    public void onClick(View v) {
        String cadenita = editaditoDoble.getText().toString();

        if (v.getId() == R.id.CalcularD) {
            if (!cadenita.isEmpty()) {
                operaciones.setNumero(Integer.parseInt(cadenita));
                String resultado;
                resultado = operaciones.ResultadoDoble();
                textResultadoDoble.setText(resultado);
            } else {
                textResultadoDoble.setText("Por favor, ingresa un número");
            }
        } else if (v.getId() == R.id.RegresarD) {
            Navigation.findNavController(v).navigate(R.id.inicio);
        }
    }
}