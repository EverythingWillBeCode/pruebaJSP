/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import logica.Controladora;
import logica.Persona;

/**
 *
 * @author Silforoso
 */
@WebServlet(name = "SvModificar", urlPatterns = {"/SvModificar"})
public class SvModificar extends HttpServlet {
    
    Controladora control = new Controladora();
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
       /* try ( PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvModificar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvModificar at " + request.getContextPath() + "</h1>");
            
            
            out.println("</body>");
            out.println("</html>");
        }  */ 
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
                
        int id_modificar = Integer.parseInt( request.getParameter("id"));
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        Persona pers = new Persona(id_modificar,nombre, apellido, dni, telefono);
                      
        control.modificarPersona(pers);
        
        response.sendRedirect("index.jsp"); 
        
            
      
       
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
