package com.tmoreno.tutorial.cucumber;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumadorServlet extends HttpServlet {

	private static final long serialVersionUID = -2358461356821418397L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Tutorial Cucumber</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<form action=\"/suma\" method=\"post\">");
	    out.println("<div>");
	    out.println("<label for=\"sumando1\">Sumando 1</label>");
	    out.println("<input type=\"text\" id=\"sumando1\" name=\"sumando1\">");
	    out.println("</div>");
	    out.println("<div>");
	    out.println("<label for=\"sumando2\">Sumando 2</label>");
	    out.println("<input type=\"text\" id=\"sumando2\" name=\"sumando2\">");
	    out.println("</div>");
	    out.println("<div>");
	    out.println("<label for=\"resultado\">Resultado</label>");
	    out.println("<input type=\"text\" id=\"resultado\" name=\"resultado\">");
	    out.println("</div>");
	    out.println("<button type=\"submit\">Sumar</button>");
	    out.println("</form>");
	    out.println("</body>");
	    out.println("</html>");
	    
	    out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sumando1 = Integer.parseInt(request.getParameter("sumando1"));
		int sumando2 = Integer.parseInt(request.getParameter("sumando2"));
		
		int resultado = sumando1 + sumando2;
		
		response.setContentType("text/html");
		
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Tutorial Cucumber</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<form action=\"/suma\" method=\"post\">");
	    out.println("<div>");
	    out.println("<label for=\"sumando1\">Sumando 1</label>");
	    out.println("<input type=\"text\" id=\"sumando1\" name=\"sumando1\" value=\"" + sumando1 + "\">");
	    out.println("</div>");
	    out.println("<div>");
	    out.println("<label for=\"sumando2\">Sumando 2</label>");
	    out.println("<input type=\"text\" id=\"sumando2\" name=\"sumando2\" value=\"" + sumando2 + "\">");
	    out.println("</div>");
	    out.println("<div>");
	    out.println("<label for=\"resultado\">Resultado</label>");
	    out.println("<input type=\"text\" id=\"resultado\" name=\"resultado\" value=\"" + resultado + "\">");
	    out.println("</div>");
	    out.println("<button type=\"submit\">Sumar</button>");
	    out.println("</form>");
	    out.println("</body>");
	    out.println("</html>");
	    
	    out.close();
    }
}
