package com.example.ashleystalvig.pizzalocator;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.ashleystalvig.pizzalocator.R;


import org.w3c.dom.Text;

public class SelectPizzaLocation extends AppCompatActivity {

    Spinner spinner;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_pizza_location);

        //define list view
        spinner = (Spinner) findViewById(R.id.spinner_select);


        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.locations_array, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        //spinner.setOnItemSelectedListener(this);

    }

    public void onItemSelection (AdapterView<?> parent, View view, int position, long id){
        TextView textView = (TextView) view;
        //String selection = parent.getItemAtPosition(position).toString();
        //Double spinnerVal = Double.parseDouble(selection.replaceAll("[\\D]", ""));
        Toast.makeText(this, "Dominos Pizza Location: " + textView.getText(), Toast.LENGTH_SHORT).show();
    }

    public void onNoSelection(AdapterView<?> parent){

    }

    public void startNewActivity(View view){
        String location = spinner.getSelectedItem().toString();
        String loc = location;

        //if (location.contains("Store 7387")){
            //loc = location;
        //}
        //else if (location.contains("Store 1985")){
            //loc = location;
        //}
        Intent intent = new Intent(SelectPizzaLocation.this, DisplayActivity.class);
        intent.putExtra("location", loc);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_pizza_location, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
