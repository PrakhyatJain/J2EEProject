package com.academic.webprogramming.employeeoperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeRegistrationController
 */
@WebServlet("/empRegServlet")
public class EmpRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public EmpRegServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String empId = request.getParameter(EmployeeProjectConstants.EMP_ID);
		String empName = request.getParameter(EmployeeProjectConstants.EMP_NAME);
		String empDesg = request.getParameter(EmployeeProjectConstants.EMP_DESG);
		String empSalary = request.getParameter(EmployeeProjectConstants.EMP_SALARY);
		
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Desg:" + empDesg);
		System.out.println("Employee Salary:" + empSalary);
		
		
		
		out.print("Employee Registration Successful...");
		out.close();

	}

}
