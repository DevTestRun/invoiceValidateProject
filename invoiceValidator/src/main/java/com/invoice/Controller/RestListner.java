package com.invoice.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.invoice.Util.ApplicationConstants;
import com.invoice.Util.ReadandValidatePDF;

/**
 * Servlet implementation class FileProcesserServlet
 */
public class RestListner extends HttpServlet implements ApplicationConstants {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RestListner() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		/*if (isMultipart) {
			switch (request.getParameter(COMMOND)) {
			case FILE_PDF:
				ReadandValidatePDF.validateandGetData();
				break;
			case FILE_XLSX:

				break;
			case FILE_HTML:

				break;

			default:
				break;
			}
		}*/
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
