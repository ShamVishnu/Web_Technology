/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shamv
 */
public class FormDisplayServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FormDisplayServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Form Data Display</h1>");
            out.println("<table border=\"1\">");
            out.println("<tr>");
            out.println("<td>Name :</td><td>"+request.getParameter("Name")+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Email ID :</td><td>"+request.getParameter("email")+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Mobile Number :</td><td>"+request.getParameter("mobno")+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Telephone Number :</td><td>"+request.getParameter("telno")+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Date of Birth :</td><td>"+request.getParameter("dob")+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Gender :</td><td>"+request.getParameter("gender")+"</td>");
            out.println("</tr>");
            int selectedindex;
            selectedindex = request.getParameterValues("Nationality").length;
            String Nations=request.getParameter("Nationality");
            out.println("<tr>");
            out.println("<td>"
                    + "Nationality</td>");
            for(int i=0;i<selectedindex;i++){
                out.println("<td>"+Nations+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
