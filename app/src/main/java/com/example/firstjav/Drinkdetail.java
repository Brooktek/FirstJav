package com.example.firstjav;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.firstjav.databinding.ActivityDrinkcataBinding;
import com.example.firstjav.databinding.ActivityDrinkdetailBinding;

public class Drinkdetail extends AppCompatActivity {

    ActivityDrinkdetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDrinkdetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int id = getIntent().getIntExtra("id", 0);
        binding.tvtitle.setText(Drink.drinks[id].getName());
        binding.tvdes.setText(Drink.drinks[id].getDescription());
        binding.imageView2.setImageResource(Drink.drinks[id].getPhoto());

    }
}