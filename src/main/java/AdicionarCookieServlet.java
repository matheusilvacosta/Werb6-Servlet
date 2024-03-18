import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AdicionarCookieServlet")
public class AdicionarCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        Cookie cookie = new Cookie("Matheus", "valorCookieMatheus");

        cookie.setMaxAge(24 * 60 * 60); 

        response.addCookie(cookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Cookie Adicionado</h1>");
        out.println("<p>Um cookie foi adicionado à resposta.</p>");
        out.println("</body></html>");
    }
}
