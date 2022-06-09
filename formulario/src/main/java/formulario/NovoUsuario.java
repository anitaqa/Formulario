package formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novoUsuario")
public class NovoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String nomeUsuario = request.getParameter("nome");
		String whatsApp = request.getParameter("whatsApp");
		
		// caso não preencha é para ficar em branco	
		if(nomeUsuario.isBlank()) {
			
			PrintWriter out = response.getWriter();
			out.println("<html><body><h1>Campo Nome em branco</h1></body></html>");
					
		}else {
		
		
		// criar construtor do usuario
		Usuario usuario = new Usuario();
		
		//criar o ponteiro e criar o metodo incluir
		usuario.setNome(nomeUsuario);
		usuario.setWhatsApp(whatsApp);
		
		
		//criar construtor do banco
		Banco banco = new Banco();
		banco.adiciona(usuario);
		
			
		request.setAttribute("usuarios", usuario.getNome());
		request.setAttribute("whatsapp", usuario.getWhatsApp());
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Cadastro realizado com sucesso</h1></body></html>");
		
		
		System.out.println("Usuario cadastrado com suscesso " + usuario.getNome());
		System.out.println("Whatsapp cadastrado com sucesso " + usuario.getWhatsApp());
		
		
		}
		
		
	}

}
