package aldaboubi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class A_DonateBlood extends AppCompatActivity {
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_donate_blood);

        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("Indivisual");
        tabSpec1.setIndicator("Indivisual");
        tabSpec1.setContent(R.id.indivisual_DonateA1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("Hospital");
        tabSpec2.setIndicator("Hospital");
        tabSpec2.setContent(R.id.hospital_DonateA1);


        tabHost.addTab(tabSpec1);
        tabHost.addTab(tabSpec2);


    }
}
