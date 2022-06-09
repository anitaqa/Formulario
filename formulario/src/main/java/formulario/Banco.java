package formulario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<Usuario> lista = new ArrayList<Usuario>();
	
	
	static {
		Usuario usuario = new Usuario();
		
		usuario.setNome("Anita");
		usuario.setWhatsApp("11 971716202");
		
		
	}
	public void adiciona(Usuario usuario) {
		
		lista.add(usuario);
		
		
	}

}
