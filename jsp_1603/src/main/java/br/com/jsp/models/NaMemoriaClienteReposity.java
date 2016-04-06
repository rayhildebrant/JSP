package br.com.jsp.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class NaMemoriaClienteReposity implements ClienteRepository {
	
	private static List<Cliente> clientes = new ArrayList<Cliente>(1);

	@Override
	public void inserir(Cliente cliente) {
		Long novoId;
		
		if (clientes.size() > 0) {
			Comparator<Cliente> cmp;
			cmp = Comparator.comparing(Cliente::getId);
			novoId = clientes.stream()
							 .max(cmp)
							 .get()
							 .getId() +1;
		} else {
			novoId = 1L;
		}
		cliente.setId(novoId);
		clientes.add(cliente);
	}
	
}
