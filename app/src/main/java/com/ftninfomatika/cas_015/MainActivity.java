package com.ftninfomatika.cas_015;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.grid);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_expandable_list_item_1,
                getNames());

        grid.setAdapter(adapter);
    }

    private List<String> getNames(){
        List<String> names = new ArrayList<>();

        for(int i = 1; i <31; i++) {
            names.add("Element " + i);

        }
    return names;

   }
}