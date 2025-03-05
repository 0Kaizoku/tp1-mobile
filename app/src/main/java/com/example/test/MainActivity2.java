package com.example.test;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


        TextView recapTextView = findViewById(R.id.recapTextView);


        String nomPrenom = getIntent().getStringExtra("Nom et Prenom");
        String email = getIntent().getStringExtra("Email");
        String adresse = getIntent().getStringExtra("Adresse");
        String phone = getIntent().getStringExtra("Phone");
        String ville = getIntent().getStringExtra("Ville");


        nomPrenom = (nomPrenom != null) ? nomPrenom : "N/A";
        email = (email != null) ? email : "N/A";
        adresse = (adresse != null) ? adresse : "N/A";
        phone = (phone != null) ? phone : "N/A";
        ville = (ville != null) ? ville : "N/A";


        String info = String.format(
                "Récapitulatif des informations\n\n" +
                        "Nom et prenom : %s\n" +
                        "Email : %s\n" +
                        "Téléphone : %s\n" +
                        "Adresse : %s\n" +
                        "Ville : %s",
                nomPrenom, email, phone, adresse, ville
        );


        recapTextView.setText(info);
    }
}
