package services;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import beans.Address;
import beans.EmployeeDetails;



@WebServlet("/HibernateTestServlet")
public class HibernateTestServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	List<EmployeeDetails> getData(){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		List<EmployeeDetails> list=session.createQuery("FROM EmployeeDetails").list(); 
		
		
		session.getTransaction().commit();
		

		session.close();
		return list;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		List<EmployeeDetails> list=getData();
		
				for(EmployeeDetails emp : list) {
					
					out.println(emp.getName());
					out.println(emp.getAddress().getCity());
				}
	}

}
