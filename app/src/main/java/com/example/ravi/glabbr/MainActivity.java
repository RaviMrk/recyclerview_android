package com.example.ravi.glabbr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programminglist= (RecyclerView) findViewById(R.id.programinglist);


        programminglist.setLayoutManager(new LinearLayoutManager(this));
        String[] name={"player1","player2","player3","player4","player5","player6","player7","player8","player9","player10"};
        int[] image={R.drawable.ronaldo,R.drawable.football2,R.drawable.football3,R.drawable.football4,R.drawable.football5,R.drawable.fooball6,R.drawable.fooball6,R.drawable.football3,R.drawable.fooball6,R.drawable.football2};
        programminglist.setAdapter(new programingAdaptor(name,image));

    }
}
