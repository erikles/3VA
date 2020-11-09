package repositorios;
import java.util.ArrayList;
import java.util.List;

import entidades.OrdemServico;

public class RepositorioOrdemServico {

	private List<OrdemServico> repoOS = new ArrayList<OrdemServico>();

	public List<OrdemServico> localizarTodos() {
		List<OrdemServico> list = new ArrayList<OrdemServico>();
		for (OrdemServico os : repoOS) {
			list.add(os);
		}
		return list;
	}

	public boolean inserir(OrdemServico os) {
		if(repoOS.add(os)) {
			return true;
		}
		return false;
	}

	public boolean deletar(OrdemServico os) {
		if(repoOS.remove(os)) {
			return true;
		}
		return false;
	}


	private void updateOS(OrdemServico osAtualizada, OrdemServico os) {
		osAtualizada.setCliente(os.getCliente());
		
	}

}