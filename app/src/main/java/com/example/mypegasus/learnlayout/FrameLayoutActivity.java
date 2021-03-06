package com.example.mypegasus.learnlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class FrameLayoutActivity extends AppCompatActivity implements View.OnClickListener {

	private FrameLayout root;

	private ImageView ivA, ivB;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frame_layout);
		root = (FrameLayout) findViewById(R.id.root);
		ivA = (ImageView) findViewById(R.id.ivA);
		ivB = (ImageView) findViewById(R.id.ivB);

		showA();

		root.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_frame_layout, menu);
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

	@Override
	public void onClick(View v) {
		if(ivA.getVisibility() == View.VISIBLE) showB();
		else showA();
	}

	private void showA() {
		ivA.setVisibility(View.VISIBLE);
		ivB.setVisibility(View.INVISIBLE);
	}

	private void showB() {
		ivB.setVisibility(View.VISIBLE);
		ivA.setVisibility(View.INVISIBLE);
	}
}
