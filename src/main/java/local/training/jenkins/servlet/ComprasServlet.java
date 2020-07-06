package local.training.jenkins.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import local.training.jenkins.entities.Compra;
import local.training.jenkins.services.ComprasServices;

/**
 * Servlet implementation class ComprasServlet
 */
@WebServlet("/compras")
public class ComprasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComprasServices comprasServices;

	@Override
	public void init() throws ServletException {
		if (this.comprasServices == null) {
			this.comprasServices = new ComprasServices();
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ComprasServlet() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Compra> comprasMes = this.comprasServices.getComprasMes();
		response.getWriter().append("Served at: ").append(request.getContextPath())
				.append("\nValor da Compra: " + comprasMes.get(0).getValor().toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
