package aldaboubi.myapplication;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;


public class My_ProfileActivity extends AppCompatActivity {
    DrawerLayout profileLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    ImageButton request;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);

        // Drawer Navigation
        // set new ToolBar
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

        // create Drawer Navigation in My Profile Layout
            profileLayout = (DrawerLayout) findViewById(R.id.myProfile_layout);
            actionBarDrawerToggle = new ActionBarDrawerToggle(this, profileLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
            profileLayout.setDrawerListener(actionBarDrawerToggle);
        // END create Drawer Navigation in My Profile Layout
        // Drawer Navigation

        // image Button go to RecieveActivity
        request = (ImageButton) findViewById(R.id.request);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent req = new Intent(My_ProfileActivity.this, RecieveActivity.class);
                startActivity(req);
            }
        });
        // image Button go to RecieveActivity
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();

    }




}
