package pl.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.models.Samochod;

/**
 * Servlet implementation class Logowanie
 */
@WebServlet("/Komis")
public class Komis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Komis() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		Samochod car = new Samochod();
    		List<Samochod> carList = car.getCars();
    		request.setAttribute("lista", carList);
    		request.getRequestDispatcher("/jsp/listaAut.jsp").forward(request,response);
    }
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		String make = request.getParameter("make");
	
		      System.out.println(make );
		     	Samochod car = new Samochod();
	        	car.setMake(make);
	        	List<Samochod> lista = new ArrayList<>();
	        	List<Samochod> carList = car.getCars();
	        	boolean isAuthorized = false;
	        	for (Samochod samochod : carList) {
					System.out.println(samochod.getMake());
	        		if(samochod.getMake().equals(make) )
					{
						isAuthorized = true;
						lista.add(samochod);
						
					}
				}
	        	if(isAuthorized)
	        	{
	        		request.setAttribute("lista", lista);
	        		request.getRequestDispatcher("/jsp/listaAut.jsp").forward(request,response);
	        		
	        	} else {
	                request.setAttribute("error", "Nie ma takiego samochodu ");
	                request.getRequestDispatcher("/jsp/listaAut.jsp").forward(request,response);
	        	}
	}
	
}
