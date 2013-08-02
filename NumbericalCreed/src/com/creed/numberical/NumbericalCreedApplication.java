package com.creed.numberical;

import android.app.Application;

/**
 * ClassName:	NumbericalCreedApplication
 * Function: 	数字信条程序类
 * @author   	Norris		Norris.sly@gmail.com
 * @version  	
 * @since   	Ver 1.0		I used to be a programmer like you, then I took an arrow in the knee 
 * @Date	 	2013		2013-7-23		下午1:18:59 
 * @see 	 	
 */
public class NumbericalCreedApplication extends Application
{

	/**
	 * 	(non-Javadoc)
	 * 	@see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

	}


	/**
	 * 	(non-Javadoc)
	 * 	@see android.app.Application#onTerminate()
	 */
	@Override
	public void onTerminate()
	{
		super.onTerminate();
		System.exit( 0 );
		System.gc();
	}


	/**
	 * 	(non-Javadoc)
	 * 	@see android.app.Application#onLowMemory()
	 */
	@Override
	public void onLowMemory()
	{
		super.onLowMemory();
		this.onTerminate();
	}

}
