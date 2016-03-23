package br.com.jsp.models;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository;

	@Override
	public List<Produto> obterTodos() {
		return produtoRepository.obterTodos();
	}

	@Override
	public Produto obterPorId(long id) {
		return produtoRepository.obterPorId(id);
	}

	@Override
	public List<Produto> obterPorCategoria(long id) {
		return produtoRepository.obterPorCategoria(id);
	}

}
