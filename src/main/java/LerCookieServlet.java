import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LerCookieServlet")
public class LerCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Cookie[] cookies = request.getCookies();

        String valorDoCookie = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("Matheus")) {
                    valorDoCookie = cookie.getValue();
                    break;
                }
            }
        }
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Valor do Cookie</h1>");
        if (valorDoCookie != null) {
            out.println("<p>O valor do cookie é: " + valorDoCookie + "</p>");
        } else {
            out.println("<p>O cookie não foi encontrado.</p>");
        }
        out.println("</body></html>");
    }
}
