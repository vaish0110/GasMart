package com.example.gasmart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class login extends AppCompatActivity {
    EditText le;
    EditText pw;
    TextView fpw;
    Button login;
    FirebaseAuth fAuth;
    Button re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        le = findViewById(R.id.LogInEmail);
        pw = findViewById(R.id.LogInPassword);
        login = (Button) findViewById(R.id.login);
        fAuth = FirebaseAuth.getInstance();
        fpw = findViewById(R.id.ForgotPassword);
        re = (Button) findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = le.getText().toString().trim();
                String password = pw.getText().toString().trim();
                if (TextUtils.isEmpty(Email)) {
                    le.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(Email)) {
                    pw.setError("Password is Required");
                    return;
                }
                fAuth.signInWithEmailAndPassword(Email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(login.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), dashboard.class));
                        } else {
                            Toast.makeText(login.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), dashboard.class));
                        }
                    }
                });

            }
        });


        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }
        });


        fpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, forgotpassword.class);
                startActivity(intent);
            }
        });

    }
}