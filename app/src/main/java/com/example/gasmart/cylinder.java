package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class cylinder extends AppCompatActivity {
        ImageView litrobig, laugfsbig, laugfsmedium, litromedium, litrosmall, laugfssmall;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cylinder);

            buttonClick();
        }
        void buttonClick(){
            litrobig=findViewById(R.id.litrobig);
            laugfsbig=findViewById(R.id.laugfsbig);
            laugfsmedium=findViewById(R.id.laugfsmedium);
            litromedium=findViewById(R.id.litromedium);
            litrosmall=findViewById(R.id.litrosmall);
            laugfssmall=findViewById(R.id.laugfssmall);

            litrobig.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(com.example.gasmart.cylinder.this,cylinderView.class);
                    startActivity(intent);
                }
            });
            laugfsbig.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(com.example.gasmart.cylinder.this,cylinderView.class);
                    startActivity(intent);
                }
            });
            laugfsmedium.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(com.example.gasmart.cylinder.this,cylinderView.class);
                    startActivity(intent);
                }
            });
            litromedium.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(com.example.gasmart.cylinder.this,cylinderView.class);
                    startActivity(intent);
                }
            });
            litrosmall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(com.example.gasmart.cylinder.this,cylinderView.class);
                    startActivity(intent);
                }
            });
            laugfssmall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(com.example.gasmart.cylinder.this,cylinderView.class);
                    startActivity(intent);
                }
            });

        }
}

