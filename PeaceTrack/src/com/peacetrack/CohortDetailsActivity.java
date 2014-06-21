/**
 * 
 */
package com.peacetrack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author Pooja
 *
 */
public class CohortDetailsActivity extends ActionBarActivity implements OnClickListener {

	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
	    setContentView(R.layout.activity_cohortdetails);
	    
	}

	@Override
	  public void onResume() {
		super.onResume();
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		Button addnewactivitybutton = (Button)findViewById(R.id.addnewactivitybutton);
		Button addnewmeasurementbutton = (Button)findViewById(R.id.addnewmeasurementbutton);
		
	}
	@Override
	public void onClick(View v) {

		int id = v.getId();
		if (id == R.id.addnewactivitybutton) {
			Intent intent = new Intent(this,AddActivityActivity.class);
			this.startActivity(intent);
		} else if (id == R.id.addnewmeasurementbutton) {
			Intent intent = new Intent(this,AddMeasurementActivity.class);
			this.startActivity(intent);
		}
	}

}
