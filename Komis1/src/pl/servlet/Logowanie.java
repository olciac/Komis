package pl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logowanie
 */
@WebServlet("/")
public class Logowanie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logowanie() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/logowanie.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("login");
        String password = request.getParameter("haslo");
        System.out.println(username);
        System.out.println(password);
        
        if(username != "" && password != "") {
        	request.getRequestDispatcher("/jsp/listaAut.jsp").forward(request,response);
        } else {
            request.setAttribute("error", "Niepoprawny lugin lub has³o");
            request.getRequestDispatcher("/jsp/logowanie.jsp").forward(request,response);
        }
	}

}
