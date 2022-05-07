package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class accessories extends AppCompatActivity {
    ImageView pressure, regulator, burner, sim,arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);

        buttonClick();
    }
    void buttonClick(){
        pressure=findViewById(R.id.pressure);
        regulator=findViewById(R.id.regulator);
        burner=findViewById(R.id.burner);
        sim=findViewById(R.id.sim);
        arrow=findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(accessories.this,product.class);
                startActivity(intent);
            }
        });

        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(accessories.this,pressure.class);
                startActivity(intent);
            }
        });
        regulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(accessories.this,regulator.class);
                startActivity(intent);
            }
        });
        burner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(accessories.this,burner.class);
                startActivity(intent);
            }
        });
        sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(accessories.this,sim.class);
                startActivity(intent);
            }
        });

    }
}

