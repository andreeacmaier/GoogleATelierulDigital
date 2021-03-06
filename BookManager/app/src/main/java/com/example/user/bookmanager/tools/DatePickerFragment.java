package com.example.user.bookmanager.tools;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;


import com.example.user.bookmanager.R;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    public interface OnDateChangeListenerInterface{
        void onDateChangeListener(String date);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), R.style.datepicker,this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        // passing selected value to the MainActivity through onDateChangeListener method
        ((OnDateChangeListenerInterface) getActivity()).onDateChangeListener(String.valueOf(dayOfMonth) + "-" + String.valueOf(month) + "-" + String.valueOf(year));
    }
}
