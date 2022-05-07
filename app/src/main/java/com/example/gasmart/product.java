package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class product extends AppCompatActivity {
    Button cylinder;
    Button refill;
    Button accessories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        buttonClick();
    }
    void buttonClick(){
        cylinder=findViewById(R.id.gascylinder);
        refill=findViewById(R.id.refill);
        accessories=findViewById(R.id.accessories);


        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(product.this,cylinder.class);
                startActivity(intent);
            }
        });
        refill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(product.this,refill.class);
                startActivity(intent);
            }
        });
        accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(product.this,accessories.class);
                startActivity(intent);
            }
        });

    }
}
