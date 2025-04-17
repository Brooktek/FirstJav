package com.example.firstjav;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.firstjav.databinding.ActivityDrinkcataBinding;
import com.example.firstjav.databinding.ActivityIntentBinding;
import com.example.firstjav.databinding.ActivityListBinding;

public class Drinkcata extends AppCompatActivity {
    ActivityDrinkcataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDrinkcataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter<Drink> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Drink.drinks);

        binding.lbDirinks.setAdapter(adapter);

        binding.lbDirinks.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, Drinkdetail.class);
            intent.putExtra("id",position);
            startActivity(intent);
        });

    }
}