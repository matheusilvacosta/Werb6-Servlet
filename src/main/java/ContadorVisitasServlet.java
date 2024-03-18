import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();

        Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");
        if (contadorVisitas == null) {
            contadorVisitas = 1;
        } else {
            contadorVisitas++;
        }

        session.setAttribute("contadorVisitas", contadorVisitas);
   
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        out.println("<html><head><title>Contador de Visitas</title></head><body>");
        out.println("<h1>Contador de Visitas</h1>");
        out.println("<p>Quantidade de vezes que você visitou a página: " + contadorVisitas + "</p>");
        out.println("</body></html>");
    }
}
