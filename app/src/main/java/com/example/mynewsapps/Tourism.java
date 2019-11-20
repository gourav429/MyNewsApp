package com.example.mynewsapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Tourism extends AppCompatActivity {

    ListView listView;
    String[] states = {"Himachal","Kashmir","Jammu","Punjab","Haryana"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism);
        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,states);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                if(i==0) {
                    Intent in = new Intent(Tourism.this,Him.class);
                    startActivity(in);
                }
                if(i==1){
                    Intent in = new Intent(Tourism.this,Kas.class);
                    startActivity(in);
                }
                if(i==2){
                    Intent in = new Intent(Tourism.this,Jam.class);
                    startActivity(in);
                }
                if(i==3){
                    Intent in = new Intent(Tourism.this,Pun.class);
                    startActivity(in);
                }
                if(i==4){
                    Intent in = new Intent(Tourism.this,Hry.class);
                    startActivity(in);
                }
            }
        });
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
                Intent in1 = new Intent(Tourism.this,About.class);
                startActivity(in1);
                finish();
                return true;
            case R.id.logout:
                Intent in2 = new Intent(Tourism.this,Login.class);
                startActivity(in2);
                finish();
                return true;
            default:
                return true;
        }

    }
}
