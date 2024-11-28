package com.example.week7; // Replace with your package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.week7.MainActivity;
import com.example.week7.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        ImageView logo = findViewById(R.id.logo);
        TextView tagline = findViewById(R.id.tagline);

        // Fade-in animation
        AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(2000); // Duration in milliseconds
        fadeIn.setFillAfter(true); // Keep the view visible after animation
        logo.startAnimation(fadeIn);
        tagline.startAnimation(fadeIn);

        // Navigate to dashboard after 3 seconds
        logo.postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class); // Replace with your dashboard activity
            startActivity(intent);
            finish(); // Close the splash activity
        }, 3000); // Delay in milliseconds
    }
}
