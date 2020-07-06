package local.training.jenkins.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import local.training.jenkins.services.RhServices;

/**
 * Servlet implementation class RhServlet
 */
@WebServlet("/rh")
public class RhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RhServices rhServices;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RhServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(this.rhServices == null) {
			this.rhServices = new RhServices();
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("\n" + this.rhServices.colaboradorKlebeta());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
