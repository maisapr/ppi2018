package agenda.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agenda.daos.ContatoDAO;
import agenda.models.Contato;

@WebServlet("/adicionarContato")

public class adicionarContatoServelet extends HttpServlet {

	private static final String Try = null;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String dataEmTexto = request.getParameter("DataNascimento");

		Calendar datafinal = null;

		Date dataProvisoria;
		try {
			dataProvisoria = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			datafinal = Calendar.getInstance();
			datafinal.setTime(dataProvisoria);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(datafinal);

		ContatoDAO dao = new ContatoDAO();
		dao.inserir(contato);
		RequestDispatcher rd =request.getRequestDispatcher("contato adicionado.jsp");
		rd.forward(request, response);
	}

}
