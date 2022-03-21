package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<Cake> listCake;
        CustomListAdapter listAdapter;


        listCake = new ArrayList<>();
        listView = findViewById(R.id.idlistview);

        listCake.add(new Cake("Tasty donut","spicy donut tasty family",R.drawable.tasty_donut_1,10));
        listCake.add(new Cake("Pink donut","spicy donut tasty family", R.drawable.donut_yellow_1,20));
        listCake.add(new Cake("Floating donut","spicy donut tasty family",R.drawable.green_donut_1,30));
        listCake.add(new Cake("Tasty donut","spicy donut tasty family",R.drawable.donut_red_1,10));

        listAdapter = new CustomListAdapter(listCake,R.layout.list_item_layout,MainActivity.this);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // System.out.println(i);
                if (i==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            }
        });

    }
}