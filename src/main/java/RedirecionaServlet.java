import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RedirecionaServlet")
public class RedirecionaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Redirecionar</title></head><body>");
        out.println("<h1>Clique no botão para redirecionar</h1>");
        out.println("<button onclick=\"redirecionarParaOutraPagina()\">Redirecionar</button>");
        out.println("<script>");
        out.println("function redirecionarParaOutraPagina() {");
        out.println("  window.location.href = 'RedirecionaPagina.jsp';"); 
        out.println("}");
        out.println("</script>");
        out.println("</body></html>");
    }
}
