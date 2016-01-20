package com.shivesh.circalc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.Math;




public class EqnActivity extends ResActivity {
	
	private EditText ang;  
    private EditText lam;
    private EditText tmp;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.eqn);
	        ang = (EditText) findViewById(R.id.angg); 
	        lam = (EditText) findViewById(R.id.lamm);
	        
	    }
	 
	 public void lamda(View view) {  
	      
         
      
        
             double inputValue1 = Double.parseDouble(ang.getText().toString());
             //double inputValue2 = Double.parseDouble(lam.getText().toString());

             lam.setText(String.valueOf(res(inputValue1)));

             Toast.makeText(this, "Done !!", Toast.LENGTH_LONG).show();
                  
             }  
           
       
       
   
     private double res(double v) {  
        double e,a=1,n;
        v=(v*22)/(180*7);
        a=(2.54*java.lang.Math.sin(v)/1500000);
         return (a);  
     }  
   
     
	 
}
