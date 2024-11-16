package com.example.homepage; // Replace with your package name

import android.content.Intent;
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
        TextView learnMoreTextView = findViewById(R.id.learn_more_button);
        learnMoreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next activity when clicked
                Intent intent = new Intent(MainActivity.this, LearnMore.class); // Replace NextActivity.class with your desired activity
                startActivity(intent);
            }
        });
    }
}
