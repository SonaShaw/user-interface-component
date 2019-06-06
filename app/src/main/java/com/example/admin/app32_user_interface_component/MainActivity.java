package com.example.admin.app32_user_interface_component;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtValue;
    EditText edtValue;
    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;

    // adapters are the link between set of data and the AdapterView displays the data.
    // An AdapterView are viewgroups that displays child views given to it by an adapter.


    String[] courseName = {"Android Developement", "Web Developement", "Game Developent"};

    ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtValue = (TextView) findViewById(R.id.txtValue);
        edtValue = (EditText) findViewById(R.id.edtValue);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        Button btnApp33 = (Button) findViewById(R.id.btnApp33);

        txtValue.setText("Just Started");
        txtValue.setBackgroundColor(Color.BLUE);

        txtValue.setOnClickListener(MainActivity.this);
        edtValue.setOnClickListener(this);
        btnApp33.setOnClickListener(this);

        myAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,courseName);
        // see documentation for more information
        autoCompleteTextView.setAdapter(myAdapter);

        multiAutoCompleteTextView.setAdapter(myAdapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());





    }

    @Override
    public void onClick(View view) {             //  this class implements View.onClickListener.....

        switch (view.getId()){
            case R.id.txtValue :
                txtValue.setTextColor(Color.RED);
                break;
            case R.id.edtValue :
                txtValue.setBackgroundColor(Color.YELLOW);
                txtValue.setText(edtValue.getText());
            case R.id.btnApp33 :
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                startActivity(intent);

        }

    }
}
