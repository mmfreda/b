/**
 * 	WelcomeActivity.java
 * 	com.creed.numberical.ue.ui
 * 	Function£º 	TODO  
 *   ver     date      		author
 * 	©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤©¤
 *   		 2013-7-23 		Norris 
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package com.creed.numberical.ue.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;

import com.creed.numberical.R;

/**
 * ClassName:	WelcomeActivity
 * Function: 	TODO ADD FUNCTION
 * Reason:	 	TODO ADD REASON 
 * @author   	Norris		Norris.sly@gmail.com
 * @version  	
 * @since   	Ver 1.1		I used to be a programmer like you, then I took an arrow in the knee 
 * @Date	 	2013		2013-7-23		ÏÂÎç3:32:51 
 * @see 	 	
 */

public class WelcomeActivity extends Activity
{

	private InitializationTask myInitializationTask;


	/**
	 * 	(non-Javadoc)
	 * 	@see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_welcome );
		myInitializationTask = new InitializationTask();
		myInitializationTask.execute();
	}

	private class InitializationTask extends AsyncTask<Void, Void, Void>
	{

		/**
		 * 	(non-Javadoc)
		 * 	@see android.os.AsyncTask#doInBackground(Params[])
		 */
		@Override
		protected Void doInBackground(Void... params)
		{
			try
			{
				Thread.sleep( 500 );
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			return null;
		}


		/**
		 * 	(non-Javadoc)
		 * 	@see android.os.AsyncTask#onCancelled()
		 */
		@Override
		protected void onCancelled()
		{
			super.onCancelled();
		}


		/**
		 * 	(non-Javadoc)
		 * 	@see android.os.AsyncTask#onPostExecute(java.lang.Object)
		 */
		@Override
		protected void onPostExecute(Void result)
		{
			super.onPostExecute( result );
			Intent mIntent = new Intent( getApplicationContext(), MainActivity.class );
			startActivity( mIntent );
			finish();
		}


		/**
		 * 	(non-Javadoc)
		 * 	@see android.os.AsyncTask#onPreExecute()
		 */
		@Override
		protected void onPreExecute()
		{
			super.onPreExecute();
		}


		/**
		 * 	(non-Javadoc)
		 * 	@see android.os.AsyncTask#onProgressUpdate(Progress[])
		 */
		@Override
		protected void onProgressUpdate(Void... values)
		{
			super.onProgressUpdate( values );
		}

	}


	/**
	 * 	(non-Javadoc)
	 * 	@see android.app.Activity#onBackPressed()
	 */
	@Override
	public void onBackPressed()
	{
		if (myInitializationTask != null && myInitializationTask.getStatus() != Status.FINISHED)
		{
			myInitializationTask.cancel( true );
		}
		super.onBackPressed();
	}
}
