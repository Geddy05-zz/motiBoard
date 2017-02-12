package motiBoard.spi;

/**
 * Created by Geddy on 11-2-2017.
 */
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Simple extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("Hello, world");
    }
}