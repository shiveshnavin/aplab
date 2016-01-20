package com.shivesh.circalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;


public class ResActivity extends ActionBarActivity {

	Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        Toast.makeText(this, "AP Lab app by Roll 34 @ MSIT,ECE 2nd Shift", Toast.LENGTH_LONG).show();
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.res, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void about(View view) 
    {
    	Toast.makeText(this, "AP Lab app by Roll 34 @ MSIT,ECE 2nd Shift", Toast.LENGTH_LONG).show();	 
    	Toast.makeText(this, " Please DON'T Go BOOM ! until All fields are Filled !!!!", Toast.LENGTH_LONG).show();
    }
    public void switchres2(View view) 
    {
    		final Context context = this;

    		button = (Button) findViewById(R.id.res2);

    		button.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {

    				Intent intent = new Intent(context, Res2Activity.class);
                    startActivity(intent);   

    			}

    		});

    	} 
    public void switchres3(View view) 
    {
    		final Context context = this;

    		button = (Button) findViewById(R.id.res3);

    		button.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {

    				Intent intent = new Intent(context, Res3Activity.class);
                    startActivity(intent);   

    			}

    		});

    	} 
     
    public void eqn(View view) 
    {
    	final Context context = this;

    		button = (Button) findViewById(R.id.eqn);
    		
    		button.setOnClickListener(new OnClickListener() {
            
    			@Override
    			public void onClick(View arg0) {
    	
    				Intent intent = new Intent(context, EqnActivity.class);
                    startActivity(intent);   

    			}

    		});

    	}  
    public void more(View view) 
    {
    	final Context context = this;

    		button = (Button) findViewById(R.id.more);
    		
    		button.setOnClickListener(new OnClickListener() {
            
    			@Override
    			public void onClick(View arg0) {
    	
    				Intent intent = new Intent(context, HeNe.class);
                    startActivity(intent);   

    			}

    		});

    	}
}
