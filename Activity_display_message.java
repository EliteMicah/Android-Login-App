package com.example.rebooked1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_display_message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Retrieve the first and last names from the intent
        Intent intent = getIntent();
        String messageFirstName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_FIRST);
        String messageLastName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_LAST);

        // Create a welcome message
        String welcomeMessage = "The following contact has been added!\n" + messageFirstName + " " + messageLastName + "!";

        // Display the welcome message in a TextView or another UI element
        TextView textViewWelcome = findViewById(R.id.contactAddedText);
        textViewWelcome.setText(welcomeMessage);
    }
}
