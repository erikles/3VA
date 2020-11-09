package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;

public class RepositorioCliente implements IRepositorio<Cliente> {

	private List<Cliente> clientes = new ArrayList<Cliente>();

	@Override
	public Cliente localizar(String cpf) {
		Cliente obj = null;
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				obj = cliente;
				break;
			}
		}
		return obj;
	}

	@Override
	public List<Cliente> localizarTodos() {
		return clientes;
	}

	@Override
	public boolean inserir(Cliente cliente) {
		clientes.add(cliente);
		return true;
	}

}
