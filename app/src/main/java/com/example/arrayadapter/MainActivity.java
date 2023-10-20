package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] frdlist = {"Jimmy","Jaydeep","Chirag","Dishant","Thushar","Ashish","Rupin","Khilan","Yash","Kevin","Rushi","Raj","Heet","Rutvik","Sandeep","Akshay"};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /*
       Adapter:-Two Types Of Adapter.
       [1].Array Adapter [2].Custom Array Adapter

       [1].Array Adapter:-Only One & Only String Values.

       [2].Custom Array Adapter:-Multiple Values.

       [1].Array Adapter & [2].Custom Array Adapter
        1.ListView:-Whatsapp
        2.GridView:-Gallery
        3.RecyclerView:-Instagram Story & Post
        4.ViewPager:-Photo Swipe
        */


        listView = findViewById(R.id.listView);

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,R.layout.frd_list_layout,R.id.textView,frdlist);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String fname = frdlist[position];
                Toast.makeText(MainActivity.this, fname, Toast.LENGTH_SHORT).show();
            }
        });
    }
}