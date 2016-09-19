/* COPYRIGHT (C) 2016 LTS. All Rights Reserved. */

package com.lts.core.manager;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.lts.core.config.Config;


/**
 * @author veeru
 *
 */
public class AppContextManager {

	// Singleton object, used globally with static getCollectorManager().
	private static AppContextManager contextManager = new AppContextManager();

	private AbstractApplicationContext context;

	/**
	 * Avoid multiple object creation, by Singleton
	 */
	private AppContextManager() {

		try {
			// initialize all required queue in this private constructor.
			context = new AnnotationConfigApplicationContext(Config.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	/**
	 * Access the only[singleton] AppContextManager object.
	 * 
	 * @return AppContextManager
	 */
	public static AppContextManager getAppContextManager() {
		return contextManager;
	}

	public AbstractApplicationContext getContext() {
		return context;
	}

}
