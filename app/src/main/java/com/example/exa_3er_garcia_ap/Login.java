package com.example.exa_3er_garcia_ap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public EditText etPasswordCG;
    public Button btnEntrarCG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//integracion de xml a java
        etPasswordCG = findViewById(R.id.etPasswordCG);
        btnEntrarCG=findViewById(R.id.btnEntrarCG);

        btnEntrarCG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( etPasswordCG.getText().toString().equals("uacm123")){
                    Intent intent1CG = new Intent(view.getContext(),MainActivity.class);
                    startActivityForResult(intent1CG,0);
                }else{//condicion falsa
                    Toast.makeText(Login.this,"Usuario y/o Contraseña incorrectos\nVerifica!!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}