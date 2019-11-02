package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lcmhcf
 */
public class lcmhcf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lcmhcf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int  a=Integer.parseInt(request.getParameter("t1"));
		int  b=Integer.parseInt(request.getParameter("t2"));
		String option = request.getParameter("l1") ;
		PrintWriter out=response.getWriter();
		if(option.equals("LCM"))
		{
			
			//int n1 = 72, n2 = 120, lcm;
	        // maximum number between n1 and n2 is stored in lcm
	       int lcm = (a > b) ? a : b;
	        // Always true
	        while(true)
	        {
	            if( lcm % a == 0 && lcm % b == 0 )
	            {
	            	out.println("<html><body bgcolor='red'>");
	    			out.println("<h1> The LCM  is "+lcm+"</h1>");
	    			
	    			out.println("</body>");
	                //System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
	                break;
	            }
	            ++lcm;
	        }
			
			
		}
		else if(option.equals("HCF")){
			
			 int  gcd = 1;
		        for(int i = 1; i <= a && i <= b; ++i)
		        {
		            // Checks if i is factor of both integers
		            if(a % i==0 && b % i==0)
		                gcd = i;
		        }
		        out.println("<html><body bgcolor='red'>");
    			out.println("<h1> The hcf is "+gcd+"</h1>");
    			
    			out.println("</body>");
		       
			
			
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
