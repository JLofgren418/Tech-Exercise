import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Book;
import datamodel.User;
import util.UtilDBLofgren;

@WebServlet("/list/NormList")
public class NormList extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public NormList() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      
      // #2
      retrieveDisplayData(response.getWriter());
   }
   
   void retrieveDisplayData(PrintWriter out) {
      String title = "Database Result";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + //
            "transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h1 align=\"center\">" + title + "</h1>\n");
      out.println("<ul>");
      out.println("</ul>");
      out.println("<h> BOOKS (isbn, title, price)</h>");
      List<Book> listBook = UtilDBLofgren.listBooks();
      for (Book book : listBook) {
         System.out.println("[DBG] " + book.getId() + ", " //
               + book.getTitle() + ", " //
               + book.getPrice());

         out.println("<li>" + book.getId() + ", " //
               + book.getTitle() + ", " //
               + book.getPrice() + "</li>");
      }
      out.println("</ul>");
      out.println("</body><a href=\"/Tech%20Exercise/login.html\">Login</a> <br></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
