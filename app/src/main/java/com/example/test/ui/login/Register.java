package com.example.test.ui.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.example.test.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText firstName = findViewById(R.id.editTextTextPersonName);
        EditText lastName = findViewById(R.id.editTextTextPersonName2);
        Button regUserInfo= findViewById(R.id.registerInfo);
        regUserInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(!TextUtils.isEmpty(firstName.getText()) && !TextUtils.isEmpty(lastName.getText()))
                        startActivity(new Intent(Register.this,LoginActivity.class));
                    else
                        Toast.makeText(getApplicationContext(),"Fill login credentials", Toast.LENGTH_SHORT).show();
                }
        });


    }

}
