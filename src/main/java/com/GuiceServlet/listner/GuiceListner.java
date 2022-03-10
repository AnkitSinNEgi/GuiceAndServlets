package com.GuiceServlet.listner;

import javax.servlet.annotation.WebListener;

import com.GuiceServlet.servlet.GuiceServlet;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

import module.GuiceModule;

@WebListener
public class GuiceListner extends GuiceServletContextListener {
	@Override
	protected Injector getInjector() { 
		
		return Guice.createInjector(new ServletModule() {
				
			@Override
			protected void configureServlets() {
				serve("/guice").with(GuiceServlet.class);
			}				
		}
				
	
		}
	
}
