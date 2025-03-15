package com.example.firstjav;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Class extends AppCompatActivity {
 EditText To;
 EditText Sub;
 EditText Mess;
 Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        To = findViewById(R.id.TO);
        Sub = findViewById(R.id.Sub);
        Mess = findViewById(R.id.Mess);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                To.setText(Sub.getText().toString());

//                Toast.makeText(Class.this, To.getText(), Toast.LENGTH_SHORT).u();
//                Toast.makeText(Class.this, Sub.getText(), Toast.LENGTH_SHORT).show();
//                Toast.makeText(Class.this, Mess.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}