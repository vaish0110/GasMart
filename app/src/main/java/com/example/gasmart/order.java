package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class order extends AppCompatActivity {
    Button pOrder;
    Button cOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        buttonClick();

    }

    void buttonClick() {
        pOrder = findViewById(R.id.pastorders);
        cOrder = findViewById(R.id.currentorders);


        pOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(order.this, pastorder.class);
                startActivity(intent);
            }
        });
        cOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(order.this, currentorder.class);
                startActivity(intent);
            }
        });
    }
}
