/**
 * 	StoryModeActivity.java
 * 	com.creed.numberical.ue.ui
 * 	Function： 	剧情模式  
 *   ver     date      		author
 * 	──────────────────────────────────
 *   		 2013-7-24 		Norris 
 * Copyright (c) 2013, TNT All Rights Reserved.
*/

package com.creed.numberical.ue.ui;

import com.creed.numberical.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.HorizontalScrollView;

/**
 * ClassName:	StoryModeActivity
 * Function: 	剧情模式
 * @author   	Norris		Norris.sly@gmail.com
 * @version  	
 * @since   	Ver 1.1		I used to be a programmer like you, then I took an arrow in the knee 
 * @Date	 	2013		2013-7-24		上午9:14:52 
 * @see 	 	
 */

public class StoryModeActivity extends Activity
{

	/**
	 * 	(non-Javadoc)
	 * 	@see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );
		checkIsFirst();
		initContentView();
		fillcontent();
	}


	/**
	 * 	fillcontent:(这里用一句话描述这个方法的作用)
	 * 	@param  	    
	 * 	@return 	void   
	 * 	@throws 
	 * 	@since  	I used to be a programmer like you, then I took an arrow in the knee　Ver 1.1
	 */
	private void fillcontent()
	{

	}


	/**
	 * 	initContentView:(这里用一句话描述这个方法的作用)
	 * 	@param  	    
	 * 	@return 	void   
	 * 	@throws 
	 * 	@since  	I used to be a programmer like you, then I took an arrow in the knee　Ver 1.1
	 */
	private void initContentView()
	{
		HorizontalScrollView myHorizontalScrollView = (HorizontalScrollView) findViewById( R.id.horizontalScrollView1 );
	}


	/**
	 * 	checkIsFirst:(这里用一句话描述这个方法的作用)
	 * 	@param  	    
	 * 	@return 	void   
	 * 	@throws 
	 * 	@since  	I used to be a programmer like you, then I took an arrow in the knee　Ver 1.1
	 */
	private void checkIsFirst()
	{
		if (true)
		{
			// TODO
		}
	}

}
