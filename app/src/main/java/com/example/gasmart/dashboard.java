package com.example.gasmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {
    ImageView product,orders,profile,setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        click();
    }
    void click(){
        product=findViewById(R.id.viewproduct);
        orders=findViewById(R.id.vieworder);
        profile=findViewById(R.id.viewprofile);
        setting=findViewById(R.id.viewsetting);

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(dashboard.this,product.class);
                startActivity(intent);
            }
        });
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(dashboard.this,order.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(dashboard.this,profile.class);
                startActivity(intent);
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(dashboard.this,dashboard.class);
                startActivity(intent);
            }
        });
    }
}
