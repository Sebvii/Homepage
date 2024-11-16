package com.example.homepage; // Replace with your package name

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Load your XML layout

        // Set an OnClickListener for the "Learn More" TextView
        TextView learnMoreTextView = findViewById(R.id.learn_more);
        learnMoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event here
                // For example, display a message or start a new activity
                // You can use a Toast or open a new Activity
                // Toast.makeText(MainActivity.this, "Learn More clicked", Toast.LENGTH_SHORT).show();

                // Or navigate to a new activity
                // Intent intent = new Intent(MainActivity.this, LearnMoreActivity.class);
                // startActivity(intent);
            }
        });
    }
}
