import java.io.*;
import javax.servlet.*;

public class LifecycleServlet extends GenericServlet
{
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		System.out.println("In init() method..");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		System.out.println("In service() method..");
	}

	public void destroy(){
		System.out.println("In destroy() method...");
	}
}