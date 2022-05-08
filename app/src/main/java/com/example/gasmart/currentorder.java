package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class currentorder extends AppCompatActivity {

    ImageView arrow,edit;
    Button cancelOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currentorder);

        edit=findViewById(R.id.edit);
        cancelOrder=findViewById(R.id.cancelorder);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentorder.this, editorder.class);
                startActivity(intent);
            }
        });
        cancelOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentorder.this, order.class);
                startActivity(intent);
            }
        });
    }



}
