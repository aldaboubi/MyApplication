package aldaboubi.myapplication;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;

public class seconedActivity extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_indivisual);


        // Create Date Picker
        final Calendar calender = Calendar.getInstance();
        final int year = calender.get(Calendar.YEAR);
        final int month = calender.get(Calendar.MONTH);
        final int day = calender.get(Calendar.DAY_OF_MONTH);

        final EditText txtBDate = (EditText) findViewById(R.id.bdate);

        txtBDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DatePickerDialog datepicker = new DatePickerDialog(seconedActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        txtBDate.setText(year+"/"+month+"/"+dayOfMonth);
                    }
                },day,month,year);
                datepicker.setTitle("Select BirthDate");
                datepicker.show();
            }
        });
        // END Create Date Picker

    }
}