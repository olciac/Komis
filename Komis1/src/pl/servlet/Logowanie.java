package pl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.models.Uzytkownik;

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
        
        if(username != "" && password != "") {
        	Uzytkownik user = new Uzytkownik();
        	user.setLogin(username);
        	user.setPassword(password);
        	List<Uzytkownik> userList = user.getUsers();
        	boolean isAuthorized = false;
        	for (Uzytkownik uzytkownik : userList) {
				if(uzytkownik.getLogin().equals(username) && uzytkownik.getPassword().equals(password))
				{
					isAuthorized = true;
					
				}
			}
        	if(isAuthorized)
        	{
        		response.sendRedirect(request.getContextPath() + "/Komis");
        		
        	} else {
                request.setAttribute("error", "Niepoprawny login lub has³o ");
                request.setAttribute("user", user);
                request.getRequestDispatcher("/jsp/logowanie.jsp").forward(request,response);
        	}
        } else {
            request.setAttribute("error", "Niepoprawny login lub has³o");
            request.getRequestDispatcher("/jsp/logowanie.jsp").forward(request,response);
        }
	}

}
