package aldaboubi.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TabHost;

// Activity Because Return Default Style To Handle Action Bar
public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void register(View view){
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);


    }
    public void login(View view){
        Intent i = new Intent(this, My_ProfileActivity.class);
        startActivity(i);


    }
}
