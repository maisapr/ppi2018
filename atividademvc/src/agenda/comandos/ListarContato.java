package agenda.comandos;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.daos.ContatoDAO;
import agenda.models.Contato;
import agenda.mvc.logica.logica;


public class ListarContato implements logica{

	
 @Override
 
 		public String executa	(HttpServletRequest request, HttpServletResponse response) {
	
	 return "lista.jsp";
			
		
		
}
}