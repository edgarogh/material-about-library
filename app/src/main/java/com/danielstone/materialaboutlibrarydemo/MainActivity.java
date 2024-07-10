package com.danielstone.materialaboutlibrarydemo;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button fragmentButton = (Button) findViewById(R.id.fragment_button);
        fragmentButton.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, ExampleMaterialAboutFragmentActivity.class);
            startActivity(i);
        });

    }

    public void onActivityButtonPressed(View view) {
        Intent i = new Intent(MainActivity.this, ExampleMaterialAboutActivity.class);
        i.putExtra(ExampleMaterialAboutActivity.THEME_EXTRA, Integer.parseInt(view.getTag().toString()));
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent i = new Intent(this, ExampleMaterialAboutActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
