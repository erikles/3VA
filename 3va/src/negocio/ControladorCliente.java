package negocio;

import java.util.List;

import entidades.Cliente;
import repositorios.RepositorioCliente;

public class ControladorCliente {
	private static ControladorCliente instancia;
	private RepositorioCliente reCliente;
	
	private ControladorCliente() {
		reCliente= new RepositorioCliente();
	}
	
	public static ControladorCliente getInstancia() {
		if ( instancia == null  )
			instancia= new ControladorCliente();
		return instancia;
	}
	
    public boolean inserir(Cliente cliente) {
    	return reCliente.inserir( cliente );
    }
    
	public Cliente localizar(String cpf) {
		return reCliente.localizar(cpf);
	}

	public List<Cliente> localizarTodos() {
		return reCliente.localizarTodos();
	} 
	
}
