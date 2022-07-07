package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.actividad1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText txt_nombre = binding.txtNombre;
        EditText txt_contrasenia = binding.txtContrasenia;
        EditText txt_repetirclave = binding.txtRepetirclave;
        Button btn_ingresar = binding.btnIngresar;

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txt_nombre.getText().toString();
                String clave = txt_contrasenia.getText().toString();
                String repclave = txt_repetirclave.getText().toString();

                if (clave.equals(repclave)){
                    if (clave.length()>4){






                        String nombreusuario = binding.txtNombre.getText().toString();
                        abrirActividad(nombreusuario);



                    }else{
                        Context context = MainActivity.this;
                        CharSequence text = "minimo 5 caracteres";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }


                }else{
                    Context context = MainActivity.this;
                    CharSequence text = "Las claves no coinciden";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }





            }
        });
    }
    private void abrirActividad(String nom){
        Intent intent = new Intent(this, Bienvenido.class);
        intent.putExtra("nombreusuario",nom);
        startActivity(intent);
    }
}