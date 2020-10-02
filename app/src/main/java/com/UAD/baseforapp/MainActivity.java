package com.UAD.baseforapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
public class MainActivity extends AppCompatActivity
{  @Override 
protected void onCreate(Bundle savedInstanceState) {  super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
	}
	@Override  public boolean onCreateOptionsMenu(Menu menu) 
	{  getMenuInflater().inflate(R.menu.menu_main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override  
	public boolean onOptionsItemSelected(MenuItem item) {  switch (item.getItemId()) {  case R.id.action_create_order:
				Intent intent = new Intent(this, orderactivity.class);
				startActivity(intent);
				return true;
			default:
				return super.onOptionsItemSelected(item);
		
		}
	
	
	}
		
		
}
