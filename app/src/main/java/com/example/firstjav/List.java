package com.example.firstjav;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.firstjav.databinding.ActivityIntentBinding;
import com.example.firstjav.databinding.ActivityListBinding;

public class List extends AppCompatActivity {

    ActivityListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        binding.listItem.setOnItemClickListener((parent,view,position,id)->{
            if (position == 0) {
            Intent i = new Intent(this, Drinkcata.class);
            startActivity(i);
            }
        });
    }
}