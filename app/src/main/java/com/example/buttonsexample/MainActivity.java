package com.example.buttonsexample;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.buttonsexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

// Creación de clase Binding.
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creación de una instancia de la clase Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Llamado al método para generar la vista.
        setContentView(binding.getRoot());

        // Enlace del botón del diseño mendiante view binding.
        binding.turnOffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Llamado del método creado para generar el mensaje tipo toast.
                showToast("Flight mode turned off");
            }
        });

        // Enlace del botón del diseño mendiante view binding.
        binding.upProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Llamado del método creado para generar el mensaje tipo toast.
                showToast("Updating profile...");
            }
        });

        // Enlace del botón del diseño mendiante view binding.
        binding.picSavedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Llamado del método creado para generar el mensaje tipo toast.
                showToast("Picture saved");
            }
        });

        // Enlace del botón del diseño mendiante view binding.
        binding.unlockLevelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Llamado del método creado para generar el mensaje tipo toast.
                showToast("Unlocked level 5");
            }
        });

        // Enlace del botón del diseño mendiante view binding.
        binding.level4CompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Llamado del método creado para generar el mensaje tipo toast.
                showToast("Level 4 completed");
            }
        });

        // Enlace del botón del diseño mendiante view binding.
        binding.musicPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Llamado del método creado para generar el mensaje tipo toast.
                showToast("Music paused");
            }
        });
    }

    // Creación de método para la generación de mensajes tipo toast.
    private void showToast(String message) {
        Toast.makeText(getBaseContext(), message, LENGTH_LONG).show();
    }
}
