package com.businesslogic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteRecord
 */
@WebServlet("/DeleteRecord")
public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read data from form
				int rollno=Integer.parseInt(request.getParameter("txtrollno"));
				
				
				
				//Establish Connection with database
				try {
					Connection con=DatabaseConnection.getMyConnection();	
					
					//Write Query
					
					
					String str="delete from student where rollno=?";
					//to execute query create object of preparedSatement
					PreparedStatement  ps=con.prepareStatement(str);
					ps.setInt(1,rollno );
					
								
					//execute query
					int ans =ps.executeUpdate();
					PrintWriter out=response.getWriter();
					if(ans>0)
						out.println("Record Deleted");
					else
						out.println("Record not Deleted");
				
					//close connection
					con.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
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
