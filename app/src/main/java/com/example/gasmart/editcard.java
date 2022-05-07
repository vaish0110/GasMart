package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class editcard extends AppCompatActivity {
    EditText cardNum,exDate,cvv,country,nickName;
    Button ne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editcard);
    register();
    }
    void register() {
        cardNum = findViewById(R.id.cardnumber);
        exDate = findViewById(R.id.expdate);
        cvv = findViewById(R.id.cvv);
        country = findViewById(R.id.country);
        nickName = findViewById(R.id.nickname);
        ne = (Button) findViewById(R.id.buttonnext);

        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Toast.makeText(editcard.this, "Adding card Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(editcard.this, wallet.class);
                    startActivity(intent);

            }

        });
    }
}