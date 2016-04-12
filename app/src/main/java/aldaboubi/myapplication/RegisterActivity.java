package aldaboubi.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TabWidget;

public class RegisterActivity extends Activity {

    TabHost tabHost;
    Spinner BloodTypeIn,BloodTypeReg,Gender1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("Indivisual");
        tabSpec1.setIndicator("Indivisual");
        tabSpec1.setContent(R.id.indivisual_register);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("Hospital");
        tabSpec2.setIndicator("Hospital");
        tabSpec2.setContent(R.id.hospital_register);


        tabHost.addTab(tabSpec1);
        tabHost.addTab(tabSpec2);


        BloodTypeIn = (Spinner) findViewById(R.id.BloodType_SpIn);
        ArrayAdapter array1 = ArrayAdapter.createFromResource(this, R.array.choose_blood, android.R.layout.simple_dropdown_item_1line);
        BloodTypeIn.setAdapter(array1);

        BloodTypeIn = (Spinner) findViewById(R.id.BloodType_SpReg);
        BloodTypeIn.setAdapter(array1);


        Gender1 = (Spinner) findViewById(R.id.Gender_Sp);
        ArrayAdapter array2 = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_dropdown_item_1line);
        Gender1.setAdapter(array2);











    }
}
