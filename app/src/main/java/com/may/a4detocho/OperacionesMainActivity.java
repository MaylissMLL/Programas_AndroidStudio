package com.may.a4detocho;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.button.MaterialButton;

public class OperacionesMainActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialButton btnSuma, btnResta, btnMultiplicacion, btnDivision, regresar;
    FragmentTransaction transaction;

    suma oSuma;
    resta oResta;
    multiplicacion oMultiplicacion;
    division oDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_operaciones);

        btnSuma = findViewById(R.id.BtnSuma);
        btnResta = findViewById(R.id.BtnResta);
        btnMultiplicacion = findViewById(R.id.BtnMultiplicacion);
        btnDivision = findViewById(R.id.BtnDivision);

        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMultiplicacion.setOnClickListener(this);
        btnDivision.setOnClickListener(this);

        regresar = findViewById(R.id.RegresarOperaciones);
        regresar.setOnClickListener(this);

        oSuma = new suma();
        oResta = new resta();
        oMultiplicacion = new multiplicacion();
        oDivision = new division();
    }

    @Override
    public void onClick(View v) {
        transaction = getSupportFragmentManager().beginTransaction();

        if (v.getId() == R.id.BtnSuma) {
            transaction.replace(R.id.ContenedorFragmentos, oSuma);
        } else if (v.getId() == R.id.BtnResta) {
            transaction.replace(R.id.ContenedorFragmentos, oResta);
        } else if (v.getId() == R.id.BtnMultiplicacion) {
            transaction.replace(R.id.ContenedorFragmentos, oMultiplicacion);
        } else if (v.getId() == R.id.BtnDivision) {
            transaction.replace(R.id.ContenedorFragmentos, oDivision);
        } else if (v.getId() == R.id.RegresarOperaciones) {
            finish();
            return;
        }
        transaction.commit();
    }
}