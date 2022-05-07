package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class addcard extends AppCompatActivity {
    EditText cardNum,exDate,cvv,country,nickName;
    Button ne;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcard);
    register();
    }
    void register() {
        cardNum = findViewById(R.id.cardnumber);
        exDate = findViewById(R.id.expdate);
        cvv = findViewById(R.id.cvv);
        country = findViewById(R.id.country);
        nickName = findViewById(R.id.nickname);
        ne = (Button) findViewById(R.id.buttonnext);
        arrow=findViewById(R.id.arrow);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(addcard.this,wallet.class);
                startActivity(intent);
            }
        });

        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Toast.makeText(addcard.this, "Adding card Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(addcard.this, wallet.class);
                    startActivity(intent);

            }

        });
    }
}