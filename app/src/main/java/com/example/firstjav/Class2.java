package com.example.firstjav;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Class2 extends AppCompatActivity {

    EditText etUser;
    EditText etPass;
    Button btnsign;

    TextView tvSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2);

        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);

        tvSign = findViewById(R.id.tvSign);
        registerForContextMenu(tvSign);

        tvSign.setClickable(true);
        tvSign.setFocusable(true);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.option_menu, menu);
//        return true;
//    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.call) {
            Toast.makeText(this, "Call is selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.sms) {
            Toast.makeText(this, "SMS is selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }

//        if (item.getItemId()== R.id.setting){
//            Toast.makeText(this, "Setting is selected", Toast.LENGTH_SHORT).show();
//            return true;
//        }
//        else if(item.getItemId()== R.id.search){
//            Toast.makeText(this, "Search is selected", Toast.LENGTH_SHORT).show();
//            return true;
//        }
//        return false;
//    }

    public void onsign(View v){

    Toast t = Toast.makeText(this, etUser.getText().toString()+"\n"+etPass.getText().toString(), Toast.LENGTH_SHORT);
        t.show();

    }


}