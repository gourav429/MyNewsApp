package com.example.mynewsapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Hry extends AppCompatActivity {

    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hry);

        imageButton = findViewById(R.id.imageButton);
    }

    public void haryana(View view){
        Intent in = new Intent(Hry.this,haryana.class);
        startActivity(in);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()){
            case R.id.about:
                //Intent in = new Intent(Timer.this,)
                // Log.i("Info","Dikh raha h na?");
                Intent in1 = new Intent(Hry.this,About.class);
                startActivity(in1);
                finish();
                return true;
            case R.id.logout:
                Intent in2 = new Intent(Hry.this,Login.class);
                startActivity(in2);
                finish();
                return true;
            default:
                return true;
        }

    }
}
