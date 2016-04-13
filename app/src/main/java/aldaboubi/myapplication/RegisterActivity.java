package aldaboubi.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;

public class RegisterActivity extends Activity {

    TabHost tabHost;
    Spinner BloodTypeIn,BloodTypeReg,Gender1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("Indivisual");
        tabSpec1.setIndicator("Indivisual");
        tabSpec1.setContent(R.id.reg_indivisual);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("Medical Institutions");
        tabSpec2.setIndicator("Medical Institutions");
        tabSpec2.setContent(R.id.reg_medical_institutions);


        tabHost.addTab(tabSpec1);
        tabHost.addTab(tabSpec2);


        BloodTypeIn = (Spinner) findViewById(R.id.BloodType_SpIn);
        ArrayAdapter array1 = ArrayAdapter.createFromResource(this, R.array.choose_blood, android.R.layout.simple_list_item_single_choice);
        BloodTypeIn.setAdapter(array1);

        Gender1 = (Spinner) findViewById(R.id.Gender_Sp);
        ArrayAdapter array2 = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_dropdown_item_1line);
        Gender1.setAdapter(array2);



    }
}
