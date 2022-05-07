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

public class register extends AppCompatActivity {
    EditText name,email,monum,pw,cpw;
    Button re;
    FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    register();
    }
    void register() {
        name = findViewById(R.id.name);
        email = findViewById(R.id.Email);
        monum = findViewById(R.id.mobilenumber);
        pw = findViewById(R.id.Password);
        cpw = findViewById(R.id.conPassword);
        re = (Button) findViewById(R.id.register);
        fAuth = FirebaseAuth.getInstance();

        if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), dashboard.class));
            finish();
        }

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // validate input field

                String Email =  email.getText().toString().trim();
                String password = pw.getText().toString().trim();

                if(TextUtils.isEmpty(Email)){
                    email.setError("Email is Required");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    pw.setError("Password is Required");
                    return;
                }

                if(password.length() < 6){
                    pw.setError("Password Must be >= 6 Characters");
                    return;
                }



                // register the user in firebase

                fAuth.createUserWithEmailAndPassword(Email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(register.this, "User Created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), login.class));
                        }else {
                            Toast.makeText(register.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }

        });
    }
}