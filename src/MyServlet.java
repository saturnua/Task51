
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String inputText = request.getParameter("inputText");
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write("<h1>Its Okey Dany!!!!!</h1>");
        out.flush();
        out.close();
    }

}