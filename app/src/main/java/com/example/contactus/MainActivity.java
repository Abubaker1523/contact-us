
  package com.example.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {

        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button Send, buttonwpk, buttonwus, buttonword, buttonsite;

            Send = findViewById(R.id.button2);
            Send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Set recipient email address
                    String recipient = "bsef20a516@pucit.edu.pk";
                    EditText text = (EditText) findViewById(R.id.simpleEditText);
                    String title = text.getText().toString();
// Set email subject
                    String subject = title;

// Set email body
                    EditText text2 = (EditText) findViewById(R.id.simpleEditText1);
                    String body = text2.getText().toString();


// Create email intent
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.setType("text/plain");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{recipient});
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
                    emailIntent.putExtra(Intent.EXTRA_TEXT, body);

// Launch email client
                    startActivity(Intent.createChooser(emailIntent, "Send email..."));


                }
            });
            buttonwpk = findViewById(R.id.sendpk1);
            buttonwpk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String phoneNumber = "+923004696284";




// Create the intent with the appropriate action and data

                    // Create the intent with the appropriate action and data
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber));
                    intent.setPackage("com.whatsapp");

// Launch the intent
                    startActivity(intent);
                }
            });

            buttonwus = findViewById(R.id.button5);
            buttonwus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String phoneNumber = "+923004696284";




// Create the intent with the appropriate action and data

                    // Create the intent with the appropriate action and data
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber));
                    intent.setPackage("com.whatsapp");

// Launch the intent
                    startActivity(intent);
                }
            });

            buttonword = findViewById(R.id.button6);
            buttonword.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String phoneNumber = "+923004696284";




// Create the intent with the appropriate action and data

                    // Create the intent with the appropriate action and data
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber));
                    intent.setPackage("com.whatsapp");

// Launch the intent
                    startActivity(intent);
                }
            });

            buttonsite = findViewById(R.id.button7);
            buttonsite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String site = "https://www.google.com";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(site));
                    startActivity(intent);

                }
            });
        }}



