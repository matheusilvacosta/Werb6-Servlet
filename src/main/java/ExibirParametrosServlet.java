import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ExibirParametrosServlet")
public class ExibirParametrosServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Parâmetros Recebidos</h1>");
        out.println("<p>Nome: " + nome + "</p>");
        out.println("<p>Idade: " + idade + "</p>");
        out.println("</body></html>");
    }
}
