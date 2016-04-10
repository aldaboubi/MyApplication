package aldaboubi.myapplication;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RecieveActivity extends AppCompatActivity {
    DrawerLayout recieveLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Spinner bloodGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);

        // Drawer Navigation
            // set new ToolBar
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

        // create Drawer Navigation in Recieve Layout
            recieveLayout = (DrawerLayout) findViewById(R.id.recieve_layout);
            actionBarDrawerToggle = new ActionBarDrawerToggle(this, recieveLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
            recieveLayout.setDrawerListener(actionBarDrawerToggle);
        // END create Drawer Navigation in My Profile Layout
        // END Drawer Navigation

        // spinner blood group
        bloodGroup = (Spinner) findViewById(R.id.Blood_Group);
        ArrayAdapter array = ArrayAdapter.createFromResource(this, R.array.choose_blood, android.R.layout.simple_dropdown_item_1line);
        bloodGroup.setAdapter(array);
        // END spinner blood group
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();

    }
}
