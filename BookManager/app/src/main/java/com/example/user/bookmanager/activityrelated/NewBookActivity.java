package com.example.user.bookmanager.activityrelated;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.bookmanager.R;
import com.example.user.bookmanager.entities.Book;
import com.example.user.bookmanager.tools.DatePickerFragment;

public class NewBookActivity extends AppCompatActivity implements DatePickerFragment.OnDateChangeListenerInterface{

    private TextView dateShow;
    private Book newBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_book);

        Button startDateButton;
        Button addBookButton;
        EditText titleEdit;

        startDateButton = findViewById(R.id.start_date);
        titleEdit = findViewById(R.id.title_field);
        dateShow = findViewById(R.id.date);
        addBookButton = findViewById(R.id.add_update_button);

        // TODO: 20-Dec-18 : campuri pentru fiecare editText si la final sa le pui pe toate intr-un Book obj, (apoi in parcelable?)
        // TODO: 20-Dec-18 : si dupa le trimiti spre db
        String title = titleEdit.getText().toString();

        addBookButton.setText(getResources().getString(getResources().getIdentifier("addButton","string",getPackageName())));

        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               displayDate();
            }
        });

        addBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToDb();
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

    // TODO: 04-Jan-19 trimiti obiect Book la DB 
    public void sendDataToDb(){
        
    }
}



