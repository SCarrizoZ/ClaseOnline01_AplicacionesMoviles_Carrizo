package com.example.claseonline01_carrizo;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    String adminEmail = "admin@example.com";
    String adminPassword = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.BTN_LOGIN_ACCEDER);
        EditText email = findViewById(R.id.TXT_LOGIN_EMAIL);
        EditText password = findViewById(R.id.TXT_LOGIN_PASSWORD);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailText = email.getText().toString();
                String passwordText = password.getText().toString();

                if(emailText.equals(adminEmail) && passwordText.equals(adminPassword)){
                    Log.v("Inicio de sesión", "correcto");
                }
                else {
                    Log.v("Inicio de sesión", "fallido");
                    mostrarDialogo();
                };
            }
        });
    }
    private void mostrarDialogo() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_error_sesion, null);

        builder.setCancelable(true);
        builder.setView(dialogView);

        AlertDialog alerta = builder.create();
        alerta.show();

        Button btnAceptar = dialogView.findViewById(R.id.BTN_DIALOG_ACEPTAR);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alerta.dismiss(); // Cierra el cuadro de diálogo
            }
        });
    }
}