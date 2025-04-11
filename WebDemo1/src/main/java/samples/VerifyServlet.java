package samples;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/verify")
public class VerifyServlet extends HttpServlet {
    public  void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String user =req.getParameter("username");
        String pass =req.getParameter("password");
        System.out.println(user+ " "+pass);
        // buessines lgic class and obbjct creatd
        //uski method call ke or local param pass kiye
        Verification objec = new Verification();
        boolean result = false;
        try {
            result = objec.verifyuser(user,pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        PrintWriter out = res.getWriter();
        if (result == true)
        {
            out.println("User verified");

        }
        else
        {
            out.println("User NOT verified");
        }

    }
}