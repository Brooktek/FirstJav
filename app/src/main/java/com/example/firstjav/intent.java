package com.example.firstjav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.firstjav.databinding.ActivityIntentBinding;

public class intent extends AppCompatActivity {

    ActivityIntentBinding binding;
    String[] data = {"brook", "abel", "bert"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayAdapter<String> adapte= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        binding.listItem.setAdapter(adapte);

        binding.textViewDisplay.setText(R.string.hello_b);

    }

   public void onStartClicked (View v){
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Welcom");
        Intent another= Intent.createChooser(intent,"Share viaa");
        if(another.resolveActivity(getPackageManager())!=null){
        startActivity(another);
        }
        else{
            Toast.makeText(this, "No app found", Toast.LENGTH_SHORT).show();
        }
    }

    public void onViewClicked (View v){
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://bbc.com"));
        startActivity(intent);


    }

}