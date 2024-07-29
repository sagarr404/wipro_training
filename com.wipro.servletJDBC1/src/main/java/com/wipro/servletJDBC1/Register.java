package com.wipro.servletJDBC1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
		public Connection con;
		PreparedStatement ps;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			String t1 = request.getParameter("t1");
			String sname = request.getParameter("t2");
			int stid = Integer.parseInt(t1);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123");
	
			ps = con.prepareStatement("insert into employee values(?,?)");
			
			ps.setInt(1, stid);
			ps.setString(2, sname);
			int result = ps.executeUpdate();
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			if(result>0) 
				pw.println("Registration Successful");
			else
				pw.println("Registration Unsuccessful");
			
			pw.println("<a href='index.html'>Home</a>");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
