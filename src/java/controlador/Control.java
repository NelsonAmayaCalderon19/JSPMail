/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Utility;
import modelo.Mensaje;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelDAO.MensajeDAO;

/**
 *
 * @author NELSON
 */
public class Control extends HttpServlet {

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
          response.setContentType("text/html;charset=UTF-8");
        
        
        request.setCharacterEncoding("UTF-8");
        
        String accion = request.getParameter("accion");
        String menu = request.getParameter("menu");   
        Mensaje m = new Mensaje();
        MensajeDAO mdao = new MensajeDAO();
        
        if(menu.equalsIgnoreCase("Mensaje")){
            switch (accion){
                case "Enviar":
                    String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String website = request.getParameter("website");
        String message = request.getParameter("message");
                    
		m.setNombre(nombre);
		m.setMensaje(message);
		m.setSitio(website);
		m.setEmail(email);
		
		
		if(Utility.enviarCorreo(m)){
		
                mdao.insertar(m);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
                }else{
                response.getWriter().println("Error Enviando");
                }
                    break;
                case "Buscar":
                    String id = request.getParameter("id");                   
		m.setId(Integer.parseInt(String.valueOf(id)));
                m = mdao.buscar(m);
                request.setAttribute("mensaje", m);
                //request.getRequestDispatcher("/index.jsp").forward(request, response);
                    break;
                    case "Eliminar":
                    String iddelete = request.getParameter("id");                   
		m.setId(Integer.parseInt(String.valueOf(iddelete)));
                mdao.delete(m);

                request.getRequestDispatcher("/index.jsp").forward(request, response);
                    break;
                    case "Actualizar":
                        int idact =Integer.parseInt(request.getParameter("id"));  
                        String nombreact = request.getParameter("nombre");
        String emailact = request.getParameter("email");
        String websiteact = request.getParameter("website");
        String messageact = request.getParameter("message");
        
        m.setNombre(nombreact);
		m.setMensaje(messageact);
		m.setSitio(websiteact);
		m.setEmail(emailact);
                    m.setId(idact);
		 mdao.actualizar(m);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
                        break;
                default:
                    throw new AssertionError();
            }   
            request.getRequestDispatcher("formulario.jsp").forward(request, response);
            }
        
        
                
                
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
