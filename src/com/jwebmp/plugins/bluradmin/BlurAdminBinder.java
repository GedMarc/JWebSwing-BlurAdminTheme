package com.jwebmp.plugins.bluradmin;

import com.google.inject.Singleton;
import com.google.inject.servlet.SessionScoped;
import com.jwebmp.plugins.bluradmin.components.LongRunningProgressBar;
import com.jwebmp.plugins.bluradmin.console.WebLogAppender;
import za.co.mmagon.guiceinjection.abstractions.GuiceInjectorModule;
import za.co.mmagon.guiceinjection.interfaces.GuiceDefaultBinder;

/**
 * @author Marc Magon
 * @since 02 Jul 2017
 */
public class BlurAdminBinder
		extends GuiceDefaultBinder
{

	/*
	 * Constructs a new BlurAdminBinder
	 */
	public BlurAdminBinder()
	{
		//Nothing needed
	}

	@Override
	public void onBind(GuiceInjectorModule module)
	{
		module.bind(WebLogAppender.class)
		      .in(Singleton.class);
		module.bind(LongRunningProgressBar.class)
		      .in(SessionScoped.class);
	}
}