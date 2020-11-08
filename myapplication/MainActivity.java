package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button login;
    private User currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.LogIn);

        email = (EditText)findViewById(R.id.EmailAddressInput);
        password = (EditText)findViewById(R.id.PasswordInput);
        login = (Button)findViewById(R.id.LogInSubmit);

        currentUser = new User(email.getText().toString(), password.getText().toString());

        if(User.loginCheck(currentUser)){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{

        }


    }
}