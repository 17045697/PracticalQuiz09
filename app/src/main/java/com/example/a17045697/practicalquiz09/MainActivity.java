package com.example.a17045697.practicalquiz09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<formulaItems> alMathList;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath = findViewById(R.id.listViewMath);
        alMathList = new ArrayList<>();

        formulaItems item1 = new formulaItems("Area of rectangle","Length * Length","Formula Type is Area");
        formulaItems item2 = new formulaItems("Area of triangle","(Length of base x Length)/2","Formula Type is Area");
        formulaItems item3 = new formulaItems("Area of cube","Length * Length * Length","Formula Type is Volume");

        alMathList.add(item1);
        alMathList.add(item2);
        alMathList.add(item3);


        caMath = new CustomAdapter(this,R.layout.custom_list,alMathList);
        lvMath.setAdapter(caMath);


    }
}
