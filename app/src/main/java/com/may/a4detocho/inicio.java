package com.may.a4detocho;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.google.android.material.button.MaterialButton;

public class inicio extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MaterialButton botoncitoDoble = view.findViewById(R.id.btnDoble);
        botoncitoDoble.setOnClickListener(this);

        MaterialButton botoncitoTriple = view.findViewById(R.id.btnTriple);
        botoncitoTriple.setOnClickListener(this);

        MaterialButton botoncitoCuadruple = view.findViewById(R.id.btnCuadruple);
        botoncitoCuadruple.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnDoble) {
            Navigation.findNavController(v).navigate(R.id.doble);
        } else if (v.getId() == R.id.btnTriple) {
            Navigation.findNavController(v).navigate(R.id.triple);
        } else if (v.getId() == R.id.btnCuadruple) {
            Navigation.findNavController(v).navigate(R.id.cuadruple);
        }
    }
}