package com.creed.numberical.ue.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.creed.numberical.NumbericalCreedApplication;
import com.creed.numberical.R;

/**
 * ClassName:	MainActivity
 * Function: 	TODO ADD FUNCTION
 * Reason:	 	TODO ADD REASON 
 * @author   	Norris		Norris.sly@gmail.com
 * @version  	
 * @since   	Ver 1.1		I used to be a programmer like you, then I took an arrow in the knee 
 * @Date	 	2013		2013-7-23		ÏÂÎç4:30:35 
 * @see 	 	
 */
public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );
		// asdffffffffffffffff
	}


	public void enterStoryMode(View inView)
	{
		Intent mIntent = new Intent( getApplicationContext(), StoryModeActivity.class );
		startActivity( mIntent );
	}


	public void enterChallengeMode(View inView)
	{

	}


	public void enterRecoveryWorkShop(View inView)
	{

	}


	/**
	 * 	(non-Javadoc)
	 * 	@see android.app.Activity#onBackPressed()
	 */
	@Override
	public void onBackPressed()
	{
		super.onBackPressed();
		getApplication().onTerminate();
	}

}
