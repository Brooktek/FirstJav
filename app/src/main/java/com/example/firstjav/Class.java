package com.example.firstjav;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
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


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                To.setText(Sub.getText().toString());
//
//                Toast.makeText(Class.this, To.getText(), Toast.LENGTH_SHORT).u();
//                Toast.makeText(Class.this, Sub.getText(), Toast.LENGTH_SHORT).show();
//                Toast.makeText(Class.this, Mess.getText(), Toast.LENGTH_SHORT).show();
//
//            }
//        });
    }
    public void onsend(View v){
        PopupMenu pop = new PopupMenu(Class.this, v);
        pop.getMenuInflater().inflate(R.menu.popup, pop.getMenu());
        pop.show();
//        pop.setOnMenuItemClickListener(this);

        pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Toast.makeText(Class.this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}

