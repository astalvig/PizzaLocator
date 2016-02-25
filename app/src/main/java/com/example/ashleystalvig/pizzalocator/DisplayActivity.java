package com.example.ashleystalvig.pizzalocator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


import org.w3c.dom.Text;

public class DisplayActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView txtLocation = (TextView) findViewById(R.id.txtLocation);

        Intent i = getIntent();
        String loc = i.getStringExtra("location");
        txtLocation.setText(loc);

    }

}
