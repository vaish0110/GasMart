package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class wallet extends AppCompatActivity {
    TextView addPM,viewCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        addPM=findViewById(R.id.addPayMet);
        viewCard=findViewById(R.id.viewCard);
        addPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wallet.this,addpaymentmethod.class);
                startActivity(intent);

            }

        });

        viewCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wallet.this,visa.class);
                startActivity(intent);

            }

        });
    }

}
