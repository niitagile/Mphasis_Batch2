package com.businesslogic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			
			InputStream in = getServletContext().getResourceAsStream("/webapp/config.properties");
			Properties props = new Properties();// it is predefine class
			props.load(in);
			Connection con = DatabaseConnection.getMyConnection(props.getProperty("url"), props.getProperty("userid"),
					props.getProperty("password"));

			con.close();

		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
