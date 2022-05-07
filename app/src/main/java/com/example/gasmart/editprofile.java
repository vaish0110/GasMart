package com.example.gasmart;

import static com.example.gasmart.R.id.photo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class editprofile extends AppCompatActivity {
    EditText name,address,mobileNumber;
    Button save,reAcc;
ImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);
    onclick();
    }
    void onclick() {
        name= findViewById(R.id.PersonName);
        address = findViewById(R.id.address);
        mobileNumber= findViewById(R.id.mobilenumber);
       photo= (ImageView) findViewById(R.id.photo) ;
        save = (Button) findViewById(R.id.buttonsave);
        reAcc = (Button) findViewById(R.id.buttonremove);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Toast.makeText(editprofile.this, "Edit profile Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(editprofile.this, profile.class);
                    startActivity(intent);

            }

        });
    }
}