package sample;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;

WebServlet("/verify")
public class VerifyServlet extends HttpServlet{
  public  void service( HttpServletRequest req, HttpServletReesponse res)
  {
       String user =req.getParameter("username");
      String pass =req.getParameter("password");
      System.out.println(user+ " "+pass);
      // buessines lgic class and obbjct creatd
      //uski method call ke or local param pass kiye
      Verification objec = new Verification();
     boolean result =  objec.verifyuser(user,pass);
    PrintWriter out = res.getWriter();
     if (result == true)
     {
         System.out.println("User verified");

     }
      else
     {
         System.out.println("User NOT verified");
     }

  }
}
