package aldaboubi.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;

public class RegisterActivity extends Activity {

    TabHost tabHost;

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














    }
}
