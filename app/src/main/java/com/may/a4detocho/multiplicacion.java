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

import com.google.android.material.button.MaterialButton;

public class multiplicacion extends Fragment implements View.OnClickListener {
    private EditText editadito1, editadito2;
    private MaterialButton btnResultadoM;
    private TextView resultadoMultiplicacion;
    private Clasesita2 operaciones;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_multiplicacion, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        resultadoMultiplicacion = view.findViewById(R.id.textResultadoMultiplicacion);
        editadito1 = view.findViewById(R.id.EditaditoMultiplicacion1);
        editadito1.setOnClickListener(this);

        editadito2 = view.findViewById(R.id.EditaditoMultiplicacion2);
        editadito2.setOnClickListener(this);

        btnResultadoM = view.findViewById(R.id.BtnResultadoMultiplicacion);
        btnResultadoM.setOnClickListener(this);

        operaciones = new Clasesita2();
    }

    @Override
    public void onClick(View v) {
        String cadenita1 = editadito1.getText().toString();
        String cadenita2 = editadito2.getText().toString();

        if (v.getId() == R.id.BtnResultadoMultiplicacion) {
            if (!cadenita1.isEmpty() && !cadenita2.isEmpty()) {
                int num1 = Integer.parseInt(cadenita1);
                int num2 = Integer.parseInt(cadenita2);

                operaciones.setNumero1(num1);
                operaciones.setNumero2(num2);

                resultadoMultiplicacion.setText(operaciones.ResultadoMultiplicacion());
            }
            else {
                resultadoMultiplicacion.setText("Por favor ingresa ambos números");
            }
        }
    }
}