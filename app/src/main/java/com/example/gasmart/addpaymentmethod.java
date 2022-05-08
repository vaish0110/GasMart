package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class addpaymentmethod extends AppCompatActivity {

    TextView credit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpaymentmethod);

   credit=findViewById(R.id.credit);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(addpaymentmethod.this,addcard.class);
                startActivity(intent);

            }

        });

    }
}
