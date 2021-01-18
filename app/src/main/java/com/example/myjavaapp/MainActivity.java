package com.example.myjavaapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(v -> {
            EditText firstNumEditText = findViewById(R.id.firstNumPlainText);
            EditText secondNumEditText = findViewById(R.id.secondNumPlainText);
            TextView resultTextView = findViewById(R.id.resultTextView);

            try {
                long number1 = Long.parseLong(firstNumEditText.getText().toString());
                long number2 = Long.parseLong(secondNumEditText.getText().toString());
                long sum = number1 + number2;
                String result = Long.toString(sum);

                resultTextView.setText(result);
            } catch (Exception exception) {
                String txt = "";

                // Do nothing... just clear the text view.
                resultTextView.setText(txt);
            }
        });
    }
}