package com.may.a4detocho;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listita;
    ArrayList<String> retornaditos = new ArrayList<>();
    Caratula programitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        programitas = new Caratula();
        retornaditos = programitas.regresa();

        listita = findViewById(R.id.vistitas);
        listita.setOnItemClickListener(this);

        ArrayAdapter<String> adaptadito = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                retornaditos
        );
        listita.setAdapter(adaptadito);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;

        if (position == 0) {
            intent = new Intent(this, AnimacionesActivity.class);

        } else if (position == 1) {
            intent = new Intent(this, OperacionesMainActivity.class);

        } else if (position == 2) {
            intent = new Intent(this, TCPMainActivity.class);

        } else {
            return;
        }
        startActivity(intent);
    }
}