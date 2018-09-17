package agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.mvc.logica.logica;

public class ServletMvc extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro = request.getParameter("logica");
		String nomeDaClasse = "br.com.caelum.mvc.logica." + parametro;
		try {
		Class classe = Class.forName(nomeDaClasse);
		logica logica = (logica) classe.newInstance();
		String pagina = logica.executa(request, response);
		request.getRequestDispatcher(pagina).forward(request, response);
		} catch (Exception e) {
		throw new ServletException(
		"A lógica de negócios causou uma exceção", e);
		}
	}
		

	}

