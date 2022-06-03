/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author heetk
 */
public class ArithmeticServlet extends HttpServlet {
    
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
        request.setAttribute("msg", "Result: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic-calculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operation = request.getParameter("calculate");
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String msg;
        try {
            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);
            int res = 0;
            switch(operation) {
                case "+": {
                    res = firstInt + secondInt;
                    break;
                }
                case "-": {
                    res = firstInt - secondInt;
                    break;
                }
                case "*": {
                    res = firstInt * secondInt;
                    break;
                }
                case "/": {
                    res = firstInt / secondInt;
                    break;
                }
            }
            msg = "Result:" + res;
        } catch(NumberFormatException | ArithmeticException n) {
            msg = "Result: invalid";
        }
        request.setAttribute("msg", msg);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic-calculator.jsp").forward(request, response);
    }
}
