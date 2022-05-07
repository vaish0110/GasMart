package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {
    Button wallet, Help, findUs, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    void buttonOnclick(){
       wallet=findViewById(R.id.wallet);
       Help=findViewById(R.id.help);
       findUs=findViewById(R.id.findus);
       logout=findViewById(R.id.logout);

       wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(profile.this,wallet.class);
                startActivity(intent);
            }
        });
        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(profile.this,help.class);
                startActivity(intent);
            }
        });
        findUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(profile.this,findUs.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(profile.this,login.class);
                startActivity(intent);
            }
        });
    }
}
