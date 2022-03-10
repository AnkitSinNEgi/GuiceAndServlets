package com.GuiceServlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class GuiceServlet extends HttpServlet {

	private static final long serialVersionUID = -1292571806295685541L;

	@Inject
	private GuiceService guiceService;
	     
			@Override
			protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
			   response.getWriter().println("Google Guice Servlet");
			}
}
