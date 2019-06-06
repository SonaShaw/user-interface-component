package com.example.admin.app32_user_interface_component;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by admin on 2/16/2018.
 */

public class SecondActivity extends AppCompatActivity{

    String[] courseName = {"Android Developement", "Game Developement", "Web Developement", "java Developement",
                            "ios Developement", "Software Developement", "PC Game Developement"};

    ArrayAdapter<String> arrayAdapter;

    TextView txt1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt1.setText("another project created for app 33");
        arrayAdapter = new ArrayAdapter<String>(SecondActivity.this,R.layout.second_activity);
       // setListAdapter(arrayAdapter);
    }
}
