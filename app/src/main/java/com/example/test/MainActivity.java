package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        EditText nom = findViewById(R.id.editnom);
        EditText email = findViewById(R.id.editEmailAddress);
        EditText phone = findViewById(R.id.editPhone);
        EditText address = findViewById(R.id.editaddress);
        Spinner ville = findViewById(R.id.villes);
        Button Envoyer = findViewById(R.id.button);

        Envoyer.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this , MainActivity2.class);
            intent.putExtra("Nom et Prenom" , nom.getText().toString());
            intent.putExtra("Adresse" , address.getText().toString());
            intent.putExtra("Email" , email.getText().toString());
            intent.putExtra("Phone" , phone.getText().toString());
            intent.putExtra("Ville", ville.getSelectedItem().toString());


            startActivity(intent);

        });

    }
}