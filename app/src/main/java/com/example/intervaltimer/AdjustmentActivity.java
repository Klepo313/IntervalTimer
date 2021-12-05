package com.example.intervaltimer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;

public class AdjustmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjustment);

        /*EditText etSeconds = (EditText) findViewById(R.id.etSeconds);
        EditText etMinutes = (EditText) findViewById(R.id.etMinutes);
        EditText etHours = (EditText) findViewById(R.id.etHours);

        etSeconds.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "59")});
        etSeconds.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "59")});
        etSeconds.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "59")});*/



    }
}