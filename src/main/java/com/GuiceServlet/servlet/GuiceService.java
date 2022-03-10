package com.GuiceServlet.servlet;

import com.GuiceServlet.servlet.implementation.GuiceServiceImpl;
import com.google.inject.ImplementedBy;

@ImplementedBy(GuiceServiceImpl.class)
public interface GuiceService {

	String sayHello();
	
}
