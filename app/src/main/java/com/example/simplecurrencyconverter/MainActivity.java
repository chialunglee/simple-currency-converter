package com.example.simplecurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view) {
        EditText numberInput = (EditText) findViewById(R.id.numberInput);
        String originalInput = numberInput.getText().toString();
        try {
            double convertedInput = Double.parseDouble(originalInput);
            double result = convertedInput * 1.5;
            String outputText = String.format("%.2f", result);
            Toast.makeText(this, outputText, Toast.LENGTH_LONG).show();
        } catch (NumberFormatException e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
            System.out.println(e);
        }
    }
}