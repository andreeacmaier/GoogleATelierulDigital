package com.example.user.bookmanager.activityrelated;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.bookmanager.R;

public class NewBookActivity extends AppCompatActivity implements DatePickerFragment.OnDateChangeListenerInterface{

    private Button startDateButton;
    private TextView dateShow;
    private Button addBookButton;
    /*private String startDate;
    private int mYear;
    private int mMonth;
    private int mDay;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_book);

        startDateButton = findViewById(R.id.start_date);
        dateShow = findViewById(R.id.date);
        addBookButton = findViewById(R.id.add_update_button);

        addBookButton.setText(getResources().getString(getResources().getIdentifier("addButton","string",getPackageName())));

        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               displayDate();
            }
        });

    }

    @Override
    public void onDateChangeListener(String date) {
        dateShow.setText(date);
    }

    public void displayDate() {
        DialogFragment datePickerFragment = new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(), "datePicker");
    }
}



