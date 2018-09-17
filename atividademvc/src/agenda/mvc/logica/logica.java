package agenda.mvc.logica;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface logica {

	String executa(HttpServletRequest request, HttpServletResponse response);


}
