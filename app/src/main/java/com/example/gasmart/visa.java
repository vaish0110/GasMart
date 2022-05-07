package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class visa extends AppCompatActivity {

    Button edit,remove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewcard);
    register();
    }
    void register() {
       edit=(Button) findViewById(R.id.editcard);
        remove= (Button) findViewById(R.id.removecard);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(visa.this, editcard.class);
                startActivity(intent);

            }

        });
    }
}