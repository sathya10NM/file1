package org.web.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.Servlet.Session.HttpSession;

/**
 * Servlet Filter implementation class Contact
 */
@WebFilter(urlpatterns= {"/new","/delete","/update","/view"})
public class Contact implements Filter {

    /**
     * Default constructor. 
     */
    public Contact() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpSession s=request.getSession();
		if(s.getId()!=null)
		{
		chain.doFilter(request, response);
		}
		else
		{
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
