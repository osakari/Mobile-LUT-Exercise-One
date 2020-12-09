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
                int number1 = Integer.parseInt(firstNumEditText.getText().toString());
                int number2 = Integer.parseInt(secondNumEditText.getText().toString());
                int sum = number1 + number2;
                String result = Integer.toString(sum);

                resultTextView.setText(result);
            } catch (Exception exception) {
                // Do nothing... just clear the text view.
                resultTextView.setText("");
            }
        });
    }
}