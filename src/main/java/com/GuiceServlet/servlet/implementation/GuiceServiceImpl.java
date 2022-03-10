package com.GuiceServlet.servlet.implementation;

import com.GuiceServlet.servlet.GuiceService;

public class GuiceServiceImpl implements GuiceService {

	@Override
	public String sayHello() {
		
		return "Hello Everyone";
	}

}
