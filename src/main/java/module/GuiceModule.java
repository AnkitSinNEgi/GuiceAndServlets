package module;

import com.GuiceServlet.servlet.GuiceServlet;
import com.google.inject.servlet.ServletModule;

public class GuiceModule extends ServletModule {
	@Override
	protected void configureServlets() {
		serve("/").with(GuiceServlet.class);
	}
  
		
	
	
}
