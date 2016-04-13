package aldaboubi.myapplication;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class Reg_Indivisual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg_indivisual);



        // Create Date Picker
        final Calendar calender = Calendar.getInstance();
        final int year = calender.get(Calendar.YEAR);
        final int month = calender.get(Calendar.MONTH);
        final int day = calender.get(Calendar.DAY_OF_MONTH);

        final EditText txtBDate = (EditText) findViewById(R.id.bdate);

        txtBDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DatePickerDialog datepicker = new DatePickerDialog(Reg_Indivisual.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        txtBDate.setText(year + "/" + month + "/" + dayOfMonth);
                    }
                }, day, month, year);
                datepicker.setTitle("Select BirthDate");
                datepicker.show();
            }
        });
        // END Create Date Picker




    }
}
