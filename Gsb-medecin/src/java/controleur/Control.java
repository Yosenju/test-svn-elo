/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Dep;
import modele.Med;
import modele.Pays;

/**
 *
 * @author elo
 */
public class Control extends HttpServlet {

    private Pays p = new Pays();

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String page = null;
        String choix;
        choix = request.getParameter("choix");

        if (choix == null) {
            page = "accueil.jsp";
        } else if (choix.equals("listedep")) {
            String dep = request.getParameter("dep");
            if (dep == null) {
                Collection<Dep> d = p.getLesDeps();
                request.setAttribute("listeDep", d);
                page = "listeDeps.jsp";
            } else {
                Collection<Med> m = p.getLeDep(dep).getLesMeds();
                request.setAttribute("listeMeds", m);
                page = "listeMeds.jsp";
            }
        } else if (choix.equals("listeparnom")) {
            Collection<Dep> d = p.getLesDeps();
            request.setAttribute("listeDeps", d);
            page = "listeMeds.jsp";
        }
        request.getRequestDispatcher(page).forward(request, response);
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        p = new Pays(); //instancie les objets utiles
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
