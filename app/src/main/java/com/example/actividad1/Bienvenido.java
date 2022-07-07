package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.actividad1.databinding.ActivityBienvenidoBinding;

public class Bienvenido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBienvenidoBinding binding = ActivityBienvenidoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombreusuario");


        binding.txtGetusuario.setText(nombre);

    }
}