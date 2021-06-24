package com.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Student;
import com.model.StudentDAO;

/**
 * Servlet implementation class Student
 */
@WebServlet ("/student.do")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession();
		    ServletContext application=getServletContext();
		    
		    Integer scount=(Integer)session.getAttribute("count");
		    Integer acount=(Integer)application.getAttribute("count");
		    
		    if(scount==null)
		    	session.setAttribute("count", 1);
		    else
		    	session.setAttribute("count",scount+1);
		    
		    if(acount==null)
		    	application.setAttribute("count", 1);
		    else
		    	application.setAttribute("count",acount+1);
		request.setAttribute("studentlist", StudentDAO.getStudent());
		RequestDispatcher rd=request.getRequestDispatcher("Student2.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   int sno =	Integer.parseInt(request.getParameter("SNO"));
		   int sid = Integer.parseInt(request.getParameter("SID"));
		   String name = request.getParameter("NAME");
		   
		   Student s=new Student(sno,sid,name);
		   if(StudentDAO.insert(s))
			   response.sendRedirect("student.do");
		   else
			   response.getWriter().print("Something went wrong check log");
		}

	}

