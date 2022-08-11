package com.businesslogic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayInfo
 */
@WebServlet("/DisplayInfo")
public class DisplayInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			//get Connection
		Connection con=DBConnection.getConnection();
		//create Sql command
		String str="select * from Student";
		Statement stmt=con.createStatement();
		
		//execute sql command and store output in resultset
		ResultSet rs=stmt.executeQuery(str);
		PrintWriter out=response.getWriter();
		
		//Read records from resultset
		while(rs.next()) {
			out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getFloat("marks"));
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
