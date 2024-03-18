import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MostraFormServlet")
public class MostraFormServelet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<form method='post'>");
		out.println("Nome: <input type='text' name='nome' required/>");
		out.println("Idade: <input type='number' name='idade' required/>");
		out.println("<input type='submit' value='Enviar'/>");
		out.println("</form>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");

		out.println("<html><body>");
		out.println("<h1>Parâmetros Recebidos</h1>");
		out.println("<p>Nome: " + nome + "</p>");
		out.println("<p>Idade: " + idade + "</p>");
		out.println("</body></html>");
	}
}
