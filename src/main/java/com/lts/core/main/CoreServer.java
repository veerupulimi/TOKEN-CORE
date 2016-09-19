/* COPYRIGHT (C) 2016 LTS. All Rights Reserved. */

package com.lts.core.main;

import org.springframework.context.support.AbstractApplicationContext;
import com.lts.core.manager.AppContextManager;



/**
 * @author veeru
 *
 */
public class CoreServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = AppContextManager
				.getAppContextManager().getContext();
		
	}

}
