package br.com.jsp.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void cadastrar(Cliente c) {
		clienteRepository.inserir(c);
	}

}
