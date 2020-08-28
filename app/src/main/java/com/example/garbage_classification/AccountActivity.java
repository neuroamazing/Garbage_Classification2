
package com.example.garbage_classification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Button Button_Sign_up = (Button)findViewById(R.id.button_sign_up);
        Button_Sign_up.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(AccountActivity.this,MainActivity.class);
                startActivity(intent);
            }

            });

    }
}

